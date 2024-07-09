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
import java.util.Objects;

public class GuiPrincipal extends JFrame {

    JPanelComImagemDeFundo fundo;
    GridBagConstraints fundoC;
    JPanel menu;
    GridBagConstraints menuC;
    BotaoArredondado principal;
    GridBagConstraints principalC;
    BotaoArredondado perfil;
    GridBagConstraints perfilC;
    BotaoArredondado sair;
    GridBagConstraints sairC;
    JPanel telaprincipal;
    GridBagConstraints telaprincipalC;
    JPanel painelGraficos;
    GridBagConstraints painelGraficosC;
    JFreeChart graficoPizza;
    ChartPanel painelGraficoPizza;
    GridBagConstraints painelGraficoPizzaC;
    JFreeChart graficoBarra;
    ChartPanel painelGraficoBarra;
    GridBagConstraints painelGraficoBarraC;
    JPanel painelTexto;
    GridBagConstraints painelTextoC;
    JLabel textoMetas;
    GridBagConstraints textoMetasC;
    BotaoArredondado adicionarMetas;
    GridBagConstraints adicionarMetasC;
    JLabel textoDespesasFixas;
    GridBagConstraints textoDespesasFixasC;
    BotaoArredondado adicionarDespesasFixas;
    GridBagConstraints adicionarDespesasFixasC;
    JLabel textoDespesasVariaveis;
    GridBagConstraints textoDespesasVariaveisC;
    BotaoArredondado adicionarDespesasVariaveis;
    GridBagConstraints adicionarDespesasVariaveisC;
    JPanel painelLista;
    GridBagConstraints painelListaC;
    JList listaMetas;
    GridBagConstraints listaMetasC;
    JList listaDespesasFixas;
    GridBagConstraints listaDespesasFixasC;
    JList listaDespesasVariaveis;
    GridBagConstraints listaDespesasVariaveisC;

    private static  final String[] metas = {"viajar","comprar um carro","guardar dinheiro"};
    private static  final String[] despesasFixas = {"conta de agua","conta de luz","conta supermercado"};
    private static  final String[] despesasVariaveis = {"comprei roupa","comprei um sorvete","comprei pizza"};

    public GuiPrincipal() {
        super("grafico");
        setLayout(new GridBagLayout());
        Font fonte = new Font("Serif",Font.PLAIN,20);
        Border borda = BorderFactory.createLineBorder(Color.black, 2);


        fundoC = new GridBagConstraints();
        fundoC.weighty = 1;
        fundoC.weightx = 1;
        fundoC.fill = GridBagConstraints.BOTH;

        menuC = new GridBagConstraints();
        menuC.ipadx=50;
        menuC.ipady=637;
        menuC.gridheight=GridBagConstraints.REMAINDER;


        principalC = new GridBagConstraints();
        principalC.gridwidth=GridBagConstraints.REMAINDER;

        perfilC = new GridBagConstraints();
        perfilC.gridwidth=GridBagConstraints.REMAINDER;
        perfilC.weighty=1;
        perfilC.anchor=GridBagConstraints.NORTH;

        sairC = new GridBagConstraints();
        sairC.gridwidth=GridBagConstraints.REMAINDER;

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




        fundo = new JPanelComImagemDeFundo(Objects.requireNonNull(getClass().getResource("Imagem\\fundo.jpg")));
        fundo.setLayout(new GridBagLayout());
        add(fundo,fundoC);

        menu = new JPanel();
        menu.setBackground(Color.white);
        menu.setLayout(new GridBagLayout());
        menu.setBorder(borda);
        fundo.add(menu,menuC);

        principal = new BotaoArredondado();
        principal.setText("principal");
        principal.setBackground(Color.cyan);
        menu.add(principal,principalC);

        perfil = new BotaoArredondado();
        perfil.setText("perfil");
        perfil.setBackground(Color.cyan);
        menu.add(perfil,perfilC);

        sair = new BotaoArredondado();
        sair.setText("sair");
        sair.setBackground(Color.red);
        menu.add(sair,sairC);

        telaprincipal = new JPanel();
        telaprincipal.setLayout(new GridBagLayout());
        telaprincipal.setBorder(borda);
        fundo.add(telaprincipal,telaprincipalC);

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