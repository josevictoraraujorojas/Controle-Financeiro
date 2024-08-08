package Controle;

import DAO.DespesaVariavelDAO;
import Modelo.DespesaVariavel;
import Visao.GuiDetalheDespesasVariaveis;

import javax.swing.*;

public class ControleDetalheDespesasVariaveis {
    private GuiDetalheDespesasVariaveis tela;
    private DespesaVariavel despesaVariavel;
    private ControlePrincipal controlePrincipal;

    public ControleDetalheDespesasVariaveis(GuiDetalheDespesasVariaveis tela, DespesaVariavel despesaVariavel, ControlePrincipal controlePrincipal) {
        this.tela = tela;
        this.despesaVariavel = despesaVariavel;
        this.controlePrincipal = controlePrincipal;
        this.iniciaTela();
        iniciaControle();
    }
    public void iniciaTela(){
        this.tela.setVisible(true);
        this.tela.setSize(850,850);
        this.tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        tela.getCategoria().setText(despesaVariavel.getCategoria());
        tela.getDataEmicao().setText(despesaVariavel.getDataEmissao());
        tela.getDataVencimento().setText(despesaVariavel.getDataDeVencimento());
        tela.getDescricao().setText(despesaVariavel.getDescricao());
        tela.getValor().setText(String.valueOf(despesaVariavel.getValor()));
        tela.getQuantidadeParcelas().setText(String.valueOf(despesaVariavel.getQtdParcelas()));
        tela.getQuantidadeParcelasPagas().setText(String.valueOf(despesaVariavel.getQtdParcelasPagas()));
        tela.getRecorrencia().setText(String.valueOf(despesaVariavel.getRecorrencia()));
    }
    public void iniciaControle(){
        tela.getEditar().addActionListener(e->acessaEditar());
        tela.getSalvar().addActionListener(e->acessaSalvar());
        tela.getExcluir().addActionListener(e-> acessaExcluir());
    }
    public void acessaEditar(){
        tela.getCategoria().setEditable(true);
        tela.getDataEmicao().setEditable(true);
        tela.getDataVencimento().setEditable(true);
        tela.getDescricao().setEditable(true);
        tela.getValor().setEditable(true);
        tela.getQuantidadeParcelas().setEditable(true);
        tela.getQuantidadeParcelasPagas().setEditable(true);
        tela.getRecorrencia().setEditable(true);

    }

    public void acessaSalvar(){

        despesaVariavel.setCategoria(tela.getCategoria().getText());
        despesaVariavel.setDataEmissao(tela.getDataEmicao().getText());
        despesaVariavel.setDataDeVencimento(tela.getDataVencimento().getText());
        despesaVariavel.setDescricao(tela.getDescricao().getText());
        despesaVariavel.setValor(Double.parseDouble(tela.getValor().getText()));
        despesaVariavel.setQtdParcelas((int) Double.parseDouble(tela.getQuantidadeParcelas().getText()));
        despesaVariavel.setQtdParcelasPagas(Integer.parseInt(tela.getQuantidadeParcelasPagas().getText()));
        despesaVariavel.setRecorrencia(tela.getRecorrencia().getText());

        System.out.println(despesaVariavel.getId());

        DespesaVariavelDAO despesaVariavelDAO = new DespesaVariavelDAO();
        despesaVariavelDAO.update(despesaVariavel);

        tela.dispose();
        controlePrincipal.iniciaGraficoBarra();
        controlePrincipal.listarDespesasVariavel();
    }

    public void acessaExcluir(){
        DespesaVariavelDAO dao = new DespesaVariavelDAO();
        dao.deleteById(despesaVariavel.getIdDespesaVariavel());
        tela.dispose();
        controlePrincipal.iniciaGraficoBarra();
        controlePrincipal.listarDespesasVariavel();
    }

}
