package com.mitrais.cdc.java.coreservlets;

import java.awt.*;
import javax.swing.*;

public class GatesPanel extends JPanel {
  private Image image;
  
  public GatesPanel(String relativePath) {
	//get image from relativePath, and store it into variable
	  this.setSize(this.getWidth(), this.getHeight());
	  try {
		  image = Toolkit.getDefaultToolkit().getImage(relativePath);
		} catch (Exception e) {
			// TODO: handle exception
		}
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.drawImage(image, 0, 0, this);
    g.setColor(Color.YELLOW);
	g.fillOval(450, 200, 50, 50);
    //add mustache under here. PS: use simple line as his mustache
  }
}
