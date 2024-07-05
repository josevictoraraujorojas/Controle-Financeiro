package Visao;

import javax.swing.*;

public class MainPerfil {
    public static void main(String[] args) {
        GuiPerfil janela =  new GuiPerfil();
        janela.setVisible(true);
        janela.setSize(1700,1000);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
}
