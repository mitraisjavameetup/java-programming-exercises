package com.mitrais.cdc.java.coreservlets;

import java.awt.*;

import javax.swing.*;

public class CircleFrame extends JFrame {
  public CircleFrame() {
    super("Drawing Shapes");
    //complete the method to show frame
    JFrame frame = new JFrame("CircleFrame");
    frame.setContentPane(new CirclePanel(Color.RED));
    frame.setSize(500, 500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
  
  public static void main(String[] args) {
	//call method to show frame
	  new CircleFrame();
  }
}
