package Visao;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.Border;

public class JpanelCadastroCarteira extends JPanel {

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

    public JpanelCadastroCarteira() {

        setLayout(new GridBagLayout());
        Font fonte = new Font("Serif", Font.PLAIN, 20);


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

        imagem = new JPanelComImagemDeFundo(getClass().getResource("Imagem\\imagem_tela_cadastro.png"));
        add(imagem, imagemC);

        Border borda = BorderFactory.createLineBorder(Color.black);

        menuCadastro = new JPanelComImagemDeFundo(getClass().getResource("Imagem\\fundo-quadrado-azul-para-cartaz-de-banner-anuncio-de-midia-social-evento-e-varios-trabalhos-de-design_7954-52368.jpg"));
        menuCadastro.setLayout(new GridBagLayout());
        menuCadastro.setBorder(borda);
        add(menuCadastro, menuCadastroC);

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

    public JPanelComImagemDeFundo getImagem() {
        return imagem;
    }

    public void setImagem(JPanelComImagemDeFundo imagem) {
        this.imagem = imagem;
    }

    public GridBagConstraints getImagemC() {
        return imagemC;
    }

    public void setImagemC(GridBagConstraints imagemC) {
        this.imagemC = imagemC;
    }

    public JPanelComImagemDeFundo getMenuCadastro() {
        return menuCadastro;
    }

    public void setMenuCadastro(JPanelComImagemDeFundo menuCadastro) {
        this.menuCadastro = menuCadastro;
    }

    public GridBagConstraints getMenuCadastroC() {
        return menuCadastroC;
    }

    public void setMenuCadastroC(GridBagConstraints menuCadastroC) {
        this.menuCadastroC = menuCadastroC;
    }

    public JLabel getTextoCarteira() {
        return textoCarteira;
    }

    public void setTextoCarteira(JLabel textoCarteira) {
        this.textoCarteira = textoCarteira;
    }

    public GridBagConstraints getTextoCarteiraC() {
        return textoCarteiraC;
    }

    public void setTextoCarteiraC(GridBagConstraints textoCarteiraC) {
        this.textoCarteiraC = textoCarteiraC;
    }

    public JLabel getTextoLimiteDespesasFixas() {
        return textoLimiteDespesasFixas;
    }

    public void setTextoLimiteDespesasFixas(JLabel textoLimiteDespesasFixas) {
        this.textoLimiteDespesasFixas = textoLimiteDespesasFixas;
    }

    public GridBagConstraints getTextoLimiteDespesasFixasC() {
        return textoLimiteDespesasFixasC;
    }

    public void setTextoLimiteDespesasFixasC(GridBagConstraints textoLimiteDespesasFixasC) {
        this.textoLimiteDespesasFixasC = textoLimiteDespesasFixasC;
    }

    public JTextFieldArredondado getLimiteDespesasFixas() {
        return limiteDespesasFixas;
    }

    public void setLimiteDespesasFixas(JTextFieldArredondado limiteDespesasFixas) {
        this.limiteDespesasFixas = limiteDespesasFixas;
    }

    public GridBagConstraints getLimiteDespesasFixasC() {
        return limiteDespesasFixasC;
    }

    public void setLimiteDespesasFixasC(GridBagConstraints limiteDespesasFixasC) {
        this.limiteDespesasFixasC = limiteDespesasFixasC;
    }

    public JLabel getTextoLimiteDespesasVariaveis() {
        return textoLimiteDespesasVariaveis;
    }

    public void setTextoLimiteDespesasVariaveis(JLabel textoLimiteDespesasVariaveis) {
        this.textoLimiteDespesasVariaveis = textoLimiteDespesasVariaveis;
    }

    public GridBagConstraints getTextoLimiteDespesasVariaveisC() {
        return textoLimiteDespesasVariaveisC;
    }

    public void setTextoLimiteDespesasVariaveisC(GridBagConstraints textoLimiteDespesasVariaveisC) {
        this.textoLimiteDespesasVariaveisC = textoLimiteDespesasVariaveisC;
    }

    public JTextFieldArredondado getLimiteDespesasVariaveis() {
        return LimiteDespesasVariaveis;
    }

    public void setLimiteDespesasVariaveis(JTextFieldArredondado limiteDespesasVariaveis) {
        LimiteDespesasVariaveis = limiteDespesasVariaveis;
    }

    public GridBagConstraints getLimiteDespesasVariaveisC() {
        return LimiteDespesasVariaveisC;
    }

    public void setLimiteDespesasVariaveisC(GridBagConstraints limiteDespesasVariaveisC) {
        LimiteDespesasVariaveisC = limiteDespesasVariaveisC;
    }

    public JLabel getTextoLimiteMetas() {
        return textoLimiteMetas;
    }

    public void setTextoLimiteMetas(JLabel textoLimiteMetas) {
        this.textoLimiteMetas = textoLimiteMetas;
    }

    public GridBagConstraints getTextoLimiteMetasC() {
        return textoLimiteMetasC;
    }

    public void setTextoLimiteMetasC(GridBagConstraints textoLimiteMetasC) {
        this.textoLimiteMetasC = textoLimiteMetasC;
    }

    public JTextFieldArredondado getLimiteMetas() {
        return limiteMetas;
    }

    public void setLimiteMetas(JTextFieldArredondado limiteMetas) {
        this.limiteMetas = limiteMetas;
    }

    public GridBagConstraints getLimiteMetasC() {
        return limiteMetasC;
    }

    public void setLimiteMetasC(GridBagConstraints limiteMetasC) {
        this.limiteMetasC = limiteMetasC;
    }

    public BotaoArredondado getCadastrar() {
        return cadastrar;
    }

    public void setCadastrar(BotaoArredondado cadastrar) {
        this.cadastrar = cadastrar;
    }

    public GridBagConstraints getCadastrarC() {
        return cadastrarC;
    }

    public void setCadastrarC(GridBagConstraints cadastrarC) {
        this.cadastrarC = cadastrarC;
    }

    public BotaoArredondado getCancelar() {
        return cancelar;
    }

    public void setCancelar(BotaoArredondado cancelar) {
        this.cancelar = cancelar;
    }

    public GridBagConstraints getCancelarC() {
        return cancelarC;
    }

    public void setCancelarC(GridBagConstraints cancelarC) {
        this.cancelarC = cancelarC;
    }
}
