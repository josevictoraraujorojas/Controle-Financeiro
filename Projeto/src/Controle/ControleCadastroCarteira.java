package Controle;

import DAO.CarteiraDAO;
import DAO.LoginDAO;
import DAO.UsuarioDAO;
import Modelo.Carteira;
import Modelo.Usuario;
import Visao.GuiTela;
import Visao.JpanelCadastroCarteira;
import Visao.JpanelMenu;

import java.awt.*;

public class ControleCadastroCarteira {
    JpanelCadastroCarteira cadastroCarteira;
    GuiTela tela;
    ControleCadastro cadastro;
    Usuario usuario;

    public ControleCadastroCarteira(JpanelCadastroCarteira cadastroCarteira, GuiTela tela, ControleCadastro cadastro, Usuario usuario) {
        this.cadastroCarteira = cadastroCarteira;
        this.tela = tela;
        this.cadastro = cadastro;
        this.usuario = usuario;
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
        Carteira carteira = new Carteira();

        double saldo = this.usuario.getSaldo();
        double limiteDespesaFixa = (Double.valueOf(cadastroCarteira.getLimiteDespesasFixas().getText()) * saldo)/100;
        double limiteDespesaVariavel = (Double.valueOf(cadastroCarteira.getLimiteDespesasVariaveis().getText())*saldo)/100;
        double limiteMetas = (Double.valueOf(cadastroCarteira.getLimiteMetas().getText())*saldo)/100;

        carteira.setLimiteDespesaFixa(limiteDespesaFixa);
        carteira.setLimiteDespesaVariavel(limiteDespesaVariavel);
        carteira.setLimiteMetas(limiteMetas);
        carteira.setStatus(false);
        CarteiraDAO carteiraDAO = new CarteiraDAO();
        carteiraDAO.save(carteira,usuario);

        LoginDAO loginDAO = new LoginDAO();

        Usuario usuarioautenticado = loginDAO.autenticar(usuario.getLogin(),usuario.getSenha());


        ControleMenu menu = new ControleMenu(tela,new JpanelMenu(),usuarioautenticado);

    }

    public void acessaCancelar(){
        this.ocultar();
        cadastro.revelar();
    }

 

}
