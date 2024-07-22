package Controle;

import Visao.GuiTela;
import Visao.JpanelPerfil;

import java.awt.*;

public class ControlePerfil {
    JpanelPerfil perfil;
    GuiTela tela;

    public ControlePerfil(JpanelPerfil perfil, GuiTela tela) {
        this.perfil = perfil;
        this.tela = tela;
    }
    public void mostrar(){
        this.tela.getFundo().add(this.perfil,new GridBagConstraints());
        this.tela.revalidate();
        this.tela.repaint();
    }
    public void limpar(){
        this.tela.getFundo().remove(perfil);
        this.tela.revalidate();
        this.tela.repaint();
    }
}
