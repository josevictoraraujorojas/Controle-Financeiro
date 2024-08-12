package Visao;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.text.ParseException;

public class GuiAdicionarMetas extends JFrame{
    private JPanelComImagemDeFundo menuAdicionar;
    private GridBagConstraints menuAdicionarC;
    private JLabel textoCategoria;
    private GridBagConstraints textoCategoriaC;
    private JTextFieldArredondado categoria;
    private GridBagConstraints categoriaC;
    private JLabel textoDataInicial;
    private GridBagConstraints textoDataInicialC;
    private JFormattedTextFieldArredondado dataInicial;
    private GridBagConstraints dataInicialC;
    private JLabel textoDataFinal;
    private GridBagConstraints textoDataFinalC;
    private JFormattedTextFieldArredondado dataFinal;
    private GridBagConstraints dataFinalC;
    private JLabel textoDescricao;
    private GridBagConstraints textoDescricaoC;
    private JTextAreaArredondado descricao;
    private GridBagConstraints descricaoC;
    private JLabel textoValorTotal;
    private GridBagConstraints textoValorTotalC;
    private JTextFieldArredondado valorTotal;
    private GridBagConstraints valorTotalC;
    private JLabel textoValorArrecadado;
    private GridBagConstraints textoValorArrecadadoC;
    private JTextFieldArredondado valorArrecadado;
    private GridBagConstraints valorArrecadadoC;
    private JLabel textoRecorrencia;
    private GridBagConstraints textoRecorrenciaC;
    private JTextFieldArredondado recorrencia;
    private GridBagConstraints recorrenciaC;
    private BotaoArredondado adicionar;
    private GridBagConstraints adicionarC;
    private BotaoArredondado cancelar;
    private GridBagConstraints cancelarC;

    public GuiAdicionarMetas() throws ParseException {
        super("adicionar meta");
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

        textoDataInicialC = new GridBagConstraints();
        textoDataInicialC.insets = new Insets(50, 0, 0, 0);

        dataInicialC = new GridBagConstraints();
        dataInicialC.insets = new Insets(50, 0, 0, 0);
        dataInicialC.ipadx=100;
        dataInicialC.ipady=20;
        dataInicialC.gridwidth=GridBagConstraints.REMAINDER;

        textoDataFinalC = new GridBagConstraints();
        textoDataFinalC.insets = new Insets(50, 0, 0, 0);

        dataFinalC = new GridBagConstraints();
        dataFinalC.insets = new Insets(50, 0, 0, 0);
        dataFinalC.ipadx=100;
        dataFinalC.ipady=20;
        dataFinalC.gridwidth=GridBagConstraints.REMAINDER;

        textoDescricaoC = new GridBagConstraints();
        textoDescricaoC.insets = new Insets(50, 0, 0, 0);

        descricaoC = new GridBagConstraints();
        descricaoC.insets = new Insets(50, 0, 0, 0);
        descricaoC.ipadx=100;
        descricaoC.ipady=20;
        descricaoC.gridwidth=GridBagConstraints.REMAINDER;

        textoValorTotalC = new GridBagConstraints();
        textoValorTotalC.insets = new Insets(50, 0, 0, 0);

        valorTotalC = new GridBagConstraints();
        valorTotalC.insets = new Insets(50, 0, 0, 0);
        valorTotalC.ipadx=100;
        valorTotalC.ipady=20;
        valorTotalC.gridwidth=GridBagConstraints.REMAINDER;

        textoValorArrecadadoC = new GridBagConstraints();
        textoValorArrecadadoC.insets = new Insets(50, 0, 0, 0);

        valorArrecadadoC = new GridBagConstraints();
        valorArrecadadoC.insets = new Insets(50, 0, 0, 0);
        valorArrecadadoC.ipadx=100;
        valorArrecadadoC.ipady=20;
        valorArrecadadoC.gridwidth=GridBagConstraints.REMAINDER;

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

        textoDataInicial = new JLabel("data inicial:");
        menuAdicionar.add(textoDataInicial,textoDataInicialC);

        dataInicial = new JFormattedTextFieldArredondado(data);
        dataInicial.setText("");
        dataInicial.setBackground(Color.white);
        menuAdicionar.add(dataInicial,dataInicialC);

        textoDataFinal = new JLabel("data final:");
        menuAdicionar.add(textoDataFinal,textoDataFinalC);

        dataFinal = new JFormattedTextFieldArredondado(data);
        dataFinal.setText("");
        dataFinal.setBackground(Color.white);
        menuAdicionar.add(dataFinal,dataFinalC);

        textoDescricao = new JLabel("Descricao:");
        menuAdicionar.add(textoDescricao,textoDescricaoC);

        descricao = new JTextAreaArredondado();
        descricao.setColumns(10);
        descricao.setRows(2);
        descricao.setBackground(Color.white);
        menuAdicionar.add(descricao,descricaoC);

        textoValorTotal = new JLabel("valor total:");
        menuAdicionar.add(textoValorTotal,textoValorTotalC);

        valorTotal = new JTextFieldArredondado();
        valorTotal.setColumns(10);
        valorTotal.setBackground(Color.white);
        menuAdicionar.add(valorTotal,valorTotalC);

        textoValorArrecadado = new JLabel("valor arrecadado:");
        menuAdicionar.add(textoValorArrecadado,textoValorArrecadadoC);

        valorArrecadado = new JTextFieldArredondado();
        valorArrecadado.setColumns(10);
        valorArrecadado.setBackground(Color.white);
        menuAdicionar.add(valorArrecadado,valorArrecadadoC);

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

    public JLabel getTextoDataInicial() {
        return textoDataInicial;
    }

    public void setTextoDataInicial(JLabel textoDataInicial) {
        this.textoDataInicial = textoDataInicial;
    }

    public GridBagConstraints getTextoDataInicialC() {
        return textoDataInicialC;
    }

    public void setTextoDataInicialC(GridBagConstraints textoDataInicialC) {
        this.textoDataInicialC = textoDataInicialC;
    }

    public JFormattedTextFieldArredondado getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(JFormattedTextFieldArredondado dataInicial) {
        this.dataInicial = dataInicial;
    }

    public GridBagConstraints getDataInicialC() {
        return dataInicialC;
    }

    public void setDataInicialC(GridBagConstraints dataInicialC) {
        this.dataInicialC = dataInicialC;
    }

    public JLabel getTextoDataFinal() {
        return textoDataFinal;
    }

    public void setTextoDataFinal(JLabel textoDataFinal) {
        this.textoDataFinal = textoDataFinal;
    }

    public GridBagConstraints getTextoDataFinalC() {
        return textoDataFinalC;
    }

    public void setTextoDataFinalC(GridBagConstraints textoDataFinalC) {
        this.textoDataFinalC = textoDataFinalC;
    }

    public JFormattedTextFieldArredondado getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(JFormattedTextFieldArredondado dataFinal) {
        this.dataFinal = dataFinal;
    }

    public GridBagConstraints getDataFinalC() {
        return dataFinalC;
    }

    public void setDataFinalC(GridBagConstraints dataFinalC) {
        this.dataFinalC = dataFinalC;
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

    public JLabel getTextoValorTotal() {
        return textoValorTotal;
    }

    public void setTextoValorTotal(JLabel textoValorTotal) {
        this.textoValorTotal = textoValorTotal;
    }

    public GridBagConstraints getTextoValorTotalC() {
        return textoValorTotalC;
    }

    public void setTextoValorTotalC(GridBagConstraints textoValorTotalC) {
        this.textoValorTotalC = textoValorTotalC;
    }

    public JTextFieldArredondado getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(JTextFieldArredondado valorTotal) {
        this.valorTotal = valorTotal;
    }

    public GridBagConstraints getValorTotalC() {
        return valorTotalC;
    }

    public void setValorTotalC(GridBagConstraints valorTotalC) {
        this.valorTotalC = valorTotalC;
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

    public JLabel getTextoValorArrecadado() {
        return textoValorArrecadado;
    }

    public void setTextoValorArrecadado(JLabel textoValorArrecadado) {
        this.textoValorArrecadado = textoValorArrecadado;
    }

    public GridBagConstraints getTextoValorArrecadadoC() {
        return textoValorArrecadadoC;
    }

    public void setTextoValorArrecadadoC(GridBagConstraints textoValorArrecadadoC) {
        this.textoValorArrecadadoC = textoValorArrecadadoC;
    }

    public JTextFieldArredondado getValorArrecadado() {
        return valorArrecadado;
    }

    public void setValorArrecadado(JTextFieldArredondado valorArrecadado) {
        this.valorArrecadado = valorArrecadado;
    }

    public GridBagConstraints getValorArrecadadoC() {
        return valorArrecadadoC;
    }

    public void setValorArrecadadoC(GridBagConstraints valorArrecadadoC) {
        this.valorArrecadadoC = valorArrecadadoC;
    }
}
