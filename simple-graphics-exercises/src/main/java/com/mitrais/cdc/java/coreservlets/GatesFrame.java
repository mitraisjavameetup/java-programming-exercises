package com.mitrais.cdc.java.coreservlets;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.*;

public class GatesFrame extends JFrame {
	private Image image;
  public GatesFrame(String relativePath) {
    super("Bill Gates");
    //complete the method to show image
    JFrame frame = new JFrame("GatesFrame");
    frame.setSize(600, 450);
    frame.setContentPane(new GatesPanel(relativePath));
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);

  }
  
  public static void main(String[] args) {
	//call method to show image on frame
	//image location is on images/gates-blue-screen.jpg
	new GatesFrame("images/gates-blue-screen.jpg");
	
  }
}
