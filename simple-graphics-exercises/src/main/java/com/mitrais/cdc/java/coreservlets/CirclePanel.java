package com.mitrais.cdc.java.coreservlets;

import java.awt.*;
import java.util.Random;

import javax.swing.*;

public class CirclePanel extends JPanel {
  private int diameter = 20; 
  
  public CirclePanel(Color bgColor) {
    setBackground(bgColor);
    setSize(300,300);
    
  }
  
  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    //complete this method to display yellow rounds on screen
    int x;
    int y;
    Random r = new Random();
    for(int i=0; i<50; i++){
    	x = r.nextInt(300);
    	y = r.nextInt(300);
    	g.drawOval(x, y, diameter, diameter);
        g.setColor(Color.YELLOW);
        g.fillOval(x, y, diameter, diameter);
    }
    
  }
}
