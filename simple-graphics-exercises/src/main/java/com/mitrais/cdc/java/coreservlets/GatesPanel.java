package com.mitrais.cdc.java.coreservlets;

import java.awt.*;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class GatesPanel extends JPanel {
  private Image image;
  
  public GatesPanel(String relativePath)  {
	//get image from relativePath, and store it into variable
	 try {
		image = ImageIO.read(new File(relativePath));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.drawImage(image, 0,  0, this);
    
    //add mustache under here. PS: use simple line as his mustache

  
  }
}
