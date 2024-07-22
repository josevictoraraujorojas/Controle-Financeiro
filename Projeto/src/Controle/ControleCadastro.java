package Controle;

import Visao.GuiTela;
import Visao.JpanelCadastro;
import Visao.JpanelCadastroCarteira;
import Visao.JpanelLogin;

import java.awt.*;

public class ControleCadastro {
    JpanelCadastro cadastro;
    GuiTela tela;
    ControleLogin login;
    ControleCadastroCarteira controleCadastroCarteira;


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
        ocultar();
        controleCadastroCarteira = new ControleCadastroCarteira(new JpanelCadastroCarteira(),tela,this);
        controleCadastroCarteira.mostrar();
    }

    public void acessaCancelar(){
        limpar();
        login.mostrar();
    }
}
