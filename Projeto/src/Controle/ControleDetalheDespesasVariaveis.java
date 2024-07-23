package Controle;

import Visao.GuiDetalheDespesasVariaveis;

import javax.swing.*;

public class ControleDetalheDespesasVariaveis {
    GuiDetalheDespesasVariaveis tela;

    public ControleDetalheDespesasVariaveis(GuiDetalheDespesasVariaveis tela) {
        this.tela = tela;
        this.iniciaTela();
    }
    public void iniciaTela(){
        this.tela.setVisible(true);
        this.tela.setSize(500,500);
        this.tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
