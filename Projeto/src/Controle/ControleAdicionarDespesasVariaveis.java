package Controle;

import Modelo.Usuario;
import Visao.GuiAdicionarDespesasVariaveis;


import javax.swing.*;



public class ControleAdicionarDespesasVariaveis {
    private GuiAdicionarDespesasVariaveis tela;
    private Usuario usuario;

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
