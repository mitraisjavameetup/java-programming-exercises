package com.mitrais.cdc.java.coreservlets;

import java.awt.*;

import javax.swing.*;
/**
 * 
 * @author trainee
 * CirclePanel Class
 */
public class CirclePanel extends JPanel {
  private int diameter = 20; 
  /**
   * CirclePanel Constructor
   * @param bgColor
   */
  public CirclePanel(Color bgColor) {
    setBackground(bgColor);
  }
  /**
   * draw shape
   */
  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    //complete this method to display yellow rounds on screen
    g.setColor(Color.YELLOW);
    g.fillOval(225, 225, diameter, diameter);
    
    
    
    
  }
}
