package Controle;

import DAO.DespesaFixaDAO;
import Modelo.DespesaFixa;
import Modelo.Usuario;
import Visao.GuiAdicionarDespesasFixas;

import javax.swing.*;

public class ControleAdicionarDespesasFixas {
    private ControlePrincipal controlePrincipal;
    private GuiAdicionarDespesasFixas tela;
    private DespesaFixaDAO despesaFixaDAO = new DespesaFixaDAO();
    private Usuario usuario;


    public ControleAdicionarDespesasFixas(GuiAdicionarDespesasFixas tela,Usuario usuario, ControlePrincipal controlePrincipal) {
        this.usuario = usuario;
        this.tela = tela;
        this.controlePrincipal = controlePrincipal;
        iniciaTela();
    }
    public void iniciaTela(){
        this.tela.setVisible(true);
        this.tela.setSize(700,700);
        this.tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        iniciaControler();

    }

    public void iniciaControler(){
        tela.getAdicionar().addActionListener(e -> adicionarMetas());
    }
    public void adicionarMetas(){
        DespesaFixa despesaFixa = new DespesaFixa();

        despesaFixa.setCategoria(tela.getCategoria().getText());
        despesaFixa.setDataEmissao(tela.getDataEmicao().getText());
        despesaFixa.setDataDeVencimento(tela.getDataVencimento().getText());
        despesaFixa.setDescricao(tela.getDescricao().getText());
        despesaFixa.setValorMensal(Double.parseDouble(tela.getValorMensal().getText()));
        despesaFixa.setRecorrencia(tela.getRecorrencia().getText());

        despesaFixaDAO.save(despesaFixa,usuario);
        controlePrincipal.iniciaGraficoBarra();
        controlePrincipal.listarDespesasFixa();
        tela.dispose();
    }

}
