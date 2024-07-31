package Controle;


import DAO.LoginDAO;
import DAO.MetasDAO;
import Modelo.Usuario;
import Visao.GuiTela;
import Visao.JpanelCadastro;
import Visao.JpanelLogin;
import Visao.JpanelMenu;
import javax.swing.*;
import java.awt.*;

public class ControleLogin{
    JpanelLogin login;
    GuiTela tela;
    LoginDAO loginDAO;

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
        this.tela.setSize(1200,1000);
        this.tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.tela.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.tela.getFundo().add(this.login,c);
    }
    public void iniciaControle(){
        this.login.getBotaoLogin().addActionListener(e -> realizarLogin());
        this.login.getRegistrar().addActionListener(e -> realizarCadastro());
    }
    public void realizarLogin(){
        String login = this.login.getLogin().getText();
        String senha = this.login.getSenha().getText();
        loginDAO = new LoginDAO();
        Usuario usuarioAutenticado = loginDAO.autenticar(login, senha);

        if (usuarioAutenticado != null) {
            this.tela.getFundo().remove(this.login);
            ControleMenu menu = new ControleMenu(this.tela,new JpanelMenu(),usuarioAutenticado);


        }else{
            JOptionPane.showMessageDialog(null,"Usuario ou senha incorreto","Erro",JOptionPane.ERROR_MESSAGE);
        }
    }
    public void realizarCadastro(){
        this.tela.getFundo().remove(this.login);
        ControleCadastro cadastro = new ControleCadastro(new JpanelCadastro(),this.tela);
        cadastro.mostrar();
    }



}
