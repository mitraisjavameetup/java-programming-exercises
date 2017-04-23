package com.mitrais.cdc.java.coreservlets;

import java.awt.*;
import java.awt.geom.Line2D;

import javax.swing.*;
/**
 * GatesPanel Class
 * @author trainee
 *
 */
public class GatesPanel extends JPanel {
  private Image image;
  /**
   * GatesPanel Constructor
   * @param relativePath
   */
  public GatesPanel(String relativePath) {
	//get image from relativePath, and store it into variable
  image=Toolkit.getDefaultToolkit().getImage(relativePath);
  
  }
/**
 * draw a shape
 */
  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.drawImage(image, 0, 0, this);
    
    //add mustache under here. PS: use simple line as his mustache
    Graphics2D g2 = (Graphics2D) g;
    Line2D line=new Line2D.Float(480, 215, 490, 215);
    g2.setColor(Color.black);
    g2.draw(line);
    g.setColor(Color.green);
    g.drawString("hail hitler", 400, 100);
    
  }
}
