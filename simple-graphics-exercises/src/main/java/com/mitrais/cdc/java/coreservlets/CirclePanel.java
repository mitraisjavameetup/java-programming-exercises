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
	g.setColor(Color.YELLOW);
	Random rng = new Random();
    //complete this method to display yellow rounds on screen
    for (int x = 0; x < 50; x++)
    {
        g.fillOval(rng.nextInt(getWidth() - 20), rng.nextInt(getHeight() - 20), diameter, diameter);
    }
  }
}
