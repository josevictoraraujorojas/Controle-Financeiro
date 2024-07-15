package Visao;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.text.ParseException;
import java.util.Objects;

public class GuiDetalheDespesasFixas extends JFrame {
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
    private BotaoArredondado editar;
    private GridBagConstraints editarC;
    private BotaoArredondado salvar;
    private GridBagConstraints salvarC;
    private BotaoArredondado excluir;
    private GridBagConstraints excluirC;

    public GuiDetalheDespesasFixas() throws ParseException {
        super("detalhe despesas fixas");
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

        editarC = new GridBagConstraints();
        editarC.insets = new Insets(50, 0, 0, 0);

        salvarC = new GridBagConstraints();
        salvarC.insets = new Insets(50, 0, 0, 0);

        excluirC = new GridBagConstraints();
        excluirC.insets = new Insets(50, 0, 0, 0);

        menuAdicionar = new JPanelComImagemDeFundo(Objects.requireNonNull(getClass().getResource("Imagem\\fundo-quadrado-azul-para-cartaz-de-banner-anuncio-de-midia-social-evento-e-varios-trabalhos-de-design_7954-52368.jpg")));
        menuAdicionar.setLayout(new GridBagLayout());
        add(menuAdicionar,menuAdicionarC);

        textoCategoria = new JLabel("categoria:");
        menuAdicionar.add(textoCategoria,textoCategoriaC);

        categoria = new JTextFieldArredondado();
        categoria.setColumns(10);
        categoria.setEditable(false);
        categoria.setBackground(Color.white);
        menuAdicionar.add(categoria,categoriaC);

        textoDataEmicao = new JLabel("data emicao:");
        menuAdicionar.add(textoDataEmicao,textoDataEmicaoC);

        dataEmicao = new JFormattedTextFieldArredondado(data);
        dataEmicao.setText("000000");
        dataEmicao.setEditable(false);
        dataEmicao.setBackground(Color.white);
        menuAdicionar.add(dataEmicao,dataEmicaoC);

        textoDataVencimento = new JLabel("data vencimento:");
        menuAdicionar.add(textoDataVencimento,textoDataVencimentoC);

        dataVencimento= new JFormattedTextFieldArredondado(data);
        dataVencimento.setText("000000");
        dataVencimento.setEditable(false);
        dataVencimento.setBackground(Color.white);
        menuAdicionar.add(dataVencimento,dataVencimentoC);

        textoDescricao = new JLabel("Descricao:");
        menuAdicionar.add(textoDescricao,textoDescricaoC);

        descricao = new JTextAreaArredondado();
        descricao.setColumns(10);
        descricao.setRows(2);
        descricao.setEditable(false);
        descricao.setBackground(Color.white);
        menuAdicionar.add(descricao,descricaoC);

        textoValorMensal = new JLabel("valor mensal:");
        menuAdicionar.add(textoValorMensal,textoValorMensalC);

        valorMensal = new JTextFieldArredondado();
        valorMensal.setColumns(10);
        valorMensal.setEditable(false);
        valorMensal.setBackground(Color.white);
        menuAdicionar.add(valorMensal,valorMensalC);

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

        excluir = new BotaoArredondado();
        excluir.setText("excluir");
        excluir.setBackground(Color.red);
        menuAdicionar.add(excluir,excluirC);



    }
}
