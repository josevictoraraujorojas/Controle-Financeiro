package Controle;

import Visao.*;

import java.awt.*;

public class ControleMenu {
    GuiTela tela;
    JpanelMenu menu;
    ControlePrincipal principal;
    ControlePerfil perfil;
    ControleLogin login;

    public ControleMenu(GuiTela tela, JpanelMenu menu) {
        this.tela = tela;
        this.menu = menu;
        this.tela.getFundo().add(this.menu,new GridBagConstraints());
        this.tela.revalidate();
        this.tela.repaint();
        principal = new ControlePrincipal(new JpanelPrincipal(),this.tela);
        principal.mostrar();
        perfil = new ControlePerfil(new JpanelPerfil(),this.tela);
        login= new ControleLogin(new JpanelLogin(),this.tela);
        this.iniciaControle();
    }
    public void limpar(){
        this.tela.getFundo().remove(menu);
        this.tela.revalidate();
        this.tela.repaint();
    }
    public void iniciaControle(){
        this.menu.getPrincipal().addActionListener(e -> acessaPrincipal());
        this.menu.getPerfil().addActionListener(e ->acessaPerfil() );
        this.menu.getSair().addActionListener(e -> acessaSair());
    }
    public void acessaPrincipal(){
        perfil.limpar();
        principal.mostrar();
    }
    public void acessaPerfil(){
        principal.limpar();
        perfil.mostrar();
    }
    public void acessaSair(){
        principal.limpar();
        perfil.limpar();
        this.limpar();
        login.mostrar();
    }
}
