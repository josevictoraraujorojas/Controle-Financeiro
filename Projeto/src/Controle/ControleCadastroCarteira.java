package Controle;

import Visao.GuiTela;
import Visao.JpanelCadastroCarteira;
import Visao.JpanelMenu;

import java.awt.*;

public class ControleCadastroCarteira {
    JpanelCadastroCarteira cadastroCarteira;
    GuiTela tela;
    ControleCadastro cadastro;

    public ControleCadastroCarteira(JpanelCadastroCarteira cadastroCarteira, GuiTela tela, ControleCadastro cadastro) {
        this.cadastroCarteira = cadastroCarteira;
        this.tela = tela;
        this.cadastro = cadastro;
    }

    public void mostrar(){
        tela.getFundo().add(cadastroCarteira,new GridBagConstraints());
        this.tela.revalidate();
        this.tela.repaint();
        iniciaControle();
    }

    public void limpar(){
        this.tela.getFundo().remove(cadastroCarteira);
        this.tela.revalidate();
        this.tela.repaint();
    }

    public void ocultar(){
        this.cadastroCarteira.setVisible(false);
    }

    public void revelar(){
        this.cadastroCarteira.setVisible(true);
    }

    public void iniciaControle(){
        cadastroCarteira.getCancelar().addActionListener(e -> acessaCancelar());
        cadastroCarteira.getCadastrar().addActionListener(e -> acessaCadastrar() );
    }

    public void acessaCadastrar(){
        this.limpar();
        cadastro.limpar();
        ControleMenu menu = new ControleMenu(tela,new JpanelMenu());
    }

    public void acessaCancelar(){
        this.ocultar();
        cadastro.revelar();
    }


}
