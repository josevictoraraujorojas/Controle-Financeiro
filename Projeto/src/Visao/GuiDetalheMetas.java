package Visao;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.text.ParseException;

public class GuiDetalheMetas extends JFrame{
    JPanelComImagemDeFundo menuAdicionar;
    GridBagConstraints menuAdicionarC;
    JLabel textoCategoria;
    GridBagConstraints textoCategoriaC;
    JTextFieldArredondado categoria;
    GridBagConstraints categoriaC;
    JLabel textoDataInicial;
    GridBagConstraints textoDataInicialC;
    JFormattedTextFieldArredondado dataInicial;
    GridBagConstraints dataInicialC;
    JLabel textoDataFinal;
    GridBagConstraints textoDataFinalC;
    JFormattedTextFieldArredondado dataFinal;
    GridBagConstraints dataFinalC;
    JLabel textoDescricao;
    GridBagConstraints textoDescricaoC;
    JTextAreaArredondado descricao;
    GridBagConstraints descricaoC;
    JLabel textoValorTotal;
    GridBagConstraints textoValorTotalC;
    JTextFieldArredondado valorTotal;
    GridBagConstraints valorTotalC;
    JLabel textoRecorrencia;
    GridBagConstraints textoRecorrenciaC;
    JTextFieldArredondado recorrencia;
    GridBagConstraints recorrenciaC;
    BotaoArredondado editar;
    GridBagConstraints editarC;
    BotaoArredondado salvar;
    GridBagConstraints salvarC;

    public GuiDetalheMetas() throws ParseException {
        super("detalhe meta");
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

        textoRecorrenciaC = new GridBagConstraints();
        textoRecorrenciaC.insets = new Insets(50, 0, 0, 0);

        recorrenciaC = new GridBagConstraints();
        recorrenciaC.insets = new Insets(50, 0, 0, 0);
        recorrenciaC.ipadx=100;
        recorrenciaC.ipady=20;
        recorrenciaC.gridwidth=GridBagConstraints.REMAINDER;

        editarC = new GridBagConstraints();
        editarC.insets = new Insets(50, 0, 0, 0);

        salvarC = new GridBagConstraints();
        salvarC.insets = new Insets(50, 0, 0, 0);

        menuAdicionar = new JPanelComImagemDeFundo(getClass().getResource("Imagem\\fundo-quadrado-azul-para-cartaz-de-banner-anuncio-de-midia-social-evento-e-varios-trabalhos-de-design_7954-52368.jpg"));
        menuAdicionar.setLayout(new GridBagLayout());
        add(menuAdicionar,menuAdicionarC);

        textoCategoria = new JLabel("categoria:");
        menuAdicionar.add(textoCategoria,textoCategoriaC);

        categoria = new JTextFieldArredondado();
        categoria.setColumns(10);
        categoria.setEditable(false);
        categoria.setBackground(Color.white);
        menuAdicionar.add(categoria,categoriaC);

        textoDataInicial = new JLabel("data inicial:");
        menuAdicionar.add(textoDataInicial,textoDataInicialC);

        dataInicial = new JFormattedTextFieldArredondado(data);
        dataInicial.setText("000000");
        dataInicial.setEditable(false);
        dataInicial.setBackground(Color.white);
        menuAdicionar.add(dataInicial,dataInicialC);

        textoDataFinal = new JLabel("data final:");
        menuAdicionar.add(textoDataFinal,textoDataFinalC);

        dataFinal = new JFormattedTextFieldArredondado(data);
        dataFinal.setText("000000");
        dataFinal.setEditable(false);
        dataFinal.setBackground(Color.white);
        menuAdicionar.add(dataFinal,dataFinalC);

        textoDescricao = new JLabel("Descricao:");
        menuAdicionar.add(textoDescricao,textoDescricaoC);

        descricao = new JTextAreaArredondado();
        descricao.setColumns(10);
        descricao.setRows(2);
        descricao.setEditable(false);
        descricao.setBackground(Color.white);
        menuAdicionar.add(descricao,descricaoC);

        textoValorTotal = new JLabel("valor total:");
        menuAdicionar.add(textoValorTotal,textoValorTotalC);

        valorTotal = new JTextFieldArredondado();
        valorTotal.setColumns(10);
        valorTotal.setEditable(false);
        valorTotal.setBackground(Color.white);
        menuAdicionar.add(valorTotal,valorTotalC);

        textoRecorrencia = new JLabel("recorrencia:");
        menuAdicionar.add(textoRecorrencia,textoRecorrenciaC);

        recorrencia = new JTextFieldArredondado();
        recorrencia.setColumns(10);
        recorrencia.setEditable(false);
        recorrencia.setBackground(Color.white);
        menuAdicionar.add(recorrencia,recorrenciaC);

        editar = new BotaoArredondado();
        editar.setText("editar");
        editar.setBackground(Color.YELLOW);
        menuAdicionar.add(editar,editarC);

        salvar = new BotaoArredondado();
        salvar.setText("salvar");
        salvar.setBackground(Color.green);
        menuAdicionar.add(salvar,salvarC);

    }
}
