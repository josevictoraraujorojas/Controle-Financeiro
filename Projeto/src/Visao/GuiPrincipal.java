package Visao;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.annotations.CategoryTextAnnotation;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.ValueMarker;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

import javax.swing.*;
import java.awt.*;

public class GuiPrincipal extends JFrame {

    JPanelComImagemDeFundo fundo;
    GridBagConstraints fundoC;
    JPanelComImagemDeFundo painelGraficos;
    GridBagConstraints painelGraficosC;
    JPanelComImagemDeFundo painelLista;
    GridBagConstraints painelListaC;
    JFreeChart graficoPizza;
    ChartPanel painelGraficoPizza;
    GridBagConstraints painelGraficoPizzaC;
    JFreeChart graficoBarra;
    ChartPanel painelGraficoBarra;
    GridBagConstraints painelGraficoBarraC;
    JList listaDespesasFixas;
    GridBagConstraints listaDespesasFixasC;
    JList listaDespesasVariaveis;
    GridBagConstraints listaDespesasVariaveisC;
    JList listaMetas;
    GridBagConstraints listaMetasC;
    private static  final String[] metas = {"viajar","comprar um carro","guardar dinheiro"};
    private static  final String[] despesasFixas = {"conta de agua","conta de luz","conta supermercado"};
    private static  final String[] despesasVariaveis = {"comprei roupa","comprei um sorvete","comprei pizza"};
    public GuiPrincipal() {
        super("grafico");
        setLayout(new GridBagLayout());
        Font fonte = new Font("Serif",Font.PLAIN,16);

        fundoC = new GridBagConstraints();
        fundoC.weighty = 1;
        fundoC.weightx = 1;
        fundoC.fill = GridBagConstraints.BOTH;

        painelGraficosC = new GridBagConstraints();
        painelGraficosC.gridwidth=GridBagConstraints.REMAINDER;

        painelListaC = new GridBagConstraints();

        painelGraficoPizzaC = new GridBagConstraints();
        painelGraficoPizzaC.ipadx=-200;
        painelGraficoPizzaC.ipady=-200;

        painelGraficoBarraC = new GridBagConstraints();
        painelGraficoBarraC.ipadx=-200;
        painelGraficoBarraC.ipady=-200;

        listaMetasC = new GridBagConstraints();
        listaMetasC.ipadx=206;
        listaMetasC.ipady=200;

        listaDespesasFixasC = new GridBagConstraints();
        listaDespesasFixasC.ipadx=206;
        listaDespesasFixasC.ipady=200;

        listaDespesasVariaveisC = new GridBagConstraints();
        listaDespesasVariaveisC.ipadx=205;
        listaDespesasVariaveisC.ipady=200;




        fundo = new JPanelComImagemDeFundo(getClass().getResource("Imagem\\contas-a-pagar-e-receber.jpeg"));
        fundo.setLayout(new GridBagLayout());
        add(fundo,fundoC);

        painelGraficos = new JPanelComImagemDeFundo(getClass().getResource("Imagem\\fundo-quadrado-azul-para-cartaz-de-banner-anuncio-de-midia-social-evento-e-varios-trabalhos-de-design_7954-52368.jpg"));
        painelGraficos.setLayout(new GridBagLayout());
        fundo.add(painelGraficos,painelGraficosC);

        DefaultPieDataset pizza = new DefaultPieDataset();
        pizza.setValue("metas",0.2*1400);
        pizza.setValue("despesas fixas",0.5*1400);
        pizza.setValue("despesas variaveis",0.3*1400);
        graficoPizza = ChartFactory.createPieChart("limite do orcamento",pizza,true,true,false);
        painelGraficoPizza = new ChartPanel(graficoPizza);
        painelGraficos.add(painelGraficoPizza,painelGraficoPizzaC);

        DefaultCategoryDataset barra = new DefaultCategoryDataset();
        barra.addValue( 200, "Metas","metas");
        barra.addValue( 600, "despesas fixas","despesas fixas" );
        barra.addValue( 400, "despesas variaveis","despesas variaveis" );
        graficoBarra = ChartFactory.createBarChart("Orcamento","tipos de gastos","quantidade em real",barra,PlotOrientation.HORIZONTAL,true,true,false);
        CategoryPlot plot = (CategoryPlot) graficoBarra.getPlot();

        plot.getRangeAxis().setRange(0, 1400); // Altere 800 para o valor máximo desejado

        double limiteMetas = 0.2 * 1400; // Limite para metas
        ValueMarker markerMetas = new ValueMarker(limiteMetas);
        markerMetas.setPaint(Color.RED);
        markerMetas.setStroke(new BasicStroke(3f)); // Defina a largura desejada
        plot.addRangeMarker(markerMetas);

        double limiteDespesasFixas = 0.5 * 1400; // Limite para despesas fixas
        ValueMarker markerDespesasFixas = new ValueMarker(limiteDespesasFixas);
        markerDespesasFixas.setPaint(Color.blue);
        markerDespesasFixas.setStroke(new BasicStroke(3f)); // Defina a largura desejada
        plot.addRangeMarker(markerDespesasFixas);

        double limiteDespesasVariaveis = 0.3 * 1400; // Limite para despesas variaveis
        ValueMarker markerDespesasVariaveis = new ValueMarker(limiteDespesasVariaveis);
        markerDespesasVariaveis.setPaint(Color.green);
        markerDespesasVariaveis.setStroke(new BasicStroke(3f)); // Defina a largura desejada
        plot.addRangeMarker(markerDespesasVariaveis);

        painelGraficoBarra = new ChartPanel(graficoBarra);
        painelGraficos.add(painelGraficoBarra,painelGraficoBarraC);

        painelLista = new JPanelComImagemDeFundo(getClass().getResource("Imagem\\fundo-quadrado-azul-para-cartaz-de-banner-anuncio-de-midia-social-evento-e-varios-trabalhos-de-design_7954-52368.jpg"));
        painelLista.setLayout(new GridBagLayout());
        fundo.add(painelLista,painelListaC);

        listaMetas = new JList<>(metas);
        listaMetas.setToolTipText("Metas");
        listaMetas.setVisibleRowCount(5);
        listaMetas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        painelLista.add(listaMetas,listaMetasC);

        listaDespesasFixas = new JList<>(despesasFixas);
        listaDespesasFixas.setToolTipText("Despesas Fixas");
        listaDespesasFixas.setVisibleRowCount(5);
        listaDespesasFixas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        painelLista.add(listaDespesasFixas,listaDespesasFixasC);

        listaDespesasVariaveis = new JList<>(despesasVariaveis);
        listaDespesasVariaveis.setToolTipText("Despesas Variaveis");
        listaDespesasVariaveis.setVisibleRowCount(5);
        listaDespesasVariaveis.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        painelLista.add(listaDespesasVariaveis,listaDespesasVariaveisC);



    }
}