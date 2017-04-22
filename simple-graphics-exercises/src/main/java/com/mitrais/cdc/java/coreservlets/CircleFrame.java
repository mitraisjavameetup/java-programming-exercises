package com.mitrais.cdc.java.coreservlets;

import java.awt.*;

import javax.swing.*;

/**
 * Class that make a red popup window that draws 50 yellow circles randomly
 * @author Egi
 * @version 1.0
 */
public class CircleFrame extends JFrame {
  /**
   * CircleFrame class constructor
   */
  public CircleFrame() {
    super("Drawing Shapes");
    //complete the method to show frame
    setContentPane(new CirclePanel(Color.RED));
    setSize(500, 500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }

  /**
   * CircleFrame class main method
   */
  public static void main(String[] args) {
	//call method to show frame
	new CircleFrame();
  }
}
