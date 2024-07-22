package Visao;

import Controle.ControleLogin;

public class MainPrincipal {
    public static void main(String[] args) {

        ControleLogin tela = new ControleLogin(new JpanelLogin(),new GuiTela());
        tela.inciaTela();
        tela.iniciaControle();
    }
}
