package com.mitrais.cdc.java.coreservlets;

import java.awt.*;
import javax.swing.*;

public class GatesPanel extends JPanel {
  private Image image;
  
  public GatesPanel(String relativePath) {
	//get image from relativePath, and store it into variable
	  try
	  {
	  image=Toolkit.getDefaultToolkit().getImage(relativePath);
	  }
	  catch (Exception e)
	  {
		  e.printStackTrace();
	  }
  
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.drawImage(image, 0, 0, this);
    g.setColor(Color.BLACK);
    g.fillRect(470, 200, 30, 20);
    //add mustache under here. PS: use simple line as his mustache
   // g.drawLine(x1, y1, x2, y2);
    
  
  }
}
