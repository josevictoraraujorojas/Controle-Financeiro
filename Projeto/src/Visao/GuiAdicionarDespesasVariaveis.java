package Visao;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.text.ParseException;

public class GuiAdicionarDespesasVariaveis extends JFrame {
    private JPanelComImagemDeFundo menuAdicionar;
    GridBagConstraints menuAdicionarC;
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
    private JLabel textoValor;
    private GridBagConstraints textoValorC;
    private JTextFieldArredondado valor;
    private GridBagConstraints valorC;
    private JLabel textoQuantidadeParcelas;
    private GridBagConstraints textoQuantidadeParcelasC;
    private JTextFieldArredondado quantidadeParcelas;
    private GridBagConstraints quantidadeParcelasC;
    private JLabel textoRecorrencia;
    private GridBagConstraints textoRecorrenciaC;
    private JTextFieldArredondado recorrencia;
    private GridBagConstraints recorrenciaC;
    private BotaoArredondado adicionar;
    private GridBagConstraints adicionarC;
    private BotaoArredondado cancelar;
    private GridBagConstraints cancelarC;

    public GuiAdicionarDespesasVariaveis() throws ParseException {
        super("adicionar despesas variaveis");
        setLayout(new GridBagLayout());
        MaskFormatter data = new MaskFormatter("##/##/##");


        menuAdicionarC = new GridBagConstraints();
        menuAdicionarC.weighty = 1.0;
        menuAdicionarC.weightx = 1.0;
        menuAdicionarC.fill = GridBagConstraints.BOTH;

        textoCategoriaC = new GridBagConstraints();

        categoriaC = new GridBagConstraints();
        categoriaC.ipadx=200;
        categoriaC.ipady=20;
        categoriaC.gridwidth=GridBagConstraints.REMAINDER;

        textoDataEmicaoC = new GridBagConstraints();
        textoDataEmicaoC.insets = new Insets(50, 0, 0, 0);

        dataEmicaoC = new GridBagConstraints();
        dataEmicaoC.ipadx=200;
        dataEmicaoC.ipady=20;
        dataEmicaoC.insets = new Insets(50, 0, 0, 0);
        dataEmicaoC.gridwidth=GridBagConstraints.REMAINDER;

        textoDataVencimentoC = new GridBagConstraints();
        textoDataVencimentoC.insets = new Insets(50, 0, 0, 0);

        dataVencimentoC = new GridBagConstraints();
        dataVencimentoC.ipadx=200;
        dataVencimentoC.ipady=20;
        dataVencimentoC.insets = new Insets(50, 0, 0, 0);
        dataVencimentoC.gridwidth=GridBagConstraints.REMAINDER;

        textoDescricaoC = new GridBagConstraints();
        textoDescricaoC.insets = new Insets(50, 0, 0, 0);

        descricaoC = new GridBagConstraints();
        descricaoC.ipadx=200;
        descricaoC.ipady=20;
        descricaoC.insets = new Insets(50, 0, 0, 0);
        descricaoC.gridwidth=GridBagConstraints.REMAINDER;

        textoValorC = new GridBagConstraints();
        textoValorC.insets = new Insets(50, 0, 0, 0);

        valorC = new GridBagConstraints();
        valorC.ipadx=200;
        valorC.ipady=20;
        valorC.insets = new Insets(50, 0, 0, 0);
        valorC.gridwidth=GridBagConstraints.REMAINDER;

        textoQuantidadeParcelasC = new GridBagConstraints();
        textoQuantidadeParcelasC.insets = new Insets(50, 0, 0, 0);

        quantidadeParcelasC = new GridBagConstraints();
        quantidadeParcelasC.ipadx=200;
        quantidadeParcelasC.ipady=20;
        quantidadeParcelasC.insets = new Insets(50, 0, 0, 0);
        quantidadeParcelasC.gridwidth=GridBagConstraints.REMAINDER;

        textoRecorrenciaC = new GridBagConstraints();
        textoRecorrenciaC.insets = new Insets(50, 0, 0, 0);

        recorrenciaC = new GridBagConstraints();
        recorrenciaC.ipadx=200;
        recorrenciaC.ipady=20;
        recorrenciaC.insets = new Insets(50, 0, 0, 0);
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
        dataEmicao.setText("000000");
        dataEmicao.setBackground(Color.white);
        menuAdicionar.add(dataEmicao,dataEmicaoC);

        textoDataVencimento = new JLabel("data vencimento:");
        menuAdicionar.add(textoDataVencimento,textoDataVencimentoC);

        dataVencimento= new JFormattedTextFieldArredondado(data);
        dataVencimento.setText("000000");
        dataVencimento.setBackground(Color.white);
        menuAdicionar.add(dataVencimento,dataVencimentoC);

        textoDescricao = new JLabel("Descricao:");
        menuAdicionar.add(textoDescricao,textoDescricaoC);

        descricao = new JTextAreaArredondado();
        descricao.setColumns(10);
        descricao.setRows(2);
        descricao.setBackground(Color.white);
        menuAdicionar.add(descricao,descricaoC);

        textoValor = new JLabel("valor mensal:");
        menuAdicionar.add(textoValor,textoValorC);

        valor = new JTextFieldArredondado();
        valor.setColumns(10);
        valor.setBackground(Color.white);
        menuAdicionar.add(valor,valorC);

        textoQuantidadeParcelas = new JLabel("quantidade parcelas:");
        menuAdicionar.add(textoQuantidadeParcelas,textoQuantidadeParcelasC);

        quantidadeParcelas = new JTextFieldArredondado();
        quantidadeParcelas.setColumns(10);
        quantidadeParcelas.setBackground(Color.white);
        menuAdicionar.add(quantidadeParcelas,quantidadeParcelasC);

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
}
