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
    //complete this method to display yellow rounds on screen
    for (int i = 0; i < 50; i++) {
    	int x = (int)(Math.random()*this.getHeight());
    	int y = (int)(Math.random()*this.getWidth());
    	g.setColor(Color.YELLOW);
    	g.fillOval(x, y, diameter, diameter);
        
	}
  }
  
  
}
