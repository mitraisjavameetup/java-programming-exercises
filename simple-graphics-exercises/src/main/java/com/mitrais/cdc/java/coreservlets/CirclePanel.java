package com.mitrais.cdc.java.coreservlets;

import java.awt.*;

import javax.swing.*;

/**
 * Panel for drawing in CircleFrame
 * @author Egi
 * @version 1.0
 */
public class CirclePanel extends JPanel {
  private int diameter = 20; 
  
  /**
   * CirclePanel class constructor
   * @param bgColor
   */
  public CirclePanel(Color bgColor) {
    setBackground(bgColor);
  }
  
  /**
   * Override paintComponent for drawing 50 yellow circles randomly
   */
  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    //complete this method to display yellow rounds on screen

    for (int i = 0; i < 50; i++) {
		int x = (int) (Math.random() * super.getWidth());
		int y = (int) (Math.random() * super.getHeight());
		
		g.setColor(Color.YELLOW);
		g.fillOval(x, y, diameter, diameter);
	}
  }
}
