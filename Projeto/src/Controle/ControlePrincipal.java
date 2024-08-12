package Controle;

import DAO.DespesaFixaDAO;
import DAO.DespesaVariavelDAO;
import DAO.MetasDAO;
import Modelo.*;
import Visao.*;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.ValueMarker;

import java.awt.*;
import java.text.ParseException;

public class ControlePrincipal {
    private Usuario usuario;
    private Carteira carteira;
    private JpanelPrincipal principal;
    private GuiTela tela;

    public ControlePrincipal(JpanelPrincipal principal, GuiTela tela, Usuario usuario, Carteira carteira) {
        this.carteira = carteira;
        this.usuario = usuario;
        this.principal = principal;
        this.tela = tela;
        iniciaControle();
    }
    public void mostrar(){
        tela.getFundo().add(principal,new GridBagConstraints());
        iniciaGraficoPizza();
        iniciaGraficoBarra();
        listarDespesasVariavel();
        listarMetas();
        listarDespesasFixa();
        this.tela.revalidate();
        this.tela.repaint();

    }public void iniciaGraficoPizza(){
        principal.getPizza().setValue("metas",carteira.getLimiteMetas());
        principal.getPizza().setValue("despesas fixas",carteira.getLimiteDespesaFixa());
        principal.getPizza().setValue("despesas variaveis",carteira.getLimiteDespesaVariavel());
    }
    public void iniciaGraficoBarra(){
        MetasDAO metasDAO = new MetasDAO();
        DespesaVariavelDAO despesaVariavelDAO = new DespesaVariavelDAO();
        DespesaFixaDAO despesaFixaDAO = new DespesaFixaDAO();
        principal.getBarra().clear();
        principal.getBarra().addValue( metasDAO.somaMetas(usuario.getId()), "Metas","metas");
        principal.getBarra().addValue( despesaFixaDAO.somaDespesaFixa(usuario.getId()), "despesas fixas","despesas fixas" );
        principal.getBarra().addValue( despesaVariavelDAO.somaDespesaVariavel(usuario.getId()), "despesas variaveis","despesas variaveis" );

        CategoryPlot plot = (CategoryPlot) principal.getGraficoBarra().getPlot();

        // aumenta o grafico de barra para o valor total
        plot.getRangeAxis().setRange(0, usuario.getSaldo());

        //aponato o limite das metas no grafico de barra
         // Limite para metas
        ValueMarker markerMetas = new ValueMarker(carteira.getLimiteMetas());
        markerMetas.setPaint(Color.RED);
        markerMetas.setStroke(new BasicStroke(3f)); // Defina a largura desejada
        plot.addRangeMarker(markerMetas);

        //aponato o limite das despesas fixas no grafico de barra

        ValueMarker markerDespesasFixas = new ValueMarker(carteira.getLimiteDespesaFixa());
        markerDespesasFixas.setPaint(Color.blue);
        markerDespesasFixas.setStroke(new BasicStroke(3f)); // Defina a largura desejada
        plot.addRangeMarker(markerDespesasFixas);

        //aponato o limite das despesas variaveis no grafico de barra

        ValueMarker markerDespesasVariaveis = new ValueMarker(carteira.getLimiteDespesaVariavel());
        markerDespesasVariaveis.setPaint(Color.green);
        markerDespesasVariaveis.setStroke(new BasicStroke(3f)); // Defina a largura desejada
        plot.addRangeMarker(markerDespesasVariaveis);
    }
    public void listarMetas(){
        MetasDAO metasDAO = new MetasDAO();
        principal.getListaModeloMetas().clear();
        principal.getListaModeloMetas().addAll(metasDAO.listarMPeloID(usuario.getId()));
    }
    public void listarDespesasFixa(){
        DespesaFixaDAO despesaFixaDAO = new DespesaFixaDAO();
        principal.getListaModeloDespesasFixa().clear();
        principal.getListaModeloDespesasFixa().addAll(despesaFixaDAO.listarDFPeloID(usuario.getId()));
    }
    public void listarDespesasVariavel(){
        DespesaVariavelDAO despesaVariavelDAO = new DespesaVariavelDAO();
        principal.getListaModeloDespesasVariavel().clear();
        principal.getListaModeloDespesasVariavel().addAll(despesaVariavelDAO.listarDVPeloID(usuario.getId()));
    }
    public void limpar(){
        this.tela.getFundo().remove(principal);
        this.tela.revalidate();
        this.tela.repaint();
    }

    public void iniciaControle(){
        principal.getAdicionarDespesasVariaveis().addActionListener(e -> {
            try {
                acessaDespesasVariaveis();
            } catch (ParseException ex) {
                throw new RuntimeException(ex);
            }
        });
        principal.getAdicionarDespesasFixas().addActionListener(e -> {
            try {
                acessaDespesasFixas();
            } catch (ParseException ex) {
                throw new RuntimeException(ex);
            }
        });
        principal.getAdicionarMetas().addActionListener(e -> {
            try {
                acessaAdicionarMetas();
            } catch (ParseException ex) {
                throw new RuntimeException(ex);
            }
        });
        principal.getListaDespesasFixas().addListSelectionListener(e ->{});

        principal.getListaMetas().addListSelectionListener(e ->{});

        principal.getListaDespesasVariaveis().addListSelectionListener(e -> {
            try {
                if (principal.getListaDespesasVariaveis().getSelectedValue()!=null){
                    acessaListaDespesasVariaveis();
                    principal.getListaDespesasVariaveis().clearSelection();
                }
            } catch (ParseException ignored) {
            }
        });

        principal.getListaDespesasFixas().addListSelectionListener(e -> {
            try {
                if (principal.getListaDespesasFixas().getSelectedValue()!=null){
                    acessaListaDespesasFixas();
                    principal.getListaDespesasFixas().clearSelection();
                }
            } catch (ParseException ignored) {
            }
        });
        principal.getListaMetas().addListSelectionListener(e -> {
            try {
                if (principal.getListaMetas().getSelectedValue()!=null){
                    acessaListaMetas();
                    principal.getListaMetas().clearSelection();
                }
            } catch (ParseException ignored) {
            }
        });
    }
    public void acessaListaDespesasVariaveis() throws ParseException {
        ControleDetalheDespesasVariaveis detalheDespesasVariaveis  = new ControleDetalheDespesasVariaveis(new GuiDetalheDespesasVariaveis(), (DespesaVariavel) principal.getListaDespesasVariaveis().getSelectedValue(),this);
    }

    public void acessaListaDespesasFixas() throws ParseException {
        ControleDetalheDespesasFixas detalheDespesasFixas = new ControleDetalheDespesasFixas(new GuiDetalheDespesasFixas(),(DespesaFixa) principal.getListaDespesasFixas().getSelectedValue(),this);
    }
    public void acessaListaMetas() throws ParseException {
        ControleDetalheMetas detalheMetas = new ControleDetalheMetas(new GuiDetalheMetas(),(Metas) principal.getListaMetas().getSelectedValue(),this);
    }
    public void acessaDespesasVariaveis() throws ParseException {
        ControleAdicionarDespesasVariaveis despesasVariaveis = new ControleAdicionarDespesasVariaveis(new GuiAdicionarDespesasVariaveis(),usuario,this);

    }
    public void acessaDespesasFixas() throws ParseException {
        ControleAdicionarDespesasFixas despesasFixas = new ControleAdicionarDespesasFixas(new GuiAdicionarDespesasFixas(),usuario,this);
    }
    public void acessaAdicionarMetas() throws ParseException {
        ControleAdicionarMetas metas = new ControleAdicionarMetas(new GuiAdicionarMetas(),usuario,this);
    }
}
