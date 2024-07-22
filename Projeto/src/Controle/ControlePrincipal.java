package Controle;

import Visao.GuiTela;
import Visao.JpanelPrincipal;

import java.awt.*;

public class ControlePrincipal {
    JpanelPrincipal principal;
    GuiTela tela;

    public ControlePrincipal(JpanelPrincipal principal, GuiTela tela) {
        this.principal = principal;
        this.tela = tela;
    }
    public void mostrar(){
        tela.getFundo().add(principal,new GridBagConstraints());
        this.tela.revalidate();
        this.tela.repaint();
    }
    public void limpar(){
        this.tela.getFundo().remove(principal);
        this.tela.revalidate();
        this.tela.repaint();
    }
}
