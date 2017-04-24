package com.mitrais.cdc.java;

import javax.swing.*;
import java.awt.Color;

/*
 * Class main to run the ColorPanel2
 */

/**ColorFrame2 Class**/
public class ColorFrame2 extends JFrame 
/**ColorFrame2 Constructor**/{
  public ColorFrame2() {
    super("Main JPanel implements MouseListener");
    setContentPane(new ColorPanel2());
    setSize(600, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
  
  /**ColorFrame2 Main Method**/
  public static void main(String[] args) {
    new ColorFrame2();
  }
}
