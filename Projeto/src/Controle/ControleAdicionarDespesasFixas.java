package Controle;

import Visao.GuiAdicionarDespesasFixas;

import javax.swing.*;

public class ControleAdicionarDespesasFixas {
    private GuiAdicionarDespesasFixas tela;

    public ControleAdicionarDespesasFixas(GuiAdicionarDespesasFixas tela) {
        this.tela = tela;
        iniciaTela();
    }

    public void iniciaTela(){
        this.tela.setVisible(true);
        this.tela.setSize(700,700);
        this.tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
