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
    g.setColor(Color.YELLOW);
    for (int i=0;i<50;i++)
    {
    	//widht/height-20 so the circle not out of bounds
    	int randX = (int) (Math.random()*(this.getWidth()-20));
    	int randY = (int) (Math.random()*(this.getHeight()-20));
    	g.fillOval(randX, randY, diameter, diameter);
    }
    
    
    
    
    
    
    
    
  }
}
