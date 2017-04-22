package com.mitrais.cdc.java.coreservlets;

import javax.swing.*;

public class GatesFrame extends JFrame {
  public GatesFrame(String relativePath) {
    super("Bill Gates");
    GatesPanel gate = new GatesPanel(relativePath);
    setContentPane(gate);
    setSize(gate.i.getIconWidth(),gate.i.getIconHeight());
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
  
  public static void main(String[] args) {
	//call method to show image on frame
	//image location is on images/gates-blue-screen.jpg
	  
	  new GatesFrame("images/gates-blue-screen.jpg");
  
  }
}
