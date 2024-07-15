package Visao;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class GuiPerfil extends JFrame {

    private JPanelComImagemDeFundo fundo;
    private GridBagConstraints fundoC;
    private JPanel menu;
    private GridBagConstraints menuC;
    private BotaoArredondado principal;
    private GridBagConstraints principalC;
    private BotaoArredondado botaoPerfil;
    private GridBagConstraints botaoPerfilC;
    private BotaoArredondado sair;
    private GridBagConstraints sairC;
    private JPanel perfil;
    private GridBagConstraints perfilC;
    private JLabel textoPerfil;
    private GridBagConstraints textoPerfilC;
    private JPanel detalheCarteira;
    private GridBagConstraints detalheCarteiraC;
    private JLabel textoLimiteDespesasFixas;
    private GridBagConstraints textoLimiteDespesasFixasC;
    private JTextFieldArredondado limiteDespesasFixas;
    private GridBagConstraints limiteDespesasFixasC;
    private JLabel textoLimiteDespesasVariaveis;
    private GridBagConstraints textoLimiteDespesasVariaveisC;
    private JTextFieldArredondado limiteDespesasVariaveis;
    private GridBagConstraints limiteDespesasVariaveisC;
    private JLabel textoLimiteMetas;
    private GridBagConstraints textoLimiteMetasC;
    private JTextFieldArredondado limiteMetas;
    private GridBagConstraints limiteMetasC;
    private JPanel detalhePessoal;
    private GridBagConstraints detalhePessoalC;
    private JLabel textoLogin;
    private GridBagConstraints textoLoginC;
    private JTextFieldArredondado login;
    private GridBagConstraints loginC;
    private JLabel textoSenha;
    private GridBagConstraints textoSenhaC;
    private JPasswordArredondado senha;
    private GridBagConstraints senhaC;
    private JLabel textoSaldo;
    private GridBagConstraints textoSaldoC;
    private JTextFieldArredondado saldo;
    private GridBagConstraints saldoC;
    private BotaoArredondado editar;
    private GridBagConstraints editarC;
    private BotaoArredondado salvar;
    private GridBagConstraints salvarC;


        public GuiPerfil() {
            super("grafico");
            setLayout(new GridBagLayout());
            Font fonte = new Font("Serif", Font.PLAIN, 20);
            Border borda = BorderFactory.createLineBorder(Color.black, 2);


            fundoC = new GridBagConstraints();
            fundoC.weighty = 1;
            fundoC.weightx = 1;
            fundoC.fill = GridBagConstraints.BOTH;

            menuC = new GridBagConstraints();
            menuC.ipadx = 50;
            menuC.ipady = 637;
            menuC.gridheight = GridBagConstraints.REMAINDER;


            principalC = new GridBagConstraints();
            principalC.gridwidth = GridBagConstraints.REMAINDER;

            botaoPerfilC = new GridBagConstraints();
            botaoPerfilC.gridwidth = GridBagConstraints.REMAINDER;
            botaoPerfilC.weighty = 1;
            botaoPerfilC.anchor = GridBagConstraints.NORTH;

            sairC = new GridBagConstraints();
            sairC.gridwidth = GridBagConstraints.REMAINDER;

            perfilC = new GridBagConstraints();
            perfilC.ipady = 215;
            perfilC.ipadx = 753;
            perfilC.gridheight = GridBagConstraints.REMAINDER;

            textoPerfilC = new GridBagConstraints();
            textoPerfilC.gridwidth = GridBagConstraints.REMAINDER;

            detalhePessoalC = new GridBagConstraints();

            textoLoginC = new GridBagConstraints();
            textoLoginC.insets = new Insets(50, 0, 0, 0);

            loginC = new GridBagConstraints();
            loginC.insets = new Insets(50, 0, 0, 0);
            loginC.ipadx=100;
            loginC.ipady=20;
            loginC.gridwidth=GridBagConstraints.REMAINDER;

            textoSenhaC = new GridBagConstraints();
            textoSenhaC.insets = new Insets(50,0,0,0);

            senhaC = new GridBagConstraints();
            senhaC.insets = new Insets(50,0,0,0);
            senhaC.ipadx=100;
            senhaC.ipady=20;
            senhaC.gridwidth=GridBagConstraints.REMAINDER;

            textoSaldoC = new GridBagConstraints();
            textoSaldoC.insets = new Insets(50,0,0,0);

            saldoC = new GridBagConstraints();
            saldoC.insets = new Insets(50,0,0,0);
            saldoC.ipadx=100;
            saldoC.ipady=20;
            saldoC.gridwidth=GridBagConstraints.REMAINDER;

            detalheCarteiraC = new GridBagConstraints();
            detalheCarteiraC.ipady=100;
            detalheCarteiraC.gridwidth = GridBagConstraints.REMAINDER;

            textoLimiteDespesasFixasC = new GridBagConstraints();
            textoLimiteDespesasFixasC.insets = new Insets(50, 0, 0, 0);

            limiteDespesasFixasC = new GridBagConstraints();
            limiteDespesasFixasC.insets = new Insets(50, 0, 0, 0);
            limiteDespesasFixasC.ipadx = 100;
            limiteDespesasFixasC.ipady = 20;
            limiteDespesasFixasC.gridwidth = GridBagConstraints.REMAINDER;

            textoLimiteDespesasVariaveisC = new GridBagConstraints();
            textoLimiteDespesasVariaveisC.insets = new Insets(50, 0, 0, 0);

            limiteDespesasVariaveisC = new GridBagConstraints();
            limiteDespesasVariaveisC.insets = new Insets(50, 0, 0, 0);
            limiteDespesasVariaveisC.ipadx = 100;
            limiteDespesasVariaveisC.ipady = 20;
            limiteDespesasVariaveisC.gridwidth = GridBagConstraints.REMAINDER;

            textoLimiteMetasC = new GridBagConstraints();
            textoLimiteMetasC.insets = new Insets(50, 0, 0, 0);

            limiteMetasC = new GridBagConstraints();
            limiteMetasC.insets = new Insets(50, 0, 0, 0);
            limiteMetasC.ipadx = 100;
            limiteMetasC.ipady = 20;
            limiteMetasC.gridwidth = GridBagConstraints.REMAINDER;


            editarC = new GridBagConstraints();
            editarC.gridx=1;
            editarC.insets=new Insets(0,0,10,0);
            editarC.anchor = GridBagConstraints.LAST_LINE_END;

            salvarC = new GridBagConstraints();
            salvarC.gridx=1;
            salvarC.anchor = GridBagConstraints.LAST_LINE_END;



            fundo = new JPanelComImagemDeFundo(getClass().getResource("Imagem\\fundo.jpg"));
            fundo.setLayout(new GridBagLayout());
            add(fundo, fundoC);

            menu = new JPanel();
            menu.setBackground(Color.decode("#82C2D4"));
            menu.setLayout(new GridBagLayout());
            menu.setBorder(borda);
            fundo.add(menu, menuC);

            principal = new BotaoArredondado();
            principal.setText("principal");
            principal.setBackground(Color.cyan);
            menu.add(principal, principalC);

            botaoPerfil = new BotaoArredondado();
            botaoPerfil.setText("perfil");
            botaoPerfil.setBackground(Color.cyan);
            menu.add(botaoPerfil, botaoPerfilC);

            sair = new BotaoArredondado();
            sair.setText("sair");
            sair.setBackground(Color.red);
            menu.add(sair, sairC);

            perfil = new JPanel();
            perfil.setBackground(Color.white);
            perfil.setLayout(new GridBagLayout());
            perfil.setBorder(borda);
            fundo.add(perfil, perfilC);

            textoPerfil = new JLabel();
            textoPerfil.setText("Informacoes do Usuario");
            textoPerfil.setFont(new Font("Serif", Font.PLAIN, 40));
            perfil.add(textoPerfil, textoPerfilC);


            detalhePessoal = new JPanel();
            detalhePessoal.setBackground(Color.white);
            detalhePessoal.setLayout(new GridBagLayout());
            perfil.add(detalhePessoal, detalhePessoalC);

            textoLogin = new JLabel("login:");
            textoLogin.setFont(fonte);
            detalhePessoal.add(textoLogin, textoLoginC);

            login = new JTextFieldArredondado();
            login.setBackground(Color.cyan);
            login.setColumns(10);
            login.setText("Jose");
            login.setFont(fonte);
            login.setEditable(false);
            detalhePessoal.add(login, loginC);

            textoSenha = new JLabel("senha:");
            textoSenha.setFont(fonte);
            detalhePessoal.add(textoSenha,textoSenhaC);


            senha = new JPasswordArredondado();
            senha.setBackground(Color.cyan);
            senha.setColumns(10);
            senha.setText("Rojas");
            senha.setFont(fonte);
            senha.setEditable(false);
            detalhePessoal.add(senha,senhaC);

            textoSaldo = new JLabel("saldo:");
            textoSaldo.setFont(fonte);
            detalhePessoal.add(textoSaldo,textoSaldoC);

            saldo = new JTextFieldArredondado();
            saldo.setBackground(Color.cyan);
            saldo.setColumns(10);
            saldo.setText("1400");
            saldo.setFont(fonte);
            saldo.setEditable(false);
            detalhePessoal.add(saldo,saldoC);

            detalheCarteira = new JPanel();
            detalheCarteira.setBackground(Color.white);
            detalheCarteira.setLayout(new GridBagLayout());
            perfil.add(detalheCarteira, detalheCarteiraC);

            textoLimiteDespesasFixas = new JLabel("despesas fixas:");
            textoLimiteDespesasFixas.setFont(fonte);
            detalheCarteira.add(textoLimiteDespesasFixas, textoLimiteDespesasFixasC);

            limiteDespesasFixas = new JTextFieldArredondado();
            limiteDespesasFixas.setBackground(Color.cyan);
            limiteDespesasFixas.setColumns(10);
            limiteDespesasFixas.setText("50%");
            limiteDespesasFixas.setFont(fonte);
            limiteDespesasFixas.setEditable(false);
            detalheCarteira.add(limiteDespesasFixas, limiteDespesasFixasC);

            textoLimiteDespesasVariaveis = new JLabel("despesas variaveis:");
            textoLimiteDespesasVariaveis.setFont(fonte);
            detalheCarteira.add(textoLimiteDespesasVariaveis, textoLimiteDespesasVariaveisC);

            limiteDespesasVariaveis = new JTextFieldArredondado();
            limiteDespesasVariaveis.setBackground(Color.cyan);
            limiteDespesasVariaveis.setColumns(10);
            limiteDespesasVariaveis.setText("30%");
            limiteDespesasVariaveis.setFont(fonte);
            limiteDespesasVariaveis.setEditable(false);
            detalheCarteira.add(limiteDespesasVariaveis, limiteDespesasVariaveisC);

            textoLimiteMetas = new JLabel("metas:");
            textoLimiteMetas.setFont(fonte);
            detalheCarteira.add(textoLimiteMetas, textoLimiteMetasC);

            limiteMetas = new JTextFieldArredondado();
            limiteMetas.setBackground(Color.cyan);
            limiteMetas.setColumns(10);
            limiteMetas.setText("20%");
            limiteMetas.setFont(fonte);
            limiteMetas.setEditable(false);
            detalheCarteira.add(limiteMetas, limiteMetasC);

            editar = new BotaoArredondado();
            editar.setText("editar");
            editar.setFont(fonte);
            editar.setBackground(Color.YELLOW);
            perfil.add(editar,editarC);

            salvar = new BotaoArredondado();
            salvar.setText("salvar");
            salvar.setFont(fonte);
            salvar.setBackground(Color.GREEN);
            perfil.add(salvar,salvarC);

        }
}




