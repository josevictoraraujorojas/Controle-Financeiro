package Controle;

import DAO.CarteiraDAO;
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

    public ControlePerfil(JpanelPerfil perfil, GuiTela tela, Usuario usuario,Carteira carteira) {
        this.usuario = usuario;
        this.carteira = carteira;
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
        this.perfil.getLimiteDespesasFixas().setText(String.valueOf(carteira.getLimiteDespesaFixa()));
        this.perfil.getLimiteDespesasVariaveis().setText(String.valueOf(carteira.getLimiteDespesaVariavel()));
        this.perfil.getLimiteMetas().setText(String.valueOf(carteira.getLimiteMetas()));
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
        carteira.setLimiteDespesaFixa(Double.parseDouble(this.perfil.getLimiteDespesasFixas().getText()));
        carteira.setLimiteDespesaVariavel(Double.parseDouble(this.perfil.getLimiteDespesasVariaveis().getText()));
        carteira.setLimiteMetas(Double.parseDouble(this.perfil.getLimiteMetas().getText()));

        CarteiraDAO carteiraDAO = new CarteiraDAO();
        carteiraDAO.update(carteira,usuario);


    }
    public void limpar(){
        this.tela.getFundo().remove(perfil);
        this.tela.revalidate();
        this.tela.repaint();
    }
}
