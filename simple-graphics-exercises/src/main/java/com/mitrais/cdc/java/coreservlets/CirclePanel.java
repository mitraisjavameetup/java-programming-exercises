package com.mitrais.cdc.java.coreservlets;

import java.awt.*;
import java.util.Random;

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
    	g.setColor(Color.YELLOW);
    	Random ran = new Random();
    	int x = ran.nextInt(this.getWidth()-10);
    	int y = ran.nextInt(this.getHeight()-10);
		g.fillOval(x,y, 10, 10);
		
	}
    
    
    
    
    
    
    
  }
}
