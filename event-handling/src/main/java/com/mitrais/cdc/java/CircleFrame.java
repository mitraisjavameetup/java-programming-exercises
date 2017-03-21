package com.mitrais.cdc.java;

import java.awt.*;

import javax.swing.*;

public class CircleFrame extends JFrame {
  public CircleFrame() {
    super("Drawing Shapes");
    //complete the method to show frame
    setContentPane(new CirclePanel(Color.RED));
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(800, 480);
    setVisible(true);
  }
  
  public static void main(String[] args) {
	//call method to show frame
	new CircleFrame();
  }
}
