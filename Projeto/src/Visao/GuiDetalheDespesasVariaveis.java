package Visao;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.text.ParseException;

public class GuiDetalheDespesasVariaveis extends JFrame {
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
    private JLabel textoValor;
    private GridBagConstraints textoValorC;
    private JTextFieldArredondado valor;
    private GridBagConstraints valorC;
    private JLabel textoQuantidadeParcelas;
    private GridBagConstraints textoQuantidadeParcelasC;
    private JTextFieldArredondado quantidadeParcelas;
    private GridBagConstraints quantidadeParcelasC;
    private JLabel textoQuantidadeParcelasPagas;
    private GridBagConstraints textoQuantidadeParcelasPagasC;
    private JTextFieldArredondado quantidadeParcelasPagas;
    private GridBagConstraints quantidadeParcelasPagasC;
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

    public GuiDetalheDespesasVariaveis() throws ParseException {
        super("detalhe despesas variaveis");
        setLayout(new GridBagLayout());
        MaskFormatter data = new MaskFormatter("##/##/####");


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

        textoQuantidadeParcelasPagasC = new GridBagConstraints();
        textoQuantidadeParcelasPagasC.insets = new Insets(50, 0, 0, 0);

        quantidadeParcelasPagasC = new GridBagConstraints();
        quantidadeParcelasPagasC.ipadx=200;
        quantidadeParcelasPagasC.ipady=20;
        quantidadeParcelasPagasC.insets = new Insets(50, 0, 0, 0);
        quantidadeParcelasPagasC.gridwidth=GridBagConstraints.REMAINDER;

        textoRecorrenciaC = new GridBagConstraints();
        textoRecorrenciaC.insets = new Insets(50, 0, 0, 0);

        recorrenciaC = new GridBagConstraints();
        recorrenciaC.ipadx=200;
        recorrenciaC.ipady=20;
        recorrenciaC.insets = new Insets(50, 0, 0, 0);
        recorrenciaC.gridwidth=GridBagConstraints.REMAINDER;

        editarC = new GridBagConstraints();
        editarC.insets = new Insets(50, 0, 0, 0);

        salvarC = new GridBagConstraints();
        salvarC.insets = new Insets(50, 0, 0, 0);

        excluirC = new GridBagConstraints();
        excluirC.insets = new Insets(50, 0, 0, 0);

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

        textoValor = new JLabel("valor mensal:");
        menuAdicionar.add(textoValor,textoValorC);

        valor = new JTextFieldArredondado();
        valor.setColumns(10);
        valor.setEditable(false);
        valor.setBackground(Color.white);
        menuAdicionar.add(valor,valorC);

        textoQuantidadeParcelas = new JLabel("quantidade parcelas:");
        menuAdicionar.add(textoQuantidadeParcelas,textoQuantidadeParcelasC);

        quantidadeParcelas = new JTextFieldArredondado();
        quantidadeParcelas.setColumns(10);
        quantidadeParcelas.setEditable(false);
        quantidadeParcelas.setBackground(Color.white);
        menuAdicionar.add(quantidadeParcelas,quantidadeParcelasC);

        textoQuantidadeParcelasPagas = new JLabel("quantidade parcelas pagas:");
        menuAdicionar.add(textoQuantidadeParcelasPagas,textoQuantidadeParcelasPagasC);

        quantidadeParcelasPagas = new JTextFieldArredondado();
        quantidadeParcelasPagas.setColumns(10);
        quantidadeParcelasPagas.setEditable(false);
        quantidadeParcelasPagas.setBackground(Color.white);
        menuAdicionar.add(quantidadeParcelasPagas,quantidadeParcelasPagasC);

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
        salvar.setBackground(Color.GREEN);
        menuAdicionar.add(salvar,salvarC);

        excluir = new BotaoArredondado();
        excluir.setText("excluir");
        excluir.setBackground(Color.red);
        menuAdicionar.add(excluir,excluirC);
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

    public JLabel getTextoValor() {
        return textoValor;
    }

    public void setTextoValor(JLabel textoValor) {
        this.textoValor = textoValor;
    }

    public GridBagConstraints getTextoValorC() {
        return textoValorC;
    }

    public void setTextoValorC(GridBagConstraints textoValorC) {
        this.textoValorC = textoValorC;
    }

    public JTextFieldArredondado getValor() {
        return valor;
    }

    public void setValor(JTextFieldArredondado valor) {
        this.valor = valor;
    }

    public GridBagConstraints getValorC() {
        return valorC;
    }

    public void setValorC(GridBagConstraints valorC) {
        this.valorC = valorC;
    }

    public JLabel getTextoQuantidadeParcelas() {
        return textoQuantidadeParcelas;
    }

    public void setTextoQuantidadeParcelas(JLabel textoQuantidadeParcelas) {
        this.textoQuantidadeParcelas = textoQuantidadeParcelas;
    }

    public GridBagConstraints getTextoQuantidadeParcelasC() {
        return textoQuantidadeParcelasC;
    }

    public void setTextoQuantidadeParcelasC(GridBagConstraints textoQuantidadeParcelasC) {
        this.textoQuantidadeParcelasC = textoQuantidadeParcelasC;
    }

    public JTextFieldArredondado getQuantidadeParcelas() {
        return quantidadeParcelas;
    }

    public void setQuantidadeParcelas(JTextFieldArredondado quantidadeParcelas) {
        this.quantidadeParcelas = quantidadeParcelas;
    }

    public GridBagConstraints getQuantidadeParcelasC() {
        return quantidadeParcelasC;
    }

    public void setQuantidadeParcelasC(GridBagConstraints quantidadeParcelasC) {
        this.quantidadeParcelasC = quantidadeParcelasC;
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

    public BotaoArredondado getEditar() {
        return editar;
    }

    public void setEditar(BotaoArredondado editar) {
        this.editar = editar;
    }

    public GridBagConstraints getEditarC() {
        return editarC;
    }

    public void setEditarC(GridBagConstraints editarC) {
        this.editarC = editarC;
    }

    public BotaoArredondado getSalvar() {
        return salvar;
    }

    public void setSalvar(BotaoArredondado salvar) {
        this.salvar = salvar;
    }

    public GridBagConstraints getSalvarC() {
        return salvarC;
    }

    public void setSalvarC(GridBagConstraints salvarC) {
        this.salvarC = salvarC;
    }

    public BotaoArredondado getExcluir() {
        return excluir;
    }

    public void setExcluir(BotaoArredondado excluir) {
        this.excluir = excluir;
    }

    public GridBagConstraints getExcluirC() {
        return excluirC;
    }

    public void setExcluirC(GridBagConstraints excluirC) {
        this.excluirC = excluirC;
    }

    public JLabel getTextoQuantidadeParcelasPagas() {
        return textoQuantidadeParcelasPagas;
    }

    public void setTextoQuantidadeParcelasPagas(JLabel textoQuantidadeParcelasPagas) {
        this.textoQuantidadeParcelasPagas = textoQuantidadeParcelasPagas;
    }

    public GridBagConstraints getTextoQuantidadeParcelasPagasC() {
        return textoQuantidadeParcelasPagasC;
    }

    public void setTextoQuantidadeParcelasPagasC(GridBagConstraints textoQuantidadeParcelasPagasC) {
        this.textoQuantidadeParcelasPagasC = textoQuantidadeParcelasPagasC;
    }

    public JTextFieldArredondado getQuantidadeParcelasPagas() {
        return quantidadeParcelasPagas;
    }

    public void setQuantidadeParcelasPagas(JTextFieldArredondado quantidadeParcelasPagas) {
        this.quantidadeParcelasPagas = quantidadeParcelasPagas;
    }

    public GridBagConstraints getQuantidadeParcelasPagasC() {
        return quantidadeParcelasPagasC;
    }

    public void setQuantidadeParcelasPagasC(GridBagConstraints quantidadeParcelasPagasC) {
        this.quantidadeParcelasPagasC = quantidadeParcelasPagasC;
    }
}
