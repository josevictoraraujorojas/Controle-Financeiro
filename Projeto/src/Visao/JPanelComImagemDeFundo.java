package Visao;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class JPanelComImagemDeFundo extends JPanel {
    private BufferedImage imagemDeFundo;

    public JPanelComImagemDeFundo(URL caminhoDaImagem) {
        try {
            imagemDeFundo = ImageIO.read(caminhoDaImagem);
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