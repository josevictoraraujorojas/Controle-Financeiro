package Visao;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
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
        barra.addValue( 200, "Meta","" );
        barra.addValue( 600, "despesas fixas","" );
        barra.addValue( 400, "despesas variaveis","" );
        graficoBarra = ChartFactory.createBarChart("Orcamento","tipos de gastos","quantidade em real",barra,PlotOrientation.HORIZONTAL,true,true,false);
        painelGraficoBarra = new ChartPanel(graficoBarra);
        fundo.add(painelGraficoBarra,painelGraficoBarraC);

        painelGraficoPizza = new ChartPanel(graficoPizza);
        fundo.add(painelGraficoPizza,painelGraficoPizzaC);




    }
}
