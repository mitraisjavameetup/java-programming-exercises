package com.mitrais.cdc.java.coreservlets;

import java.awt.*;
import javax.swing.*;

/**
 * Panel for drawing mustache on Bill Gates
 * @author Egi
 * @version 1.0
 */
public class GatesPanel extends JPanel {
  private Image image;
  
  /**
   * GatesPanel constructor for reading image from relativePath
   * @param relativePath
   */
  public GatesPanel(String relativePath) {
	//get image from relativePath, and store it into variable
	this.image = Toolkit.getDefaultToolkit().getImage(relativePath);
  
  }
  
  /**
   * Override paintComponent for drawing mustache on Bill Gates
   */
  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.drawImage(image, 0, 0, this);
    g.setColor(Color.WHITE);
    
    //add mustache under here. PS: use simple line as his mustache
    g.drawLine(485, 220, 455, 223);
    g.drawLine(490, 220, 520, 225);

  
  }
}
