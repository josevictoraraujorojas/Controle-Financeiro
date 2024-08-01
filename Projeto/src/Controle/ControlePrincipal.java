package Controle;

import Modelo.Carteira;
import Modelo.Usuario;
import Visao.*;

import java.awt.*;
import java.text.ParseException;

public class ControlePrincipal {
    private Usuario usuario;
    private Carteira carteira;
    private JpanelPrincipal principal;
    private GuiTela tela;

    public ControlePrincipal(JpanelPrincipal principal, GuiTela tela, Usuario usuario, Carteira carteira) {
        this.carteira = carteira;
        this.usuario = usuario;
        this.principal = principal;
        this.tela = tela;
        iniciaControle();
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

    public void iniciaControle(){
        principal.getAdicionarDespesasVariaveis().addActionListener(e -> {
            try {
                acessaDespesasVariaveis();
            } catch (ParseException ex) {
                throw new RuntimeException(ex);
            }
        });
        principal.getAdicionarDespesasFixas().addActionListener(e -> {
            try {
                acessaDespesasFixas();
            } catch (ParseException ex) {
                throw new RuntimeException(ex);
            }
        });
        principal.getAdicionarMetas().addActionListener(e -> {
            try {
                acessaAdicionarMetas();
            } catch (ParseException ex) {
                throw new RuntimeException(ex);
            }
        });
    }

    public void acessaDespesasVariaveis() throws ParseException {
        ControleAdicionarDespesasVariaveis despesasVariaveis = new ControleAdicionarDespesasVariaveis(new GuiAdicionarDespesasVariaveis());

    }
    public void acessaDespesasFixas() throws ParseException {
        ControleAdicionarDespesasFixas despesasFixas = new ControleAdicionarDespesasFixas(new GuiAdicionarDespesasFixas());
    }
    public void acessaAdicionarMetas() throws ParseException {
        ControleAdicionarMetas metas = new ControleAdicionarMetas(new GuiAdicionarMetas(),usuario);


    }
}
