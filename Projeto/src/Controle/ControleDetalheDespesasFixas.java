package Controle;

import DAO.DespesaFixaDAO;
import DAO.DespesaVariavelDAO;
import Modelo.DespesaFixa;
import Modelo.DespesaVariavel;
import Visao.GuiDetalheDespesasFixas;
import Visao.GuiDetalheDespesasVariaveis;

import javax.swing.*;

public class ControleDetalheDespesasFixas {
    private GuiDetalheDespesasFixas tela;
    private DespesaFixa despesaFixa;
    private ControlePrincipal controlePrincipal;

    public ControleDetalheDespesasFixas(GuiDetalheDespesasFixas tela, DespesaFixa despesaFixas, ControlePrincipal controlePrincipal) {
        this.tela = tela;
        this.despesaFixa = despesaFixas;
        this.controlePrincipal = controlePrincipal;
        this.iniciaTela();
        iniciaControle();
    }
    public void iniciaTela(){
        this.tela.setVisible(true);
        this.tela.setSize(850,850);
        this.tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        tela.getCategoria().setText(despesaFixa.getCategoria());
        tela.getDataEmicao().setText(despesaFixa.getDataEmissao());
        tela.getDataVencimento().setText(despesaFixa.getDataDeVencimento());
        tela.getDescricao().setText(despesaFixa.getDescricao());
        tela.getValorMensal().setText(String.valueOf(despesaFixa.getValorMensal()));
        tela.getRecorrencia().setText(String.valueOf(despesaFixa.getRecorrencia()));
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
        tela.getValorMensal().setEditable(true);
        tela.getRecorrencia().setEditable(true);

    }

    public void acessaSalvar(){

        despesaFixa.setCategoria(tela.getCategoria().getText());
        despesaFixa.setDataEmissao(tela.getDataEmicao().getText());
        despesaFixa.setDataDeVencimento(tela.getDataVencimento().getText());
        despesaFixa.setDescricao(tela.getDescricao().getText());
        despesaFixa.setValorMensal(Double.parseDouble(tela.getValorMensal().getText()));
        despesaFixa.setRecorrencia(tela.getRecorrencia().getText());


        DespesaFixaDAO despesaFixaDAO = new DespesaFixaDAO();

        if (despesaFixaDAO.update(despesaFixa)==1){
            tela.dispose();
            controlePrincipal.iniciaGraficoBarra();
            controlePrincipal.listarDespesasFixa();
            JOptionPane.showMessageDialog(null," Despesa Fixa editada com sucesso!");
        }else if (despesaFixaDAO.update(despesaFixa)==2){
            JOptionPane.showMessageDialog(null," Despesa fixa não encontrada");
        }else {
            JOptionPane.showMessageDialog(null,"Falha na validação dos dados");
        }

    }

    public void acessaExcluir(){
        DespesaFixaDAO dao = new DespesaFixaDAO();
        dao.delete(despesaFixa.getIdDespesaFixa());
        tela.dispose();
        controlePrincipal.iniciaGraficoBarra();
        controlePrincipal.listarDespesasFixa();
    }
}
