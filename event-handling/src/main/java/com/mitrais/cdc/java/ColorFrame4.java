package com.mitrais.cdc.java;

import java.awt.Color;

import javax.swing.*;

/*
 * Class main to run the ColorPanel4
 */
/**ColorFrame4 Class**/
public class ColorFrame4 extends JFrame {
	/**ColorFrame4 Constructor**/
  public ColorFrame4() {
    super("Anonymous Inner Class");
    setContentPane(new ColorPanel4());
    setSize(600, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
  
	/**ColorFrame4 Main**/
  public static void main(String[] args) {
    new ColorFrame4();
  }
}
