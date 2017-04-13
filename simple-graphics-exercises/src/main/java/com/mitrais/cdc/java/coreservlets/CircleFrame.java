package com.mitrais.cdc.java.coreservlets;

import java.awt.*;

import javax.swing.*;

public class CircleFrame extends JFrame {
  public CircleFrame() {
    super("Drawing Shapes");
    setTitle("Circle");
    setContentPane(new CirclePanel(Color.red));
    setSize(1000,500);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    //complete the method to show frame
  }
  
  

  
  public static void main(String[] args) {
	  CircleFrame t = new CircleFrame();
	  t.paint(null);
	  
	  //call method to show frame

  
  }
}
