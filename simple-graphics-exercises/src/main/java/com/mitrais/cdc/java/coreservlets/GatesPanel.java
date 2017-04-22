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
    //add mustache under here. PS: use simple line as his mustache
    g.setColor(Color.black);
    g.fillRect(475,213 , 20, 3);
  
  }
}
