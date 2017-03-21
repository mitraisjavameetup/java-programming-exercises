package com.mitrais.cdc.java.coreservlets;

import java.awt.*;

import javax.swing.*;

public class CircleFrame extends JFrame {
	static JPanel jPanel = new CirclePanel(Color.RED);
  public CircleFrame() {
    super("Drawing Shapes");
    //complete the method to show frame
    setSize(500, 500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  
  
  
  
  }
  
  public static void main(String[] args) {
	//call method to show frame
	  CircleFrame frame1 = new CircleFrame();
		frame1.add(jPanel);
  
  }
}
