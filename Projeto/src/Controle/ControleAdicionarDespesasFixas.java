package Controle;

import Visao.GuiAdicionarDespesasFixas;

import javax.swing.*;

public class ControleAdicionarDespesasFixas {
    GuiAdicionarDespesasFixas tela;

    public ControleAdicionarDespesasFixas(GuiAdicionarDespesasFixas tela) {
        this.tela = tela;
        iniciaTela();
    }

    public void iniciaTela(){
        this.tela.setVisible(true);
        this.tela.setSize(500,500);
        this.tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
