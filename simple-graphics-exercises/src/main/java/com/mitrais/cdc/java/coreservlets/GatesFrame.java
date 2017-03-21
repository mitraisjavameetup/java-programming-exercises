package com.mitrais.cdc.java.coreservlets;

import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.*;

public class GatesFrame extends JFrame {
	static JPanel jPanel = new GatesPanel("images/gates-blue-screen.jpg");
  public GatesFrame(String relativePath) {
    super("Bill Gates");
    //complete the method to show image
    setSize(500, 500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  
  
  
  }
  
  public static void main(String[] args) {
	//call method to show image on frame
	//image location is on images/gates-blue-screen.jpg
	  GatesFrame frame1 = new GatesFrame("images/gates-blue-screen.jpg");
		frame1.add(jPanel);
  
  }
}
