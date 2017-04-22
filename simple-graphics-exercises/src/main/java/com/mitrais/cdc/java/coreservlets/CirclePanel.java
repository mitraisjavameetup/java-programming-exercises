package com.mitrais.cdc.java.coreservlets;

import java.awt.*;

import javax.swing.*;

public class CirclePanel extends JPanel {
  private int diameter = 20; 
  
  public CirclePanel(Color bgColor) {
    setBackground(bgColor);
  }
  
  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    int width = super.getWidth();
    int height = super.getHeight();
   
    //complete this method to display yellow rounds on screen
    g.setColor(Color.YELLOW);
    for(int i=0; i<50; i++){
    	g.fillOval((int)(Math.random()*width), (int)(Math.random()*height), diameter, diameter);
    } 
  }
}
