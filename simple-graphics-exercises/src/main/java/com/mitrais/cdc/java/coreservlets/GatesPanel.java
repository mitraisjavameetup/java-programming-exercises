package com.mitrais.cdc.java.coreservlets;

import java.awt.*;
import javax.swing.*;

public class GatesPanel extends JPanel {
  private Image image;
  
  public GatesPanel(String relativePath) {
	//get image from relativePath, and store it into variable
	  try {
		image = Toolkit.getDefaultToolkit().getImage(relativePath);
		ImageIcon i = new ImageIcon(image);
		setSize(i.getIconWidth(), i.getIconHeight());
	  } catch (Exception e) {
		// TODO: handle exception
	  }
  
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.drawImage(image, 0, 0, this);
    //add mustache under here. PS: use simple line as his mustache
    g.drawLine(470, 215, 480, 213);
    g.drawLine(494, 215, 500, 220);
    
  }
}
