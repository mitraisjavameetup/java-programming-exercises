package com.mitrais.cdc.java.coreservlets;

import java.awt.*;
import javax.swing.*;

public class GatesPanel extends JPanel {
  private Image image;
  
  public GatesPanel(String relativePath) {
	//get image from relativePath, and store it into variable
	  image = Toolkit.getDefaultToolkit().getImage(relativePath);
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.drawImage(image, 0, 0, this);
    g.setColor(Color.BLACK);
    g.drawLine(470, 215, 500, 215);
    g.setColor(Color.RED);
    g.setFont(new Font("default", Font.BOLD, 16));
    g.drawString("WORKING IN MITRAIS", 400, 100);
    
    //add mustache under here. PS: use simple line as his mustache

  
  }
}
