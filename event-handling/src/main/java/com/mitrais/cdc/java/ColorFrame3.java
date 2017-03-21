package com.mitrais.cdc.java;

import java.awt.Color;
import javax.swing.*;

/*
 * Class main to run the ColorPanel3
 */
public class ColorFrame3 extends JFrame {
  public ColorFrame3() {
    super("Named Inner Class");
    setContentPane(new ColorPanel3());
    setSize(600, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setVisible(true);
  }
  
  public static void main(String[] args) {
    new ColorFrame3();
  }
}
