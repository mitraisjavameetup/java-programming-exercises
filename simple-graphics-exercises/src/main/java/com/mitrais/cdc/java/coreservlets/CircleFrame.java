package com.mitrais.cdc.java.coreservlets;

import java.awt.*;

import javax.swing.*;

public class CircleFrame extends JFrame {
  public CircleFrame() {
    super("Drawing Shapes");
    //complete the method to show frame
    JFrame frame = new JFrame("Drawing Shapes");
    frame.setSize(400,400);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setContentPane(new CirclePanel(Color.RED));
    frame.setVisible(true);
  
  }
  
  public static void main(String[] args) {
	//call method to show frame
	 new CircleFrame();
  }
}
