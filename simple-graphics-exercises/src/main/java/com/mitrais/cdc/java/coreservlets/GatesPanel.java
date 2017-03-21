package com.mitrais.cdc.java.coreservlets;

import java.awt.*;
import javax.swing.*;

public class GatesPanel extends JPanel {
  private Image image;
  protected ImageIcon size;
  public GatesPanel(String relativePath) {
	  image = Toolkit.getDefaultToolkit().getImage(relativePath);
	  size = new ImageIcon(image);
	  size.getIconWidth();
	  size.getIconHeight();
	//get image from relativePath, and store it into variable

  
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.drawImage(image, 0, 0, this);
    g.drawLine(480, 215, 490, 215);
    g.drawLine(480, 216, 490, 216);
    g.drawLine(480, 217, 490, 217);
    g.drawLine(480, 218, 490, 218);
    g.drawLine(480, 219, 490, 219);
   
   
    
    
    //add mustache under here. PS: use simple line as his mustache

  
  }
}
