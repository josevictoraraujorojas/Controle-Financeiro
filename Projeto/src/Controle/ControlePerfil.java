package Controle;

import DAO.UsuarioDAO;
import Modelo.Usuario;
import Visao.GuiTela;
import Visao.JpanelPerfil;

import java.awt.*;

public class ControlePerfil {
    private Usuario usuario;
    private JpanelPerfil perfil;
    private GuiTela tela;

    public ControlePerfil(JpanelPerfil perfil, GuiTela tela, Usuario usuario) {
        this.usuario = usuario;
        this.perfil = perfil;
        this.tela = tela;
        iiniciaControle();
    }
    public void mostrar(){
        this.tela.getFundo().add(this.perfil,new GridBagConstraints());
        this.tela.revalidate();
        this.tela.repaint();
        this.perfil.getLogin().setText(usuario.getLogin());
        this.perfil.getSenha().setText(usuario.getSenha());
        this.perfil.getSaldo().setText(String.valueOf(usuario.getSaldo()));
        this.perfil.getLimiteDespesasFixas().setText(String.valueOf(usuario.getCarteira().getLimiteDespesaFixa()));
        this.perfil.getLimiteDespesasVariaveis().setText(String.valueOf(usuario.getCarteira().getLimiteDespesaVariavel()));
        this.perfil.getLimiteMetas().setText(String.valueOf(usuario.getCarteira().getLimiteMetas()));
    }
    public void iiniciaControle(){

        this.perfil.getEditar().addActionListener(e->acessaEditar());

        this.perfil.getSalvar().addActionListener(e->acessaSalvar());
    }
    public void acessaEditar(){
        this.perfil.getSenha().setEditable(true);
        this.perfil.getSaldo().setEditable(true);
        this.perfil.getLimiteDespesasFixas().setEditable(true);
        this.perfil.getLimiteDespesasVariaveis().setEditable(true);
        this.perfil.getLimiteMetas().setEditable(true);
    }
    public void acessaSalvar(){
        usuario.setSenha(this.perfil.getSenha().getText());
        usuario.setSaldo(Double.parseDouble(this.perfil.getSaldo().getText()));
        usuario.getCarteira().setLimiteDespesaFixa(Double.parseDouble(this.perfil.getLimiteDespesasFixas().getText()));
        usuario.getCarteira().setLimiteDespesaVariavel(Double.parseDouble(this.perfil.getLimiteDespesasVariaveis().getText()));
        usuario.getCarteira().setLimiteMetas(Double.parseDouble(this.perfil.getLimiteMetas().getText()));

        UsuarioDAO usuarioDAO = new UsuarioDAO();
        usuarioDAO.updateUsuarioCarteira(usuario);


    }
    public void limpar(){
        this.tela.getFundo().remove(perfil);
        this.tela.revalidate();
        this.tela.repaint();
    }
}
