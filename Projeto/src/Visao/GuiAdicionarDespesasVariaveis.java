package Visao;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.text.ParseException;

public class GuiAdicionarDespesasVariaveis extends JFrame {
    JPanelComImagemDeFundo menuAdicionar;
    GridBagConstraints menuAdicionarC;
    JLabel textoCategoria;
    GridBagConstraints textoCategoriaC;
    JTextFieldArredondado categoria;
    GridBagConstraints categoriaC;
    JLabel textoDataEmicao;
    GridBagConstraints textoDataEmicaoC;
    JFormattedTextField dataEmicao;
    GridBagConstraints dataEmicaoC;
    JLabel textoDataVencimento;
    GridBagConstraints textoDataVencimentoC;
    JFormattedTextField dataVencimento;
    GridBagConstraints dataVencimentoC;
    JLabel textoDescricao;
    GridBagConstraints textoDescricaoC;
    JTextArea descricao;
    GridBagConstraints descricaoC;
    JLabel textoValor;
    GridBagConstraints textoValorC;
    JTextFieldArredondado valor;
    GridBagConstraints valorC;
    JLabel textoQuantidadeParcelas;
    GridBagConstraints textoQuantidadeParcelasC;
    JTextFieldArredondado quantidadeParcelas;
    GridBagConstraints quantidadeParcelasC;
    JLabel textoRecorrencia;
    GridBagConstraints textoRecorrenciaC;
    JTextFieldArredondado recorrencia;
    GridBagConstraints recorrenciaC;
    BotaoArredondado adicionar;
    GridBagConstraints adicionarC;
    BotaoArredondado cancelar;
    GridBagConstraints cancelarC;

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

        textoValorC = new GridBagConstraints();
        textoValorC.insets = new Insets(50, 0, 0, 0);

        valorC = new GridBagConstraints();
        valorC.insets = new Insets(50, 0, 0, 0);
        valorC.ipadx=100;
        valorC.ipady=20;
        valorC.gridwidth=GridBagConstraints.REMAINDER;

        textoQuantidadeParcelasC = new GridBagConstraints();
        textoQuantidadeParcelasC.insets = new Insets(50, 0, 0, 0);

        quantidadeParcelasC = new GridBagConstraints();
        quantidadeParcelasC.insets = new Insets(50, 0, 0, 0);
        quantidadeParcelasC.ipadx=100;
        quantidadeParcelasC.ipady=20;
        quantidadeParcelasC.gridwidth=GridBagConstraints.REMAINDER;

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
        menuAdicionar.add(categoria,categoriaC);

        textoDataEmicao = new JLabel("data emicao:");
        menuAdicionar.add(textoDataEmicao,textoDataEmicaoC);

        dataEmicao = new JFormattedTextField(data);
        dataEmicao.setText("000000");
        menuAdicionar.add(dataEmicao,dataEmicaoC);

        textoDataVencimento = new JLabel("data vencimento:");
        menuAdicionar.add(textoDataVencimento,textoDataVencimentoC);

        dataVencimento= new JFormattedTextField(data);
        dataVencimento.setText("000000");
        menuAdicionar.add(dataVencimento,dataVencimentoC);

        textoDescricao = new JLabel("Descricao:");
        menuAdicionar.add(textoDescricao,textoDescricaoC);

        descricao = new JTextArea(2,10);
        menuAdicionar.add(descricao,descricaoC);

        textoValor = new JLabel("valor mensal:");
        menuAdicionar.add(textoValor,textoValorC);

        valor = new JTextFieldArredondado();
        valor.setColumns(10);
        menuAdicionar.add(valor,valorC);

        textoQuantidadeParcelas = new JLabel("quantidade parcelas:");
        menuAdicionar.add(textoQuantidadeParcelas,textoQuantidadeParcelasC);

        quantidadeParcelas = new JTextFieldArredondado();
        quantidadeParcelas.setColumns(10);
        menuAdicionar.add(quantidadeParcelas,quantidadeParcelasC);

        textoRecorrencia = new JLabel("recorrencia:");
        menuAdicionar.add(textoRecorrencia,textoRecorrenciaC);

        recorrencia = new JTextFieldArredondado();
        recorrencia.setColumns(10);
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
