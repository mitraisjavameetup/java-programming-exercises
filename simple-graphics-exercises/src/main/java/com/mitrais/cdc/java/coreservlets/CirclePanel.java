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
    
    for (int i = 0; i < 24; i++) {
    	 g.setColor(Color.yellow);
    	g.fillOval(i*20, 20, diameter, diameter);
    	g.fillOval(i*20, 45, diameter, diameter);
    	g.fillOval(i*20, 70, diameter, diameter);
    	g.fillOval(i*20, 95, diameter, diameter);
    	g.fillOval(i*20, 120, diameter, diameter);
    	g.fillOval(i*20, 145, diameter, diameter);
    	g.fillOval(i*20, 170, diameter, diameter);
    	g.fillOval(i*20, 195, diameter, diameter);
    	g.fillOval(i*20, 220, diameter, diameter);
    	g.fillOval(i*20, 245, diameter, diameter);
    	g.fillOval(i*20, 270, diameter, diameter);
    	g.fillOval(i*20, 295, diameter, diameter);
    	g.fillOval(i*20, 320, diameter, diameter);
    	g.fillOval(i*20, 345, diameter, diameter); 	
	}
   
    
   
    
    
  }
}
