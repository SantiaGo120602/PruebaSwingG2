package view;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class MyPanel extends JPanel{
	 private BufferedImage image;
	 public MyPanel(String imagePath) {
	        try {
	            image = ImageIO.read(new File(imagePath));
	        } catch (IOException ex) {
	            ex.printStackTrace();
	        }
	    }
	 @Override
	    protected void paintComponent(Graphics g) {
	        super.paintComponent(g);
	        if (image != null) {
	            g.drawImage(image, 0, 0, this); // dibuja la imagen en las coordenadas (0,0)
	        }
	    }
}
