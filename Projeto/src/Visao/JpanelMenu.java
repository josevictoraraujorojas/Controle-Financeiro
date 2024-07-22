package Visao;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class JpanelMenu extends JPanel{
    private JPanel menu;
    private GridBagConstraints menuC;
    private BotaoArredondado principal;
    private GridBagConstraints principalC;
    private BotaoArredondado perfil;
    private GridBagConstraints perfilC;
    private BotaoArredondado sair;
    private GridBagConstraints sairC;

    public  JpanelMenu(){
        setLayout(new GridBagLayout());
        Font fonte = new Font("Serif",Font.PLAIN,20);
        Border borda = BorderFactory.createLineBorder(Color.black, 2);

        menuC = new GridBagConstraints();
        menuC.ipadx = 50;
        menuC.ipady = 637;
        menuC.gridheight = GridBagConstraints.REMAINDER;

        principalC = new GridBagConstraints();
        principalC.gridwidth=GridBagConstraints.REMAINDER;

        perfilC = new GridBagConstraints();
        perfilC.gridwidth=GridBagConstraints.REMAINDER;
        perfilC.weighty=1;
        perfilC.anchor=GridBagConstraints.NORTH;

        sairC = new GridBagConstraints();
        sairC.gridwidth=GridBagConstraints.REMAINDER;

        menu = new JPanel();
        menu.setBackground(Color.decode("#82C2D4"));
        menu.setLayout(new GridBagLayout());
        menu.setBorder(borda);
        add(menu, menuC);

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
    }

    public JPanel getMenu() {
        return menu;
    }

    public GridBagConstraints getMenuC() {
        return menuC;
    }

    public BotaoArredondado getPrincipal() {
        return principal;
    }

    public GridBagConstraints getPrincipalC() {
        return principalC;
    }

    public BotaoArredondado getPerfil() {
        return perfil;
    }

    public GridBagConstraints getPerfilC() {
        return perfilC;
    }

    public BotaoArredondado getSair() {
        return sair;
    }

    public GridBagConstraints getSairC() {
        return sairC;
    }

    public void setMenu(JPanel menu) {
        this.menu = menu;
    }

    public void setMenuC(GridBagConstraints menuC) {
        this.menuC = menuC;
    }

    public void setPrincipal(BotaoArredondado principal) {
        this.principal = principal;
    }

    public void setPrincipalC(GridBagConstraints principalC) {
        this.principalC = principalC;
    }

    public void setPerfil(BotaoArredondado perfil) {
        this.perfil = perfil;
    }

    public void setPerfilC(GridBagConstraints perfilC) {
        this.perfilC = perfilC;
    }

    public void setSair(BotaoArredondado sair) {
        this.sair = sair;
    }

    public void setSairC(GridBagConstraints sairC) {
        this.sairC = sairC;
    }
}
