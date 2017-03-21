package com.mitrais.cdc.java;

import java.awt.Color;
import javax.swing.*;

/*
 * Class main to run the ColorPanel3
 */

/**ColorFrame3 Class**/
public class ColorFrame3 extends JFrame {
	/**ColorFrame3 Constructor**/
  public ColorFrame3() {
    super("Named Inner Class");
    setContentPane(new ColorPanel3());
    setSize(600, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
  
  /**ColorFrame3 Main**/
  public static void main(String[] args) {
    new ColorFrame3();
  }
}
