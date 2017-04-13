package com.mitrais.cdc.java.coreservlets;

import javax.swing.*;

public class GatesFrame extends JFrame {
  public GatesFrame(String relativePath) {
    super("Bill Gates");
    //complete the method to show image
    GatesPanel gatesPanel = new GatesPanel(relativePath);
    setContentPane(gatesPanel);
    setSize(gatesPanel.imgIcon.getIconWidth(),gatesPanel.imgIcon.getIconHeight());
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  
  
  }
  
  public static void main(String[] args) {
	//call method to show image on frame
	//image location is on images/gates-blue-screen.jpg
	  GatesFrame gates = new GatesFrame("images/gates-blue-screen.jpg");
  
  }
}
