package Controle;

import DAO.MetasDAO;
import Modelo.Metas;
import Visao.GuiDetalheMetas;

import javax.swing.*;

public class ControleDetalheMetas {
    private GuiDetalheMetas tela;
    private Metas metas;
    private ControlePrincipal controlePrincipal;

    public ControleDetalheMetas(GuiDetalheMetas tela, Metas metas, ControlePrincipal controlePrincipal) {
        this.tela = tela;
        this.metas = metas;
        this.controlePrincipal = controlePrincipal;
        this.iniciaTela();
        iniciaControle();
    }
    public void iniciaTela(){
        this.tela.setVisible(true);
        this.tela.setSize(850,850);
        this.tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        tela.getCategoria().setText(metas.getCategoria());
        tela.getDataInicial().setText(metas.getDataInicial());
        tela.getDataFinal().setText(metas.getDataFinal());
        tela.getDescricao().setText(metas.getDescricao());
        tela.getValorTotal().setText(String.valueOf(metas.getValorTotal()));
        tela.getValorArrecadado().setText(String.valueOf(metas.getValorArrecadado()));
        tela.getRecorrencia().setText(String.valueOf(metas.getRecorrencia()));
    }
    public void iniciaControle(){
        tela.getEditar().addActionListener(e->acessaEditar());
        tela.getSalvar().addActionListener(e->acessaSalvar());
        tela.getExcluir().addActionListener(e-> acessaExcluir());
    }
    public void acessaEditar(){
        tela.getCategoria().setEditable(true);
        tela.getDataInicial().setEditable(true);
        tela.getDataFinal().setEditable(true);
        tela.getDescricao().setEditable(true);
        tela.getValorTotal().setEditable(true);
        tela.getValorArrecadado().setEditable(true);
        tela.getRecorrencia().setEditable(true);

    }

    public void acessaSalvar(){

        metas.setCategoria(tela.getCategoria().getText());
        metas.setDataInicial(tela.getDataInicial().getText());
        metas.setDataFinal(tela.getDataFinal().getText());
        metas.setDescricao(tela.getDescricao().getText());
        metas.setValorTotal(Float.parseFloat(tela.getValorTotal().getText()));
        metas.setValorArrecadado(Float.parseFloat(tela.getValorArrecadado().getText()));
        metas.setRecorrencia(tela.getRecorrencia().getText());


        MetasDAO metasDAO = new MetasDAO();
        metasDAO.update(metas);

        tela.dispose();
        controlePrincipal.iniciaGraficoBarra();
        controlePrincipal.listarMetas();
    }

    public void acessaExcluir(){
        MetasDAO dao = new MetasDAO();
        dao.deleteById(metas.getIdMetas());
        tela.dispose();
        controlePrincipal.iniciaGraficoBarra();
        controlePrincipal.listarMetas();
    }
}
