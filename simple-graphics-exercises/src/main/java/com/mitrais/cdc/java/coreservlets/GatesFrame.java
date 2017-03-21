package com.mitrais.cdc.java.coreservlets;

import javax.swing.*;

public class GatesFrame extends JFrame {
  public GatesFrame(String relativePath) {
    super("Bill Gates");
    //complete the method to show image
    GatesPanel gp = new GatesPanel(relativePath);
    setContentPane(gp);
    //setSize(615,490);
    setSize(gp.getWidth()+15, gp.getHeight()+35);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
  
  public static void main(String[] args) {
	//call method to show image on frame
	//image location is on images/gates-blue-screen.jpg
	  new GatesFrame("images/gates-blue-screen.jpg");
	  
  }
}
