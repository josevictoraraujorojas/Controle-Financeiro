package Controle;

import Visao.GuiAdicionarDespesasFixas;

import javax.swing.*;

public class ControleDetalheDespesasFixas {
    private GuiAdicionarDespesasFixas tela;

    public ControleDetalheDespesasFixas(GuiAdicionarDespesasFixas tela) {
        this.tela = tela;
        this.iniciaTela();
    }

    public void iniciaTela(){
        this.tela.setVisible(true);
        this.tela.setSize(500,500);
        this.tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
