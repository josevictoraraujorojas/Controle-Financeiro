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
    private JpanelPrincipal principal;
    private GuiTela tela;

    public ControlePrincipal(JpanelPrincipal principal, GuiTela tela, Usuario usuario) {
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
        principal.getPizza().setValue("metas",usuario.getCarteira().getLimiteMetas());
        principal.getPizza().setValue("despesas fixas",usuario.getCarteira().getLimiteDespesaFixa());
        principal.getPizza().setValue("despesas variaveis",usuario.getCarteira().getLimiteDespesaVariavel());
    }
    public void iniciaGraficoBarra(){
        MetasDAO metasDAO = new MetasDAO();
        DespesaVariavelDAO despesaVariavelDAO = new DespesaVariavelDAO();
        DespesaFixaDAO despesaFixaDAO = new DespesaFixaDAO();

        double totalDespesaVariavel = despesaVariavelDAO.somaDespesaVariavel(usuario.getId());
        double totalDespesaFixa =despesaFixaDAO.somaDespesaFixa(usuario.getId());
        double totalMetas = metasDAO.somaMetas(usuario.getId());

        principal.getBarra().clear();
        principal.getBarra().addValue( totalMetas, "Metas","metas");
        principal.getBarra().addValue( totalDespesaVariavel, "despesas fixas","despesas fixas" );
        principal.getBarra().addValue( totalDespesaFixa, "despesas variaveis","despesas variaveis" );

        CategoryPlot plot = (CategoryPlot) principal.getGraficoBarra().getPlot();

        // aumenta o grafico de barra para o valor total
        plot.getRangeAxis().setRange(0, usuario.getSaldo());
        plot.clearRangeMarkers();

        //aponato o limite das metas no grafico de barra
        // Limite para metas
        ValueMarker markerMetas = new ValueMarker(usuario.getCarteira().getLimiteMetas());
        markerMetas.setPaint(Color.RED);
        markerMetas.setStroke(new BasicStroke(3f)); // Defina a largura desejada
        plot.addRangeMarker(markerMetas);

        //aponato o limite das despesas fixas no grafico de barra

        ValueMarker markerDespesasFixas = new ValueMarker(usuario.getCarteira().getLimiteDespesaFixa());
        markerDespesasFixas.setPaint(Color.blue);
        markerDespesasFixas.setStroke(new BasicStroke(3f)); // Defina a largura desejada
        plot.addRangeMarker(markerDespesasFixas);

        //aponato o limite das despesas variaveis no grafico de barra

        ValueMarker markerDespesasVariaveis = new ValueMarker(usuario.getCarteira().getLimiteDespesaVariavel());
        markerDespesasVariaveis.setPaint(Color.green);
        markerDespesasVariaveis.setStroke(new BasicStroke(3f)); // Defina a largura desejada
        plot.addRangeMarker(markerDespesasVariaveis);
    }
    public void listarMetas(){
        MetasDAO metasDAO = new MetasDAO();
        usuario.getCarteira().setListaMetas(metasDAO.listarMPeloID(usuario.getId()));
        principal.getListaModeloMetas().clear();
        principal.getListaModeloMetas().addAll(usuario.getCarteira().getListaMetas());
    }
    public void listarDespesasFixa(){
        DespesaFixaDAO despesaFixaDAO = new DespesaFixaDAO();
        usuario.getCarteira().setListaDespesaFixa(despesaFixaDAO.listarDFPeloID(usuario.getId()));
        principal.getListaModeloDespesasFixa().clear();
        principal.getListaModeloDespesasFixa().addAll(usuario.getCarteira().getListaDespesaFixa());
    }
    public void listarDespesasVariavel(){
        DespesaVariavelDAO despesaVariavelDAO = new DespesaVariavelDAO();
        usuario.getCarteira().setListaDespesaVariavel(despesaVariavelDAO.listarDVPeloID(usuario.getId()));
        principal.getListaModeloDespesasVariavel().clear();
        principal.getListaModeloDespesasVariavel().addAll(usuario.getCarteira().getListaDespesaVariavel());
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
