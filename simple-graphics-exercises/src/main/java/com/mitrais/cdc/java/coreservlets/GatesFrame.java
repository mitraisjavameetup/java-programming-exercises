package com.mitrais.cdc.java.coreservlets;

import java.awt.Color;

import javax.swing.*;

public class GatesFrame extends JFrame {
  public GatesFrame(String relativePath) {
    super("Bill Gates");
    //complete the method to show image
setSize(420, 424);
setDefaultCloseOperation(EXIT_ON_CLOSE);
setVisible(true);
JPanel Bill = new GatesPanel(relativePath);
this.add(Bill);
 
  
  
  }
  
  public static void main(String[] args) {
	//call method to show image on frame
	//image location is on images/gates-blue-screen.jpg
new GatesFrame("images/gates-blue-screen.jpg");
  
  }
}
