package com.mitrais.cdc.java.coreservlets;

import javax.swing.*;

public class GatesFrame extends JFrame {
  public GatesFrame(String relativePath) {
    super("Bill Gates");
    GatesPanel bill = new GatesPanel(relativePath);
    setContentPane(bill);
    setSize(bill.size.getIconWidth(), bill.size.getIconHeight());
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    //complete the method to show image

  
  
  
  }
  
  public static void main(String[] args) {
	  new GatesFrame("images/gates-blue-screen.jpg");
	//call method to show image on frame
	//image location is on images/gates-blue-screen.jpg

  
  }
}
