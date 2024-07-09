package Visao;

import javax.swing.*;
import java.text.ParseException;

public class MainDetalheDespesasFixas {
    public static void main(String[] args) throws ParseException {
        GuiDetalheDespesasFixas janela = new GuiDetalheDespesasFixas();
        janela.setVisible(true);
        janela.setSize(1700,1000);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
}
