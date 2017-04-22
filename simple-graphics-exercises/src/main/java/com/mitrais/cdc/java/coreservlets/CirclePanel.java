package com.mitrais.cdc.java.coreservlets;

import java.awt.*;
import java.util.concurrent.ThreadLocalRandom;

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
    for (int i = 0; i < 50; i++) {
    	int randx = ThreadLocalRandom.current().nextInt(1,getParent().getWidth());
    	int randy = ThreadLocalRandom.current().nextInt(1,getParent().getHeight());
    	g.fillOval(randx, randy, diameter, diameter);
    	g.drawOval(randx, randy, diameter, diameter);
	}
    
    
  }
}
