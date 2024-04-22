package Visao;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;

public class JTextAreaArredondado extends JTextArea {
    private int borderRadius = 40;

    public JTextAreaArredondado() {
        super();
        setOpaque(false);
        setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10)); // Adiciona margem interna para evitar que o texto toque nas bordas
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, borderRadius, borderRadius);

        super.paintComponent(g2);
        g2.dispose();
    }

    @Override
    protected void paintBorder(Graphics g) {

    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(150, 30);
    }
}
