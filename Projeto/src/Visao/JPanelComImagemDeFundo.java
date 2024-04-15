package Visao;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class JPanelComImagemDeFundo extends JPanel {
    private BufferedImage imagemDeFundo;

    public JPanelComImagemDeFundo(String caminhoDaImagem) {
        try {
            imagemDeFundo = ImageIO.read(new File(caminhoDaImagem));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (imagemDeFundo != null) {
            g.drawImage(imagemDeFundo, 0, 0, getWidth(), getHeight(), this);
        }
    }
}