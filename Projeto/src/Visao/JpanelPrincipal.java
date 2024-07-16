package Visao;

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
    private JFreeChart graficoPizza;
    private ChartPanel painelGraficoPizza;
    private GridBagConstraints painelGraficoPizzaC;
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
    private JList listaMetas;
    private GridBagConstraints listaMetasC;
    private JList listaDespesasFixas;
    private GridBagConstraints listaDespesasFixasC;
    private JList listaDespesasVariaveis;
    private GridBagConstraints listaDespesasVariaveisC;

    private static  final String[] metas = {"viajar","comprar um carro","guardar dinheiro"};
    private static  final String[] despesasFixas = {"conta de agua","conta de luz","conta supermercado"};
    private static  final String[] despesasVariaveis = {"comprei roupa","comprei um sorvete","comprei pizza"};

    public JpanelPrincipal() {
        setLayout(new GridBagLayout());
        Font fonte = new Font("Serif",Font.PLAIN,20);
        Border borda = BorderFactory.createLineBorder(Color.black, 2);


        painelGraficosC = new GridBagConstraints();
        painelGraficosC.gridwidth=GridBagConstraints.REMAINDER;

        painelGraficoPizzaC = new GridBagConstraints();
        painelGraficoPizzaC.ipadx=49;
        painelGraficoPizzaC.ipady=10;

        painelGraficoBarraC = new GridBagConstraints();
        painelGraficoBarraC.ipadx=49;
        painelGraficoBarraC.ipady=10;


        painelTextoC = new GridBagConstraints();
        painelTextoC.ipadx=830;
        painelTextoC.gridwidth=GridBagConstraints.REMAINDER;

        textoMetasC = new GridBagConstraints();
        textoMetasC.weightx=1;

        textoDespesasFixasC = new GridBagConstraints();
        textoDespesasFixasC.weightx=1;

        textoDespesasVariaveisC = new GridBagConstraints();
        textoDespesasVariaveisC.weightx=1;

        adicionarMetasC =new GridBagConstraints();

        adicionarDespesasFixasC = new GridBagConstraints();

        adicionarDespesasVariaveisC = new GridBagConstraints();

        painelListaC = new GridBagConstraints();

        listaMetasC = new GridBagConstraints();
        listaMetasC.ipadx=333;
        listaMetasC.ipady=200;

        listaDespesasFixasC = new GridBagConstraints();
        listaDespesasFixasC.ipadx=333;
        listaDespesasFixasC.ipady=200;

        listaDespesasVariaveisC = new GridBagConstraints();
        listaDespesasVariaveisC.ipadx=331;
        listaDespesasVariaveisC.ipady=200;

        telaprincipal = new JPanel();
        telaprincipal.setLayout(new GridBagLayout());
        telaprincipal.setBorder(borda);
        add(telaprincipal,telaprincipalC);

        painelGraficos = new JPanel();
        painelGraficos.setLayout(new GridBagLayout());
        telaprincipal.add(painelGraficos,painelGraficosC);

        //grafico limite da carteira em formato de pizza
        DefaultPieDataset pizza = new DefaultPieDataset();
        pizza.setValue("metas",0.2*1400);
        pizza.setValue("despesas fixas",0.5*1400);
        pizza.setValue("despesas variaveis",0.3*1400);
        graficoPizza = ChartFactory.createPieChart("Limite Da Carteira",pizza,true,true,false);
        painelGraficoPizza = new ChartPanel(graficoPizza);
        painelGraficos.add(painelGraficoPizza,painelGraficoPizzaC);

        //grafico de barra orcamento em tempo real
        DefaultCategoryDataset barra = new DefaultCategoryDataset();
        barra.addValue( 200, "Metas","metas");
        barra.addValue( 600, "despesas fixas","despesas fixas" );
        barra.addValue( 400, "despesas variaveis","despesas variaveis" );
        graficoBarra = ChartFactory.createBarChart("Carteira","tipos de gastos","quantidade em real",barra,PlotOrientation.HORIZONTAL,true,true,false);
        CategoryPlot plot = (CategoryPlot) graficoBarra.getPlot();

        // aumenta o grafico de barra para o valor total
        plot.getRangeAxis().setRange(0, 1400); // Altere 1400 para o valor máximo desejado

        //aponato o limite das metas no grafico de barra
        double limiteMetas = 0.2 * 1400; // Limite para metas
        ValueMarker markerMetas = new ValueMarker(limiteMetas);
        markerMetas.setPaint(Color.RED);
        markerMetas.setStroke(new BasicStroke(3f)); // Defina a largura desejada
        plot.addRangeMarker(markerMetas);

        //aponato o limite das despesas fixas no grafico de barra
        double limiteDespesasFixas = 0.5 * 1400; // Limite para despesas fixas
        ValueMarker markerDespesasFixas = new ValueMarker(limiteDespesasFixas);
        markerDespesasFixas.setPaint(Color.blue);
        markerDespesasFixas.setStroke(new BasicStroke(3f)); // Defina a largura desejada
        plot.addRangeMarker(markerDespesasFixas);

        //aponato o limite das despesas variaveis no grafico de barra
        double limiteDespesasVariaveis = 0.3 * 1400; // Limite para despesas variaveis
        ValueMarker markerDespesasVariaveis = new ValueMarker(limiteDespesasVariaveis);
        markerDespesasVariaveis.setPaint(Color.green);
        markerDespesasVariaveis.setStroke(new BasicStroke(3f)); // Defina a largura desejada
        plot.addRangeMarker(markerDespesasVariaveis);

        painelGraficoBarra = new ChartPanel(graficoBarra);
        painelGraficos.add(painelGraficoBarra,painelGraficoBarraC);

        painelTexto = new JPanel();
        painelTexto.setLayout(new GridBagLayout());
        painelTexto.setBackground(Color.WHITE);
        telaprincipal.add(painelTexto,painelTextoC);

        textoMetas = new JLabel("Metas");
        textoMetas.setFont(fonte);
        painelTexto.add(textoMetas,textoMetasC);

        adicionarMetas = new BotaoArredondado();
        adicionarMetas.setText("+");
        adicionarMetas.setBackground(Color.WHITE);
        adicionarMetas.setFont(fonte);
        painelTexto.add(adicionarMetas,adicionarMetasC);

        textoDespesasFixas = new JLabel("Despesas Fixas");
        textoDespesasFixas.setFont(fonte);
        painelTexto.add(textoDespesasFixas,textoDespesasFixasC);

        adicionarDespesasFixas = new BotaoArredondado();
        adicionarDespesasFixas.setText("+");
        adicionarDespesasFixas.setBackground(Color.WHITE);
        adicionarDespesasFixas.setFont(fonte);
        painelTexto.add(adicionarDespesasFixas,adicionarDespesasFixasC);

        textoDespesasVariaveis = new JLabel("Despesas Variaveis");
        textoDespesasVariaveis.setFont(fonte);
        painelTexto.add(textoDespesasVariaveis,textoDespesasVariaveisC);

        adicionarDespesasVariaveis = new BotaoArredondado();
        adicionarDespesasVariaveis.setText("+");
        adicionarDespesasVariaveis.setBackground(Color.WHITE);
        adicionarDespesasVariaveis.setFont(fonte);
        painelTexto.add(adicionarDespesasVariaveis,adicionarDespesasVariaveisC);

        painelLista = new JPanel();
        painelLista.setLayout(new GridBagLayout());
        telaprincipal.add(painelLista,painelListaC);

        listaMetas = new JList<>(metas);
        listaMetas.setFont(fonte);
        listaMetas.setToolTipText("Metas");
        listaMetas.setVisibleRowCount(5);
        listaMetas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        painelLista.add(listaMetas,listaMetasC);

        listaDespesasFixas = new JList<>(despesasFixas);
        listaDespesasFixas.setFont(fonte);
        listaDespesasFixas.setToolTipText("Despesas Fixas");
        listaDespesasFixas.setVisibleRowCount(5);
        listaDespesasFixas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        painelLista.add(listaDespesasFixas,listaDespesasFixasC);

        listaDespesasVariaveis = new JList<>(despesasVariaveis);
        listaDespesasVariaveis.setFont(fonte);
        listaDespesasVariaveis.setToolTipText("Despesas Variaveis");
        listaDespesasVariaveis.setVisibleRowCount(5);
        listaDespesasVariaveis.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        painelLista.add(listaDespesasVariaveis,listaDespesasVariaveisC);

    }
}