package com.mitrais.cdc.java.coreservlets;

import java.awt.*;
import javax.swing.*;
/**
 * 
 * @author Relung Satria
 * GatesPanel class
 *
 */
public class GatesPanel extends JPanel {
  private Image image;
  
  public GatesPanel(String relativePath) {
	//get image from relativePath, and store it into variable
	  this.image = Toolkit.getDefaultToolkit().getImage(relativePath);
  
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.drawImage(image, 0, 0, this);
    g.fillRect(460, 210, 50, 5);
    
    //add mustache under here. PS: use simple line as his mustache

  
  }
}
