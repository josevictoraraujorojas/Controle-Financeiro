package Controle;


import Visao.GuiTela;
import Visao.JpanelCadastro;
import Visao.JpanelLogin;
import Visao.JpanelMenu;
import javax.swing.*;
import java.awt.*;

public class ControleLogin{
    JpanelLogin login;
    GuiTela tela;

    public ControleLogin(JpanelLogin login, GuiTela tela) {
        this.login = login;
        this.tela = tela;

    }
    public void mostrar(){
        tela.getFundo().add(login,new GridBagConstraints());
        this.tela.revalidate();
        this.tela.repaint();
        this.iniciaControle();
    }
    public void inciaTela(){
        GridBagConstraints c = new GridBagConstraints();
        this.tela.setVisible(true);
        this.tela.setSize(1700,1000);
        this.tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.tela.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.tela.getFundo().add(this.login,c);
    }
    public void iniciaControle(){
        this.login.getBotaoLogin().addActionListener(e -> realizarLogin());
        this.login.getRegistrar().addActionListener(e -> realizarCadastro());
    }
    public void realizarLogin(){
        System.out.println("login:"+this.login.getLogin().getText());
        System.out.println("senha:"+this.login.getSenha().getText());
        this.tela.getFundo().remove(this.login);
        ControleMenu menu = new ControleMenu(this.tela,new JpanelMenu());
    }
    public void realizarCadastro(){
        this.tela.getFundo().remove(this.login);
        ControleCadastro cadastro = new ControleCadastro(new JpanelCadastro(),this.tela);
        cadastro.mostrar();
    }



}
