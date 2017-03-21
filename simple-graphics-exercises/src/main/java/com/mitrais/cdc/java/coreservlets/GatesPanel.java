package com.mitrais.cdc.java.coreservlets;

import java.awt.*;
import javax.swing.*;

public class GatesPanel extends JPanel {
  private Image image;
  protected ImageIcon i;
  public GatesPanel(String relativePath) {
	//get image from relativePath, and store it into variable
	  image = Toolkit.getDefaultToolkit().getImage(relativePath);
	  i = new ImageIcon(image);
	  i.getIconWidth();
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.drawImage(image, 0, 0, this);
    g.drawLine(470, 217, 500, 217);
    
    //add mustache under here. PS: use simple line as his mustache

  
  }
}
