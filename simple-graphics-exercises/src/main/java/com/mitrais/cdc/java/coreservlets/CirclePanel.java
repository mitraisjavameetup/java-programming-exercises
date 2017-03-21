package com.mitrais.cdc.java.coreservlets;

import java.awt.*;

import javax.swing.*;

public class CirclePanel extends JPanel {
  private int diameter = 20; 
  
  
  public CirclePanel(Color bgColor) {
    setBackground(bgColor);
  }
  
  /**Create a random circle**/
  @Override
  protected void paintComponent(Graphics g) {
    //complete this method to display yellow rounds on screen
	  g.setColor(Color.yellow);
	  
	  int tampung;
	  int tampung1;
	 for (int i=0;i<50;i++)
	 {
		 tampung=(int) (getWidth()*Math.random()+(Math.random()*10));
		 tampung1=(int)(getHeight()*Math.random()+(Math.random()*10));
	  g.fillOval(130-tampung, 100-tampung, diameter, diameter);
	 }
    
  
    
    
    
    
    
    
  }
}
