package Visao;

import javax.swing.*;

public class MainPrincipal {
    public static void main(String[] args) {
        GuiPrincipal janela = new GuiPrincipal();
        janela.setVisible(true);
        janela.setSize(1700,1000);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
}
