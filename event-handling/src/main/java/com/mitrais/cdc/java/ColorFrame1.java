package com.mitrais.cdc.java;

import java.awt.Color;
import javax.swing.*;

/*
 * Class main to run the ColorPanel1
 */

/**ColorFrame1 Class**/
public class ColorFrame1 extends JFrame {
	/**ColorFrame1 Constructor**/
  public ColorFrame1() {
    super("Separate Class as MouseListener");
    setContentPane(new ColorPanel1());
    setSize(600, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
  
  /**ColorFrame1 Main Method**/
  public static void main(String[] args) {
    new ColorFrame1();
  }
}
