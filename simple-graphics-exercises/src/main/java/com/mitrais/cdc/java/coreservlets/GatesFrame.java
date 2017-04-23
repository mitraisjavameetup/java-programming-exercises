package com.mitrais.cdc.java.coreservlets;

import java.awt.Color;

import javax.swing.*;
/**
 * 
 * @author trainee
 * GatesFrame Class
 */
public class GatesFrame extends JFrame {
	/**
	 * GatesFrame Constructor
	 * @param relativePath
	 */
  public GatesFrame(String relativePath) {
    super("Bill Gates");
    //complete the method to show image
   JFrame f=new JFrame();
   f.setSize(620, 490);
   f.setTitle("Circle");
   f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   f.setContentPane(new GatesPanel(relativePath));
   //f.add(new CirclePanel(Color.YELLOW));
   f.setVisible(true);
  
  
  }
  
  public static void main(String[] args) {
	//call method to show image on frame
	//image location is on images/gates-blue-screen.jpg
  new GatesFrame("images/gates-blue-screen.jpg");
  
  }
}
