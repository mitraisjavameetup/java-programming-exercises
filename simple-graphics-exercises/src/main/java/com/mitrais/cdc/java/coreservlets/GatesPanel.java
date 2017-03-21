package com.mitrais.cdc.java.coreservlets;

import java.awt.*;
import javax.swing.*;

public class GatesPanel extends JPanel {
  private Image image;
  
  public GatesPanel(String relativePath) {
	//get image from relativePath, and store it into variable
image= Toolkit.getDefaultToolkit().getImage(relativePath);
  
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.drawImage(image, 0, 0, getParent().getWidth(), getParent().getWidth(), Color.CYAN, this);
    g.setColor(Color.BLACK);
   g.fillRoundRect(getParent().getWidth()-82, getParent().getHeight()/2,10, 5, 3, 3);
   g.fillRoundRect(getParent().getWidth()-110, getParent().getHeight()/2-82,50, 40, 3, 3);
    //add mustache under here. PS: use simple line as his mustache

  
  }
}
