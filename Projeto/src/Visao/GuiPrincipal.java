package Visao;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.annotations.CategoryTextAnnotation;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

import javax.swing.*;
import java.awt.*;

public class GuiPrincipal extends JFrame {

    JPanelComImagemDeFundo fundo;
    GridBagConstraints fundoC;
    JFreeChart graficoPizza;
    ChartPanel painelGraficoPizza;
    GridBagConstraints painelGraficoPizzaC;
    JFreeChart graficoBarra;
    ChartPanel painelGraficoBarra;
    GridBagConstraints painelGraficoBarraC;
    public GuiPrincipal() {
        super("grafico");
        setLayout(new GridBagLayout());
        Font fonte = new Font("Serif",Font.PLAIN,16);

        painelGraficoPizzaC = new GridBagConstraints();
        GridBagConstraints barraC = new GridBagConstraints();

        fundoC = new GridBagConstraints();
        fundoC.weighty = 1;
        fundoC.weightx = 1;
        fundoC.fill = GridBagConstraints.BOTH;

        fundo = new JPanelComImagemDeFundo(getClass().getResource("Imagem\\contas-a-pagar-e-receber.jpeg"));
        fundo.setLayout(new GridBagLayout());
        add(fundo,fundoC);

        DefaultPieDataset pizza = new DefaultPieDataset();
        pizza.setValue("metas",0.2*1400);
        pizza.setValue("despesas fixas",0.5*1400);
        pizza.setValue("despesas variaveis",0.3*1400);
        graficoPizza = ChartFactory.createPieChart("limite do orcamento",pizza,true,true,false);

        DefaultCategoryDataset barra = new DefaultCategoryDataset();
        barra.addValue( 200, "Metas","metas");
        barra.addValue( 600, "despesas fixas","despesas fixas" );
        barra.addValue( 400, "despesas variaveis","despesas variaveis" );
        graficoBarra = ChartFactory.createBarChart("Orcamento","tipos de gastos","quantidade em real",barra,PlotOrientation.HORIZONTAL,true,true,false);

        CategoryPlot teste = (CategoryPlot) graficoBarra.getPlot();
        CategoryTextAnnotation anotacao = new CategoryTextAnnotation("Limite das metas:"+0.2*1400,"metas",90);
        anotacao.setPaint(Color.RED);
        anotacao.setFont(fonte);
        teste.addAnnotation(anotacao);

        CategoryPlot teste1 = (CategoryPlot) graficoBarra.getPlot();
        CategoryTextAnnotation anotacao1 = new CategoryTextAnnotation("Limite despesas fixas:"+0.5*1400,"despesas fixas",105);
        anotacao1.setPaint(Color.RED);
        anotacao1.setFont(fonte);
        teste.addAnnotation(anotacao1);

        CategoryPlot teste2 = (CategoryPlot) graficoBarra.getPlot();
        CategoryTextAnnotation anotacao2 = new CategoryTextAnnotation("Limite despesas variaveis:"+0.3*1400,"despesas variaveis",120);
        anotacao2.setPaint(Color.RED);
        anotacao2.setFont(fonte);
        teste.addAnnotation(anotacao2);

        painelGraficoBarra = new ChartPanel(graficoBarra);
        fundo.add(painelGraficoBarra,painelGraficoBarraC);

        painelGraficoPizza = new ChartPanel(graficoPizza);
        fundo.add(painelGraficoPizza,painelGraficoPizzaC);




    }
}