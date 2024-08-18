package Visao;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.text.ParseException;

public class GuiAdicionarDespesasFixas extends JFrame {
    private JPanelComImagemDeFundo menuAdicionar;
    private GridBagConstraints menuAdicionarC;
    private JLabel textoCategoria;
    private GridBagConstraints textoCategoriaC;
    private JTextFieldArredondado categoria;
    private GridBagConstraints categoriaC;
    private JLabel textoDataEmicao;
    private GridBagConstraints textoDataEmicaoC;
    private JFormattedTextFieldArredondado dataEmicao;
    private GridBagConstraints dataEmicaoC;
    private JLabel textoDataVencimento;
    private GridBagConstraints textoDataVencimentoC;
    private JFormattedTextFieldArredondado dataVencimento;
    private GridBagConstraints dataVencimentoC;
    private JLabel textoDescricao;
    private GridBagConstraints textoDescricaoC;
    private JTextAreaArredondado descricao;
    private GridBagConstraints descricaoC;
    private JLabel textoValorMensal;
    private GridBagConstraints textoValorMensalC;
    private JTextFieldArredondado valorMensal;
    private GridBagConstraints valorMensalC;
    private JLabel textoRecorrencia;
    private GridBagConstraints textoRecorrenciaC;
    private JTextFieldArredondado recorrencia;
    private GridBagConstraints recorrenciaC;
    private BotaoArredondado adicionar;
    private GridBagConstraints adicionarC;
    private BotaoArredondado cancelar;
    private GridBagConstraints cancelarC;

    public GuiAdicionarDespesasFixas() throws ParseException {
        super("adicionar despesas fixas");
        setLayout(new GridBagLayout());
        MaskFormatter data = new MaskFormatter("##/##/####");


        menuAdicionarC = new GridBagConstraints();
        menuAdicionarC.weighty = 1.0;
        menuAdicionarC.weightx = 1.0;
        menuAdicionarC.fill = GridBagConstraints.BOTH;

        textoCategoriaC = new GridBagConstraints();

        categoriaC = new GridBagConstraints();
        categoriaC.ipadx=100;
        categoriaC.ipady=20;
        categoriaC.gridwidth=GridBagConstraints.REMAINDER;

        textoDataEmicaoC = new GridBagConstraints();
        textoDataEmicaoC.insets = new Insets(50, 0, 0, 0);

        dataEmicaoC = new GridBagConstraints();
        dataEmicaoC.insets = new Insets(50, 0, 0, 0);
        dataEmicaoC.ipadx=100;
        dataEmicaoC.ipady=20;
        dataEmicaoC.gridwidth=GridBagConstraints.REMAINDER;

        textoDataVencimentoC = new GridBagConstraints();
        textoDataVencimentoC.insets = new Insets(50, 0, 0, 0);

        dataVencimentoC = new GridBagConstraints();
        dataVencimentoC.insets = new Insets(50, 0, 0, 0);
        dataVencimentoC.ipadx=100;
        dataVencimentoC.ipady=20;
        dataVencimentoC.gridwidth=GridBagConstraints.REMAINDER;

        textoDescricaoC = new GridBagConstraints();
        textoDescricaoC.insets = new Insets(50, 0, 0, 0);

        descricaoC = new GridBagConstraints();
        descricaoC.insets = new Insets(50, 0, 0, 0);
        descricaoC.ipadx=100;
        descricaoC.ipady=20;
        descricaoC.gridwidth=GridBagConstraints.REMAINDER;

        textoValorMensalC = new GridBagConstraints();
        textoValorMensalC.insets = new Insets(50, 0, 0, 0);

        valorMensalC = new GridBagConstraints();
        valorMensalC.insets = new Insets(50, 0, 0, 0);
        valorMensalC.ipadx=100;
        valorMensalC.ipady=20;
        valorMensalC.gridwidth=GridBagConstraints.REMAINDER;

        textoRecorrenciaC = new GridBagConstraints();
        textoRecorrenciaC.insets = new Insets(50, 0, 0, 0);

        recorrenciaC = new GridBagConstraints();
        recorrenciaC.insets = new Insets(50, 0, 0, 0);
        recorrenciaC.ipadx=100;
        recorrenciaC.ipady=20;
        recorrenciaC.gridwidth=GridBagConstraints.REMAINDER;

        adicionarC = new GridBagConstraints();
        adicionarC.insets = new Insets(50, 0, 0, 0);

        cancelarC = new GridBagConstraints();
        cancelarC.insets = new Insets(50, 0, 0, 0);

        menuAdicionar = new JPanelComImagemDeFundo(getClass().getResource("Imagem\\fundo-quadrado-azul-para-cartaz-de-banner-anuncio-de-midia-social-evento-e-varios-trabalhos-de-design_7954-52368.jpg"));
        menuAdicionar.setLayout(new GridBagLayout());
        add(menuAdicionar,menuAdicionarC);

        textoCategoria = new JLabel("categoria:");
        menuAdicionar.add(textoCategoria,textoCategoriaC);

        categoria = new JTextFieldArredondado();
        categoria.setColumns(10);
        categoria.setBackground(Color.white);
        menuAdicionar.add(categoria,categoriaC);

        textoDataEmicao = new JLabel("data emicao:");
        menuAdicionar.add(textoDataEmicao,textoDataEmicaoC);

        dataEmicao = new JFormattedTextFieldArredondado(data);
        dataEmicao.setText("00/00/0000");
        dataEmicao.setBackground(Color.white);
        menuAdicionar.add(dataEmicao,dataEmicaoC);

        textoDataVencimento = new JLabel("data vencimento:");
        menuAdicionar.add(textoDataVencimento,textoDataVencimentoC);

        dataVencimento= new JFormattedTextFieldArredondado(data);
        dataVencimento.setText("00/00/0000");
        dataVencimento.setBackground(Color.white);
        menuAdicionar.add(dataVencimento,dataVencimentoC);

        textoDescricao = new JLabel("Descricao:");
        menuAdicionar.add(textoDescricao,textoDescricaoC);

        descricao = new JTextAreaArredondado();
        descricao.setColumns(10);
        descricao.setRows(2);
        descricao.setBackground(Color.white);
        menuAdicionar.add(descricao,descricaoC);

        textoValorMensal = new JLabel("valor mensal:");
        menuAdicionar.add(textoValorMensal,textoValorMensalC);

        valorMensal = new JTextFieldArredondado();
        valorMensal.setColumns(10);
        valorMensal.setBackground(Color.white);
        menuAdicionar.add(valorMensal,valorMensalC);

        textoRecorrencia = new JLabel("recorrencia:");
        menuAdicionar.add(textoRecorrencia,textoRecorrenciaC);

        recorrencia = new JTextFieldArredondado();
        recorrencia.setColumns(10);
        recorrencia.setBackground(Color.white);
        menuAdicionar.add(recorrencia,recorrenciaC);

        adicionar = new BotaoArredondado();
        adicionar.setText("adicionar");
        adicionar.setBackground(Color.GREEN);
        menuAdicionar.add(adicionar,adicionarC);

        cancelar = new BotaoArredondado();
        cancelar.setText("cancelar");
        cancelar.setBackground(Color.RED);
        menuAdicionar.add(cancelar,cancelarC);

    }

    public JPanelComImagemDeFundo getMenuAdicionar() {
        return menuAdicionar;
    }

    public void setMenuAdicionar(JPanelComImagemDeFundo menuAdicionar) {
        this.menuAdicionar = menuAdicionar;
    }

    public GridBagConstraints getMenuAdicionarC() {
        return menuAdicionarC;
    }

    public void setMenuAdicionarC(GridBagConstraints menuAdicionarC) {
        this.menuAdicionarC = menuAdicionarC;
    }

    public JLabel getTextoCategoria() {
        return textoCategoria;
    }

    public void setTextoCategoria(JLabel textoCategoria) {
        this.textoCategoria = textoCategoria;
    }

    public GridBagConstraints getTextoCategoriaC() {
        return textoCategoriaC;
    }

    public void setTextoCategoriaC(GridBagConstraints textoCategoriaC) {
        this.textoCategoriaC = textoCategoriaC;
    }

    public JTextFieldArredondado getCategoria() {
        return categoria;
    }

    public void setCategoria(JTextFieldArredondado categoria) {
        this.categoria = categoria;
    }

    public GridBagConstraints getCategoriaC() {
        return categoriaC;
    }

    public void setCategoriaC(GridBagConstraints categoriaC) {
        this.categoriaC = categoriaC;
    }

    public JLabel getTextoDataEmicao() {
        return textoDataEmicao;
    }

    public void setTextoDataEmicao(JLabel textoDataEmicao) {
        this.textoDataEmicao = textoDataEmicao;
    }

    public GridBagConstraints getTextoDataEmicaoC() {
        return textoDataEmicaoC;
    }

    public void setTextoDataEmicaoC(GridBagConstraints textoDataEmicaoC) {
        this.textoDataEmicaoC = textoDataEmicaoC;
    }

    public JFormattedTextFieldArredondado getDataEmicao() {
        return dataEmicao;
    }

    public void setDataEmicao(JFormattedTextFieldArredondado dataEmicao) {
        this.dataEmicao = dataEmicao;
    }

    public GridBagConstraints getDataEmicaoC() {
        return dataEmicaoC;
    }

    public void setDataEmicaoC(GridBagConstraints dataEmicaoC) {
        this.dataEmicaoC = dataEmicaoC;
    }

    public JLabel getTextoDataVencimento() {
        return textoDataVencimento;
    }

    public void setTextoDataVencimento(JLabel textoDataVencimento) {
        this.textoDataVencimento = textoDataVencimento;
    }

    public GridBagConstraints getTextoDataVencimentoC() {
        return textoDataVencimentoC;
    }

    public void setTextoDataVencimentoC(GridBagConstraints textoDataVencimentoC) {
        this.textoDataVencimentoC = textoDataVencimentoC;
    }

    public JFormattedTextFieldArredondado getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(JFormattedTextFieldArredondado dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public GridBagConstraints getDataVencimentoC() {
        return dataVencimentoC;
    }

    public void setDataVencimentoC(GridBagConstraints dataVencimentoC) {
        this.dataVencimentoC = dataVencimentoC;
    }

    public JLabel getTextoDescricao() {
        return textoDescricao;
    }

    public void setTextoDescricao(JLabel textoDescricao) {
        this.textoDescricao = textoDescricao;
    }

    public GridBagConstraints getTextoDescricaoC() {
        return textoDescricaoC;
    }

    public void setTextoDescricaoC(GridBagConstraints textoDescricaoC) {
        this.textoDescricaoC = textoDescricaoC;
    }

    public JTextAreaArredondado getDescricao() {
        return descricao;
    }

    public void setDescricao(JTextAreaArredondado descricao) {
        this.descricao = descricao;
    }

    public GridBagConstraints getDescricaoC() {
        return descricaoC;
    }

    public void setDescricaoC(GridBagConstraints descricaoC) {
        this.descricaoC = descricaoC;
    }

    public JLabel getTextoValorMensal() {
        return textoValorMensal;
    }

    public void setTextoValorMensal(JLabel textoValorMensal) {
        this.textoValorMensal = textoValorMensal;
    }

    public GridBagConstraints getTextoValorMensalC() {
        return textoValorMensalC;
    }

    public void setTextoValorMensalC(GridBagConstraints textoValorMensalC) {
        this.textoValorMensalC = textoValorMensalC;
    }

    public JTextFieldArredondado getValorMensal() {
        return valorMensal;
    }

    public void setValorMensal(JTextFieldArredondado valorMensal) {
        this.valorMensal = valorMensal;
    }

    public GridBagConstraints getValorMensalC() {
        return valorMensalC;
    }

    public void setValorMensalC(GridBagConstraints valorMensalC) {
        this.valorMensalC = valorMensalC;
    }

    public JLabel getTextoRecorrencia() {
        return textoRecorrencia;
    }

    public void setTextoRecorrencia(JLabel textoRecorrencia) {
        this.textoRecorrencia = textoRecorrencia;
    }

    public GridBagConstraints getTextoRecorrenciaC() {
        return textoRecorrenciaC;
    }

    public void setTextoRecorrenciaC(GridBagConstraints textoRecorrenciaC) {
        this.textoRecorrenciaC = textoRecorrenciaC;
    }

    public JTextFieldArredondado getRecorrencia() {
        return recorrencia;
    }

    public void setRecorrencia(JTextFieldArredondado recorrencia) {
        this.recorrencia = recorrencia;
    }

    public GridBagConstraints getRecorrenciaC() {
        return recorrenciaC;
    }

    public void setRecorrenciaC(GridBagConstraints recorrenciaC) {
        this.recorrenciaC = recorrenciaC;
    }

    public BotaoArredondado getAdicionar() {
        return adicionar;
    }

    public void setAdicionar(BotaoArredondado adicionar) {
        this.adicionar = adicionar;
    }

    public GridBagConstraints getAdicionarC() {
        return adicionarC;
    }

    public void setAdicionarC(GridBagConstraints adicionarC) {
        this.adicionarC = adicionarC;
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
