package Visao;

import Modelo.DespesaFixa;
import Modelo.DespesaVariavel;
import Modelo.Metas;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.ValueMarker;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;

public class JpanelPrincipal extends JPanel {


    private JPanel telaprincipal;
    private GridBagConstraints telaprincipalC;
    private JPanel painelGraficos;
    private GridBagConstraints painelGraficosC;
    private DefaultPieDataset pizza;
    private JFreeChart graficoPizza;
    private ChartPanel painelGraficoPizza;
    private GridBagConstraints painelGraficoPizzaC;
    private DefaultCategoryDataset barra;
    private JFreeChart graficoBarra;
    private ChartPanel painelGraficoBarra;
    private GridBagConstraints painelGraficoBarraC;
    private JPanel painelTexto;
    private GridBagConstraints painelTextoC;
    private JLabel textoMetas;
    private GridBagConstraints textoMetasC;
    private BotaoArredondado adicionarMetas;
    private GridBagConstraints adicionarMetasC;
    private JLabel textoDespesasFixas;
    private GridBagConstraints textoDespesasFixasC;
    private BotaoArredondado adicionarDespesasFixas;
    private GridBagConstraints adicionarDespesasFixasC;
    private JLabel textoDespesasVariaveis;
    private GridBagConstraints textoDespesasVariaveisC;
    private BotaoArredondado adicionarDespesasVariaveis;
    private GridBagConstraints adicionarDespesasVariaveisC;
    private JPanel painelLista;
    private GridBagConstraints painelListaC;
    private DefaultListModel<Metas> listaModeloMetas;
    private JList<Metas> listaMetas;
    private GridBagConstraints listaMetasC;
    private DefaultListModel<DespesaFixa> listaModeloDespesasFixa;
    private JList<DespesaFixa> listaDespesasFixas;
    private GridBagConstraints listaDespesasFixasC;
    private DefaultListModel<DespesaVariavel> listaModeloDespesasVariavel;
    private JList<DespesaVariavel> listaDespesasVariaveis;
    private GridBagConstraints listaDespesasVariaveisC;

    public JpanelPrincipal() {
        setLayout(new GridBagLayout());
        Font fonte = new Font("Serif", Font.PLAIN, 20);
        Border borda = BorderFactory.createLineBorder(Color.black, 2);

        telaprincipalC = new GridBagConstraints();
        telaprincipalC.ipady = 28;

        painelGraficosC = new GridBagConstraints();
        painelGraficosC.fill = GridBagConstraints.BOTH;
        painelGraficosC.weighty = 1.0;
        painelGraficosC.weightx = 1.0;
        painelGraficosC.gridwidth = GridBagConstraints.REMAINDER;

        painelGraficoPizzaC = new GridBagConstraints();
        painelGraficoPizzaC.fill = GridBagConstraints.BOTH;
        painelGraficoPizzaC.weightx = 1.0;
        painelGraficoPizzaC.weighty = 1.0;

        painelGraficoBarraC = new GridBagConstraints();
        painelGraficoBarraC.fill = GridBagConstraints.BOTH;
        painelGraficoBarraC.weightx = 1.0;
        painelGraficoBarraC.weighty = 1.0;

        painelTextoC = new GridBagConstraints();
        painelTextoC.fill = GridBagConstraints.BOTH;
        painelTextoC.weighty = 1.0;
        painelTextoC.weightx = 1.0;
        painelTextoC.ipadx = 830;
        painelTextoC.gridwidth = GridBagConstraints.REMAINDER;

        textoMetasC = new GridBagConstraints();


        textoDespesasFixasC = new GridBagConstraints();


        textoDespesasVariaveisC = new GridBagConstraints();
        textoDespesasVariaveisC.insets = new Insets(0, 0, 0, 150);


        adicionarMetasC = new GridBagConstraints();
        adicionarMetasC.weighty = 1.0;
        adicionarMetasC.weightx = 1.0;



        adicionarDespesasFixasC = new GridBagConstraints();
        adicionarDespesasFixasC.weighty = 1.0;
        adicionarDespesasFixasC.weightx = 1.0;


        adicionarDespesasVariaveisC = new GridBagConstraints();


        painelListaC = new GridBagConstraints();
        painelListaC.fill = GridBagConstraints.BOTH;
        painelListaC.weightx = 1.0;
        painelListaC.weighty = 1.0;

        listaMetasC = new GridBagConstraints();
        listaMetasC.fill = GridBagConstraints.BOTH;
        listaMetasC.weightx = 1.0;
        listaMetasC.weighty = 1.0;
        listaMetasC.ipadx = 333;
        listaMetasC.ipady = 200;

        listaDespesasFixasC = new GridBagConstraints();
        listaDespesasFixasC.fill = GridBagConstraints.BOTH;
        listaDespesasFixasC.weightx = 1.0;
        listaDespesasFixasC.weighty = 1.0;
        listaDespesasFixasC.ipadx = 333;
        listaDespesasFixasC.ipady = 200;

        listaDespesasVariaveisC = new GridBagConstraints();
        listaDespesasVariaveisC.fill = GridBagConstraints.BOTH;
        listaDespesasVariaveisC.weightx = 1.0;
        listaDespesasVariaveisC.weighty = 1.0;
        listaDespesasVariaveisC.ipadx = 331;
        listaDespesasVariaveisC.ipady = 200;

        telaprincipal = new JPanel();
        telaprincipal.setLayout(new GridBagLayout());
        telaprincipal.setBorder(borda);
        add(telaprincipal, telaprincipalC);

        painelGraficos = new JPanel();
        painelGraficos.setLayout(new GridBagLayout());
        telaprincipal.add(painelGraficos, painelGraficosC);

        // Gráfico de pizza
        pizza = new DefaultPieDataset();
        graficoPizza = ChartFactory.createPieChart("Limite Da Carteira", pizza, true, true, false);
        painelGraficoPizza = new ChartPanel(graficoPizza);
        painelGraficoPizza.setPreferredSize(new Dimension(730, 430));
        painelGraficoPizza.setMinimumSize(new Dimension(400, 300));
        painelGraficoPizza.setMaximumSize(new Dimension(800, 600));
        painelGraficos.add(painelGraficoPizza, painelGraficoPizzaC);

        // Gráfico de barra
        barra = new DefaultCategoryDataset();
        graficoBarra = ChartFactory.createBarChart("Carteira", "tipos de gastos", "quantidade em real", barra, PlotOrientation.HORIZONTAL, true, true, false);
        CategoryPlot plot = (CategoryPlot) graficoBarra.getPlot();
        painelGraficoBarra = new ChartPanel(graficoBarra);
        painelGraficoBarra.setPreferredSize(new Dimension(730, 430));
        painelGraficoBarra.setMinimumSize(new Dimension(400, 300));
        painelGraficoBarra.setMaximumSize(new Dimension(800, 600));
        painelGraficos.add(painelGraficoBarra, painelGraficoBarraC);

        painelTexto = new JPanel();
        painelTexto.setLayout(new GridBagLayout());
        painelTexto.setBackground(Color.WHITE);
        telaprincipal.add(painelTexto, painelTextoC);

        textoMetas = new JLabel("Metas");
        textoMetas.setFont(fonte);
        painelTexto.add(textoMetas, textoMetasC);

        adicionarMetas = new BotaoArredondado();
        adicionarMetas.setText("+");
        adicionarMetas.setBackground(Color.WHITE);
        adicionarMetas.setFont(fonte);
        painelTexto.add(adicionarMetas, adicionarMetasC);

        textoDespesasFixas = new JLabel("Despesas Fixas");
        textoDespesasFixas.setFont(fonte);
        painelTexto.add(textoDespesasFixas, textoDespesasFixasC);

        adicionarDespesasFixas = new BotaoArredondado();
        adicionarDespesasFixas.setText("+");
        adicionarDespesasFixas.setBackground(Color.WHITE);
        adicionarDespesasFixas.setFont(fonte);
        painelTexto.add(adicionarDespesasFixas, adicionarDespesasFixasC);

        textoDespesasVariaveis = new JLabel("Despesas Variáveis");
        textoDespesasVariaveis.setFont(fonte);
        painelTexto.add(textoDespesasVariaveis, textoDespesasVariaveisC);

        adicionarDespesasVariaveis = new BotaoArredondado();
        adicionarDespesasVariaveis.setText("+");
        adicionarDespesasVariaveis.setBackground(Color.WHITE);
        adicionarDespesasVariaveis.setFont(fonte);
        painelTexto.add(adicionarDespesasVariaveis, adicionarDespesasVariaveisC);

        painelLista = new JPanel();
        painelLista.setLayout(new GridBagLayout());
        telaprincipal.add(painelLista, painelListaC);

        listaModeloMetas = new DefaultListModel<>();
        listaMetas = new JList<>(listaModeloMetas);
        listaMetas.setFont(fonte);
        JScrollPane scrollPaneMetas = new JScrollPane(listaMetas);
        scrollPaneMetas.setPreferredSize(new Dimension(161, 59));
        scrollPaneMetas.setMinimumSize(new Dimension(161, 59));
        scrollPaneMetas.setMaximumSize(new Dimension(161, 59));
        painelLista.add(scrollPaneMetas, listaMetasC);

        listaModeloDespesasFixa = new DefaultListModel<>();
        listaDespesasFixas = new JList<>(listaModeloDespesasFixa);
        listaDespesasFixas.setFont(fonte);
        JScrollPane scrollPaneDespesasFixas = new JScrollPane(listaDespesasFixas);
        scrollPaneDespesasFixas.setPreferredSize(new Dimension(162, 59));
        scrollPaneDespesasFixas.setMinimumSize(new Dimension(162, 59));
        scrollPaneDespesasFixas.setMaximumSize(new Dimension(162, 59));
        painelLista.add(scrollPaneMetas, listaMetasC);
        painelLista.add(scrollPaneDespesasFixas, listaDespesasFixasC);

        listaModeloDespesasVariavel = new DefaultListModel<>();
        listaDespesasVariaveis = new JList<>(listaModeloDespesasVariavel);
        listaDespesasVariaveis.setFont(fonte);
        JScrollPane scrollPaneDespesasVariaveis = new JScrollPane(listaDespesasVariaveis);
        scrollPaneDespesasVariaveis.setPreferredSize(new Dimension(162, 59));
        scrollPaneDespesasVariaveis.setMinimumSize(new Dimension(162, 59));
        scrollPaneDespesasVariaveis.setMaximumSize(new Dimension(162, 59));
        painelLista.add(scrollPaneDespesasVariaveis, listaDespesasVariaveisC);
    }


    public JPanel getTelaprincipal() {
        return telaprincipal;
    }

    public void setTelaprincipal(JPanel telaprincipal) {
        this.telaprincipal = telaprincipal;
    }

    public GridBagConstraints getTelaprincipalC() {
        return telaprincipalC;
    }

    public void setTelaprincipalC(GridBagConstraints telaprincipalC) {
        this.telaprincipalC = telaprincipalC;
    }

    public JPanel getPainelGraficos() {
        return painelGraficos;
    }

    public void setPainelGraficos(JPanel painelGraficos) {
        this.painelGraficos = painelGraficos;
    }

    public GridBagConstraints getPainelGraficosC() {
        return painelGraficosC;
    }

    public void setPainelGraficosC(GridBagConstraints painelGraficosC) {
        this.painelGraficosC = painelGraficosC;
    }

    public JFreeChart getGraficoPizza() {
        return graficoPizza;
    }

    public void setGraficoPizza(JFreeChart graficoPizza) {
        this.graficoPizza = graficoPizza;
    }

    public ChartPanel getPainelGraficoPizza() {
        return painelGraficoPizza;
    }

    public void setPainelGraficoPizza(ChartPanel painelGraficoPizza) {
        this.painelGraficoPizza = painelGraficoPizza;
    }

    public GridBagConstraints getPainelGraficoPizzaC() {
        return painelGraficoPizzaC;
    }

    public void setPainelGraficoPizzaC(GridBagConstraints painelGraficoPizzaC) {
        this.painelGraficoPizzaC = painelGraficoPizzaC;
    }

    public JFreeChart getGraficoBarra() {
        return graficoBarra;
    }

    public void setGraficoBarra(JFreeChart graficoBarra) {
        this.graficoBarra = graficoBarra;
    }

    public ChartPanel getPainelGraficoBarra() {
        return painelGraficoBarra;
    }

    public void setPainelGraficoBarra(ChartPanel painelGraficoBarra) {
        this.painelGraficoBarra = painelGraficoBarra;
    }

    public GridBagConstraints getPainelGraficoBarraC() {
        return painelGraficoBarraC;
    }

    public void setPainelGraficoBarraC(GridBagConstraints painelGraficoBarraC) {
        this.painelGraficoBarraC = painelGraficoBarraC;
    }

    public JPanel getPainelTexto() {
        return painelTexto;
    }

    public void setPainelTexto(JPanel painelTexto) {
        this.painelTexto = painelTexto;
    }

    public GridBagConstraints getPainelTextoC() {
        return painelTextoC;
    }

    public void setPainelTextoC(GridBagConstraints painelTextoC) {
        this.painelTextoC = painelTextoC;
    }

    public JLabel getTextoMetas() {
        return textoMetas;
    }

    public void setTextoMetas(JLabel textoMetas) {
        this.textoMetas = textoMetas;
    }

    public GridBagConstraints getTextoMetasC() {
        return textoMetasC;
    }

    public void setTextoMetasC(GridBagConstraints textoMetasC) {
        this.textoMetasC = textoMetasC;
    }

    public BotaoArredondado getAdicionarMetas() {
        return adicionarMetas;
    }

    public void setAdicionarMetas(BotaoArredondado adicionarMetas) {
        this.adicionarMetas = adicionarMetas;
    }

    public GridBagConstraints getAdicionarMetasC() {
        return adicionarMetasC;
    }

    public void setAdicionarMetasC(GridBagConstraints adicionarMetasC) {
        this.adicionarMetasC = adicionarMetasC;
    }

    public JLabel getTextoDespesasFixas() {
        return textoDespesasFixas;
    }

    public void setTextoDespesasFixas(JLabel textoDespesasFixas) {
        this.textoDespesasFixas = textoDespesasFixas;
    }

    public GridBagConstraints getTextoDespesasFixasC() {
        return textoDespesasFixasC;
    }

    public void setTextoDespesasFixasC(GridBagConstraints textoDespesasFixasC) {
        this.textoDespesasFixasC = textoDespesasFixasC;
    }

    public BotaoArredondado getAdicionarDespesasFixas() {
        return adicionarDespesasFixas;
    }

    public void setAdicionarDespesasFixas(BotaoArredondado adicionarDespesasFixas) {
        this.adicionarDespesasFixas = adicionarDespesasFixas;
    }

    public GridBagConstraints getAdicionarDespesasFixasC() {
        return adicionarDespesasFixasC;
    }

    public void setAdicionarDespesasFixasC(GridBagConstraints adicionarDespesasFixasC) {
        this.adicionarDespesasFixasC = adicionarDespesasFixasC;
    }

    public JLabel getTextoDespesasVariaveis() {
        return textoDespesasVariaveis;
    }

    public void setTextoDespesasVariaveis(JLabel textoDespesasVariaveis) {
        this.textoDespesasVariaveis = textoDespesasVariaveis;
    }

    public GridBagConstraints getTextoDespesasVariaveisC() {
        return textoDespesasVariaveisC;
    }

    public void setTextoDespesasVariaveisC(GridBagConstraints textoDespesasVariaveisC) {
        this.textoDespesasVariaveisC = textoDespesasVariaveisC;
    }

    public BotaoArredondado getAdicionarDespesasVariaveis() {
        return adicionarDespesasVariaveis;
    }

    public void setAdicionarDespesasVariaveis(BotaoArredondado adicionarDespesasVariaveis) {
        this.adicionarDespesasVariaveis = adicionarDespesasVariaveis;
    }

    public GridBagConstraints getAdicionarDespesasVariaveisC() {
        return adicionarDespesasVariaveisC;
    }

    public void setAdicionarDespesasVariaveisC(GridBagConstraints adicionarDespesasVariaveisC) {
        this.adicionarDespesasVariaveisC = adicionarDespesasVariaveisC;
    }

    public JPanel getPainelLista() {
        return painelLista;
    }

    public void setPainelLista(JPanel painelLista) {
        this.painelLista = painelLista;
    }

    public GridBagConstraints getPainelListaC() {
        return painelListaC;
    }

    public void setPainelListaC(GridBagConstraints painelListaC) {
        this.painelListaC = painelListaC;
    }

    public JList getListaMetas() {
        return listaMetas;
    }

    public void setListaMetas(JList listaMetas) {
        this.listaMetas = listaMetas;
    }

    public GridBagConstraints getListaMetasC() {
        return listaMetasC;
    }

    public void setListaMetasC(GridBagConstraints listaMetasC) {
        this.listaMetasC = listaMetasC;
    }

    public JList getListaDespesasFixas() {
        return listaDespesasFixas;
    }

    public void setListaDespesasFixas(JList listaDespesasFixas) {
        this.listaDespesasFixas = listaDespesasFixas;
    }

    public GridBagConstraints getListaDespesasFixasC() {
        return listaDespesasFixasC;
    }

    public void setListaDespesasFixasC(GridBagConstraints listaDespesasFixasC) {
        this.listaDespesasFixasC = listaDespesasFixasC;
    }

    public JList getListaDespesasVariaveis() {
        return listaDespesasVariaveis;
    }

    public void setListaDespesasVariaveis(JList listaDespesasVariaveis) {
        this.listaDespesasVariaveis = listaDespesasVariaveis;
    }

    public GridBagConstraints getListaDespesasVariaveisC() {
        return listaDespesasVariaveisC;
    }

    public void setListaDespesasVariaveisC(GridBagConstraints listaDespesasVariaveisC) {
        this.listaDespesasVariaveisC = listaDespesasVariaveisC;
    }

    public DefaultPieDataset getPizza() {
        return pizza;
    }

    public void setPizza(DefaultPieDataset pizza) {
        this.pizza = pizza;
    }

    public DefaultCategoryDataset getBarra() {
        return barra;
    }

    public void setBarra(DefaultCategoryDataset barra) {
        this.barra = barra;
    }

    public DefaultListModel<Metas> getListaModeloMetas() {
        return listaModeloMetas;
    }

    public void setListaModeloMetas(DefaultListModel<Metas> listaModeloMetas) {
        this.listaModeloMetas = listaModeloMetas;
    }

    public DefaultListModel<DespesaFixa> getListaModeloDespesasFixa() {
        return listaModeloDespesasFixa;
    }

    public void setListaModeloDespesasFixa(DefaultListModel<DespesaFixa> listaModeloDespesasFixa) {
        this.listaModeloDespesasFixa = listaModeloDespesasFixa;
    }

    public DefaultListModel<DespesaVariavel> getListaModeloDespesasVariavel() {
        return listaModeloDespesasVariavel;
    }

    public void setListaModeloDespesasVariavel(DefaultListModel<DespesaVariavel> listaModeloDespesasVariavel) {
        this.listaModeloDespesasVariavel = listaModeloDespesasVariavel;
    }
}