package Controle;

import Visao.GuiDetalheMetas;

import javax.swing.*;

public class ControleDetalheMetas {
    private GuiDetalheMetas tela;

    public ControleDetalheMetas(GuiDetalheMetas tela) {
        this.tela = tela;
        this.iniciaTela();
    }
    public void iniciaTela(){
        this.tela.setVisible(true);
        this.tela.setSize(500,500);
        this.tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
