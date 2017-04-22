package com.mitrais.cdc.java.coreservlets;

import javax.script.ScriptException;
import javax.swing.*;

public class GatesFrame extends JFrame {
  public GatesFrame(String relativePath) {
    super("Bill Gates");
    //complete the method to show image
    JFrame frame = new JFrame("Bill Gates");
    frame.setSize(500, 500);
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
