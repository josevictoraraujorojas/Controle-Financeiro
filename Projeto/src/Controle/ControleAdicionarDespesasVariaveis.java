package Controle;

import Visao.GuiAdicionarDespesasVariaveis;

import javax.swing.*;

public class ControleAdicionarDespesasVariaveis {
    GuiAdicionarDespesasVariaveis tela;

    public ControleAdicionarDespesasVariaveis(GuiAdicionarDespesasVariaveis tela) {
        this.tela = tela;
        iniciaTela();
    }

    public void iniciaTela(){
        this.tela.setVisible(true);
        this.tela.setSize(750,750);
        this.tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
