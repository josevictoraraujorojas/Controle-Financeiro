package Controle;

import DAO.DespesaFixaDAO;
import DAO.DespesaVariavelDAO;
import DAO.MetasDAO;
import Modelo.Carteira;
import Modelo.Usuario;
import Visao.*;

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
