package Controle;

import DAO.UsuarioDAO;
import Modelo.Usuario;
import Visao.GuiTela;
import Visao.JpanelCadastro;
import Visao.JpanelCadastroCarteira;
import Visao.JpanelLogin;

import javax.swing.*;
import java.awt.*;

public class ControleCadastro {
    private JpanelCadastro cadastro;
    private GuiTela tela;
    private ControleLogin login;
    private ControleCadastroCarteira controleCadastroCarteira;

    public ControleCadastro(){

    }

    public ControleCadastro(JpanelCadastro cadastro, GuiTela tela) {
        this.cadastro = cadastro;
        this.tela = tela;
        login = new ControleLogin(new JpanelLogin(),tela);
        iniciaControle();
    }

    public void mostrar(){
        tela.getFundo().add(cadastro,new GridBagConstraints());
        this.tela.revalidate();
        this.tela.repaint();
    }

    public void ocultar(){
        this.cadastro.setVisible(false);
    }
    public void revelar(){
        this.cadastro.setVisible(true);
    }

    public void limpar(){
        this.tela.getFundo().remove(cadastro);
        this.tela.revalidate();
        this.tela.repaint();
    }

    public void iniciaControle(){
        cadastro.getCadastrar().addActionListener(e ->acessaCadastrar());
        cadastro.getCancelar().addActionListener(e ->acessaCancelar());
    }

    public void acessaCadastrar(){

        Usuario usuario = new Usuario();

        usuario.setLogin(String.valueOf(cadastro.getLogin().getText()));
        usuario.setSenha(String.valueOf(cadastro.getSenha().getText()));
        String Saldo = String.valueOf(cadastro.getSaldo().getText());
        usuario.setSaldo(Double.valueOf(Saldo));
        ocultar();
        controleCadastroCarteira = new ControleCadastroCarteira(new JpanelCadastroCarteira(),tela,this,usuario);
        controleCadastroCarteira.mostrar();
    }

    public void acessaCancelar(){
        limpar();
        if (controleCadastroCarteira!=null) {
            controleCadastroCarteira.limpar();
        }
        login.mostrar();
    }
}
