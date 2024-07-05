package Visao;

import javax.swing.*;

public class MainCadastro {
    public static void main(String[] args) {
        Cadastro janela = new Cadastro();
        janela.setVisible(true);
        janela.setSize(1700,1000);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
}
