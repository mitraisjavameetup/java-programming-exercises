package com.mitrais.cdc.java.coreservlets;

import java.awt.*;

import javax.swing.*;

public class CirclePanel extends JPanel {
  private int diameter = 200; 
  
  public CirclePanel(Color bgColor) {
    setBackground(bgColor);
  }
  
  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    //complete this method to display yellow rounds on screen
    g.setColor(Color.WHITE);
    g.fillOval(150, 150, diameter, diameter);
  }
  
}
