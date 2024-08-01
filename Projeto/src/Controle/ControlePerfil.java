package Controle;

import Modelo.Carteira;
import Modelo.Usuario;
import Visao.GuiTela;
import Visao.JpanelPerfil;

import java.awt.*;

public class ControlePerfil {
    private Usuario usuario;
    private Carteira carteira;
    private JpanelPerfil perfil;
    private GuiTela tela;

    public ControlePerfil(JpanelPerfil perfil, GuiTela tela, Usuario usuario, Carteira carteira) {
        this.usuario = usuario;
        this.carteira = carteira;
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
