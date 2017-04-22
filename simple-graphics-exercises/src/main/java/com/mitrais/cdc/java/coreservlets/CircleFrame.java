package com.mitrais.cdc.java.coreservlets;

import java.awt.*;

import javax.swing.*;

public class CircleFrame extends JFrame {
  public CircleFrame() {
    super("Drawing Shapes");
    setContentPane(new CirclePanel(Color.blue));
    setSize(500,500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    //complete the method to show frame
    
  
  
  
  
  }
  
  public static void main(String[] args) {
	//call method to show frame
	  CircleFrame frame = new CircleFrame();
	  
  
  }
}
