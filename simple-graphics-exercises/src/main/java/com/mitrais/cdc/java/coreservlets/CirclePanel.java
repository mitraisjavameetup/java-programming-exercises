package com.mitrais.cdc.java.coreservlets;

import java.awt.*;

import javax.swing.*;
/**
 * 
 * @author Relung Satria
 * CirclePanel class
 *
 */
public class CirclePanel extends JPanel {
  private int diameter = 20; 
  
  public CirclePanel(Color bgColor) {
    setBackground(bgColor);
  }
  
  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    //complete this method to display yellow rounds on screen
    g.setColor(Color.YELLOW);
    for(int i = 1; i <= 50; i++){
    	g.drawOval((int)(Math.random() * super.getWidth()), (int)(Math.random() * super.getHeight()), diameter, diameter);
    	g.fillOval((int)(Math.random() * super.getWidth()), (int)(Math.random() * super.getHeight()), diameter, diameter);
    }
    
    
    
    
    
    
  }
}
