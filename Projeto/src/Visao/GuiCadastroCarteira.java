package Visao;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.Border;

public class GuiCadastroCarteira extends JFrame {

    private JPanelComImagemDeFundo fundo;
    private GridBagConstraints fundoC;
    private JPanelComImagemDeFundo imagem;
    private GridBagConstraints imagemC;
    private JPanelComImagemDeFundo menuCadastro;
    private GridBagConstraints menuCadastroC;
    private JLabel textoCarteira;
    private GridBagConstraints textoCarteiraC;
    private JLabel textoLimiteDespesasFixas;
    private GridBagConstraints textoLimiteDespesasFixasC;
    private JTextFieldArredondado limiteDespesasFixas;
    private GridBagConstraints limiteDespesasFixasC;
    private JLabel textoLimiteDespesasVariaveis;
    private GridBagConstraints textoLimiteDespesasVariaveisC;
    private JTextFieldArredondado LimiteDespesasVariaveis;
    private GridBagConstraints LimiteDespesasVariaveisC;
    private JLabel textoLimiteMetas;
    private GridBagConstraints textoLimiteMetasC;
    private JTextFieldArredondado limiteMetas;
    private GridBagConstraints limiteMetasC;
    private BotaoArredondado cadastrar;
    private GridBagConstraints cadastrarC;
    private BotaoArredondado cancelar;
    private GridBagConstraints cancelarC;

    public GuiCadastroCarteira() {

        setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\joaov\\Downloads\\imagem_de_fundo.jpeg"));
        setLayout(new GridBagLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 2020, 2020);
        Font fonte = new Font("Serif", Font.PLAIN, 20);

        fundoC = new GridBagConstraints();
        fundoC.weighty = 1;
        fundoC.weightx = 1;
        fundoC.fill = GridBagConstraints.BOTH;

        imagemC = new GridBagConstraints();
        imagemC.ipady = 758;
        imagemC.ipadx = 400;


        menuCadastroC = new GridBagConstraints();
        menuCadastroC.ipady = 350;
        menuCadastroC.ipadx = 245;

        textoCarteiraC = new GridBagConstraints();
        textoCarteiraC.gridwidth=GridBagConstraints.REMAINDER;

        textoLimiteDespesasFixasC = new GridBagConstraints();
        textoLimiteDespesasFixasC.insets = new Insets(50, 0, 0, 0);

        limiteDespesasFixasC = new GridBagConstraints();
        limiteDespesasFixasC.insets = new Insets(50, 0, 0, 0);
        limiteDespesasFixasC.ipadx = 100;
        limiteDespesasFixasC.ipady = 20;
        limiteDespesasFixasC.gridwidth = GridBagConstraints.REMAINDER;

        textoLimiteDespesasVariaveisC = new GridBagConstraints();
        textoLimiteDespesasVariaveisC.insets = new Insets(50, 0, 0, 0);

        LimiteDespesasVariaveisC = new GridBagConstraints();
        LimiteDespesasVariaveisC.insets = new Insets(50, 0, 0, 0);
        LimiteDespesasVariaveisC.ipadx = 100;
        LimiteDespesasVariaveisC.ipady = 20;
        LimiteDespesasVariaveisC.gridwidth = GridBagConstraints.REMAINDER;

        textoLimiteMetasC = new GridBagConstraints();
        textoLimiteMetasC.insets = new Insets(50, 0, 0, 0);

        limiteMetasC = new GridBagConstraints();
        limiteMetasC.insets = new Insets(50, 0, 0, 0);
        limiteMetasC.ipadx = 100;
        limiteMetasC.ipady = 20;
        limiteMetasC.gridwidth = GridBagConstraints.REMAINDER;

        cadastrarC = new GridBagConstraints();
        cadastrarC.insets = new Insets(50, 50, 0, 0);

        cancelarC = new GridBagConstraints();
        cancelarC.insets = new Insets(50, 50, 0, 0);

        fundo = new JPanelComImagemDeFundo(getClass().getResource("Imagem\\fundo.jpg"));
        fundo.setLayout(new GridBagLayout());
        add(fundo, fundoC);

        imagem = new JPanelComImagemDeFundo(getClass().getResource("Imagem\\imagem_tela_cadastro.png"));
        fundo.add(imagem, imagemC);

        Border borda = BorderFactory.createLineBorder(Color.black);
        menuCadastro = new JPanelComImagemDeFundo(getClass().getResource("Imagem\\fundo-quadrado-azul-para-cartaz-de-banner-anuncio-de-midia-social-evento-e-varios-trabalhos-de-design_7954-52368.jpg"));
        menuCadastro.setLayout(new GridBagLayout());
        menuCadastro.setBorder(borda);
        fundo.add(menuCadastro, menuCadastroC);

        textoCarteira = new JLabel("Cadastro Limite Da Carteira");
        textoCarteira.setFont(fonte);
        menuCadastro.add(textoCarteira, textoCarteiraC);

        textoLimiteDespesasFixas = new JLabel("despesas fixas:");
        textoLimiteDespesasFixas.setFont(fonte);
        menuCadastro.add(textoLimiteDespesasFixas, textoLimiteDespesasFixasC);

        limiteDespesasFixas = new JTextFieldArredondado();
        limiteDespesasFixas.setColumns(10);
        limiteDespesasFixas.setText("50%");
        limiteDespesasFixas.setFont(fonte);
        menuCadastro.add(limiteDespesasFixas, limiteDespesasFixasC);

        textoLimiteDespesasVariaveis = new JLabel("despesas variaveis:");
        textoLimiteDespesasVariaveis.setFont(fonte);
        menuCadastro.add(textoLimiteDespesasVariaveis, textoLimiteDespesasVariaveisC);

        LimiteDespesasVariaveis = new JTextFieldArredondado();
        LimiteDespesasVariaveis.setColumns(10);
        LimiteDespesasVariaveis.setText("30%");
        LimiteDespesasVariaveis.setFont(fonte);
        menuCadastro.add(LimiteDespesasVariaveis, LimiteDespesasVariaveisC);

        textoLimiteMetas = new JLabel("metas:");
        textoLimiteMetas.setFont(fonte);
        menuCadastro.add(textoLimiteMetas, textoLimiteMetasC);

        limiteMetas = new JTextFieldArredondado();
        limiteMetas.setColumns(10);
        limiteMetas.setText("20%");
        limiteMetas.setFont(fonte);
        menuCadastro.add(limiteMetas, limiteMetasC);

        cadastrar = new BotaoArredondado();
        cadastrar.setText("cadastrar");
        cadastrar.setBackground(Color.green);
        menuCadastro.add(cadastrar, cadastrarC);

        cancelar = new BotaoArredondado();
        cancelar.setText("voltar");
        cancelar.setBackground(Color.red);
        menuCadastro.add(cancelar, cancelarC);


    }
}
