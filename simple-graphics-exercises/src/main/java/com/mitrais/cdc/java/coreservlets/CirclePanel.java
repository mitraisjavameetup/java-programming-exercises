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
    //g.setColor(getBackground());

    Random rand = new Random();
    int x=0, y=0;
    for(int i=0;i<50;i++){
    	x=rand.nextInt(280);
    	y=rand.nextInt(280);
    	g.setColor(Color.black);
    	g.drawOval(x, y, diameter, diameter);
    	g.setColor(Color.yellow);
        g.fillOval(x, y, diameter, diameter);
    }
  }
}
