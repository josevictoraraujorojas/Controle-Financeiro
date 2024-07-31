package Controle;

import Modelo.Usuario;
import Visao.GuiTela;
import Visao.JpanelPerfil;

import java.awt.*;

public class ControlePerfil {
    Usuario usuario;
    JpanelPerfil perfil;
    GuiTela tela;

    public ControlePerfil(JpanelPerfil perfil, GuiTela tela, Usuario usuario) {
        this.usuario = usuario;
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
