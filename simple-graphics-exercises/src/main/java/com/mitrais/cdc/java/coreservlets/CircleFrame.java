package com.mitrais.cdc.java.coreservlets;

import java.awt.*;

import javax.swing.*;

public class CircleFrame extends JFrame {
  public CircleFrame() {
	//complete the method to show frame
    super("Drawing Shapes");
    setContentPane(new CirclePanel(Color.red));
    setSize(320,340);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);

  }
  
  public static void main(String[] args) {
	//call method to show frame
	  new CircleFrame();
  
  }
}
