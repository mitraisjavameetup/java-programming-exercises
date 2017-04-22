package com.mitrais.cdc.java.coreservlets;

import java.awt.Color;

import javax.swing.*;

/**
 * Frame for Bill Gates graffiti
 * @author Egi
 * @version 1.0
 */
public class GatesFrame extends JFrame {
  /**
   * GatesFrame class constructor
   * @param relativePath
   */
  public GatesFrame(String relativePath) {
    super("Bill Gates");
    //complete the method to show image
    setContentPane(new GatesPanel(relativePath));
    setSize(600, 500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
  
  /**
   * GatesFrame class maint method
   * @param args
   */
  public static void main(String[] args) {
	//call method to show image on frame
	//image location is on images/gates-blue-screen.jpg
	new GatesFrame("images/gates-blue-screen.jpg");
  }
}
