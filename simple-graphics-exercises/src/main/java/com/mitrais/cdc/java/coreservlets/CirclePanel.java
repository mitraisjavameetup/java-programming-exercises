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
  	  
   for (int i = 0; i < 2000; i = i + 30) {
	   
	   g.setColor(Color.YELLOW);
	  	g.fillOval(i, 0, diameter, diameter);
	  	g.fillOval(i, 30, diameter, diameter);
	  	g.fillOval(i, 60, diameter, diameter);
	  	g.fillOval(i, 90, diameter, diameter);
	  	g.fillOval(i, 120, diameter, diameter);
	  	g.fillOval(i, 150, diameter, diameter);
	  	g.fillOval(i, 180, diameter, diameter);
	  	g.fillOval(i, 210, diameter, diameter);
	  	g.fillOval(i, 240, diameter, diameter);
	  	g.fillOval(i, 270, diameter, diameter);
	  	
	  	
	  	  } 
   }//complete this method to display yellow rounds on screen
    
    
    
    
    
    
    
    
  }

