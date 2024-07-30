package Controle;

import DAO.MetasDAO;
import Modelo.Metas;
import Visao.GuiAdicionarMetas;

import javax.swing.*;

public class ControleAdicionarMetas {
    GuiAdicionarMetas tela;
    MetasDAO metasDAO = new MetasDAO();


    public ControleAdicionarMetas(GuiAdicionarMetas tela) {
        this.tela = tela;
        iniciaTela();
    }
    public void iniciaTela(){
        this.tela.setVisible(true);
        this.tela.setSize(500,500);
        this.tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

}
