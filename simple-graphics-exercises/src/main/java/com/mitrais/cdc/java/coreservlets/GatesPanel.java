package com.mitrais.cdc.java.coreservlets;

import java.awt.*;
import javax.swing.*;

public class GatesPanel extends JPanel {
  private Image image;
  public ImageIcon img;
  public GatesPanel(String relativePath) {
	//get image from relativePath, and store it into variable
	  this.image = Toolkit.getDefaultToolkit().getImage(relativePath);
	  img = new ImageIcon(image);
  
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.drawImage(image, 0, 0, this);
    g.fillRect(480, 210, 10, 5);
    //add mustache under here. PS: use simple line as his mustache

  
  }
}
