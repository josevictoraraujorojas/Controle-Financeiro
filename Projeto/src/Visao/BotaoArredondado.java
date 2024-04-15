package Visao;

import javax.swing.*;
import java.awt.*;

public class BotaoArredondado extends JButton {
    private Color hoverBackgroundColor;
    private Color pressedBackgroundColor;

    public BotaoArredondado() {

        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);
        setOpaque(false);

        hoverBackgroundColor = new Color(200, 200, 200);
        pressedBackgroundColor = new Color(150, 150, 150);
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (getModel().isPressed()) {
            g.setColor(pressedBackgroundColor);
        } else if (getModel().isRollover()) {
            g.setColor(hoverBackgroundColor);
        } else {
            g.setColor(getBackground());
        }

        g.fillRoundRect(0, 0, getWidth(), getHeight(), 40, 40);
        super.paintComponent(g);
    }

    @Override
    protected void paintBorder(Graphics g) {

    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(100, 40);
    }
}
