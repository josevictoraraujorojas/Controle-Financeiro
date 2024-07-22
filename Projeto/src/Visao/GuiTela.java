package Visao;

import javax.swing.*;
import java.awt.*;

public class GuiTela extends JFrame {
    private JPanelComImagemDeFundo fundo;
    private GridBagConstraints fundoC;

    public  GuiTela(){
        setLayout(new GridBagLayout());
        Font fonte = new Font("Serif",Font.PLAIN,20);

        fundoC = new GridBagConstraints();
        fundoC.weighty = 1;
        fundoC.weightx = 1;
        fundoC.fill = GridBagConstraints.BOTH;

        GridBagConstraints jpanelLoginC = new GridBagConstraints();

        fundo = new JPanelComImagemDeFundo(getClass().getResource("Imagem\\fundo.jpg"));
        fundo.setLayout(new GridBagLayout());
        add(fundo, fundoC);
    }

    public JPanelComImagemDeFundo getFundo() {
        return fundo;
    }

    public GridBagConstraints getFundoC() {
        return fundoC;
    }
}
