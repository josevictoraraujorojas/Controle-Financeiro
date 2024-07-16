package Visao;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

        JpanelLogin jpanelLogin = new JpanelLogin();
        fundo.add(jpanelLogin, jpanelLoginC);

        jpanelLogin.getBotaoLogin().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                fundo.remove(jpanelLogin);
                JpanelPrincipal jpanelPrincipal = new JpanelPrincipal();
                JpanelMenu jpanelMenu = new JpanelMenu();
                GridBagConstraints c = new GridBagConstraints();
                fundo.add(jpanelMenu,c );
                fundo.add(jpanelPrincipal,c );
                revalidate();
                repaint();
            }

        });

    }

    public JPanelComImagemDeFundo getFundo() {
        return fundo;
    }

    public GridBagConstraints getFundoC() {
        return fundoC;
    }
}
