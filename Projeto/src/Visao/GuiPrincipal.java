package Visao;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

import javax.swing.*;
import java.awt.*;

public class GuiPrincipal extends JFrame {

    JPanelComImagemDeFundo fundo;
    GridBagConstraints fundoC;
    JFreeChart grafico;
    ChartPanel painelGrafico;
    GridBagConstraints painelGraficoC;
    public GuiPrincipal() {
        super("grafico");
        setLayout(new GridBagLayout());

        painelGraficoC = new GridBagConstraints();

        fundoC = new GridBagConstraints();
        fundoC.weighty = 1;
        fundoC.weightx = 1;
        fundoC.fill = GridBagConstraints.BOTH;

        fundo = new JPanelComImagemDeFundo(getClass().getResource("Imagem\\contas-a-pagar-e-receber.jpeg"));
        fundo.setLayout(new GridBagLayout());
        add(fundo,fundoC);

        DefaultPieDataset pizza = new DefaultPieDataset();
        pizza.setValue("metas",20);
        pizza.setValue("despesas fixas",50);
        pizza.setValue("despesas variaveis",30);
        grafico = ChartFactory.createPieChart("orcamento",pizza,true,true,false);

        painelGrafico = new ChartPanel(grafico);
        fundo.add(painelGrafico,painelGraficoC);


    }
}
