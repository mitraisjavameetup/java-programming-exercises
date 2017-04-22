package com.mitrais.cdc.java;

import java.awt.Color;
import javax.swing.*;

/*
 * Class main to run the ColorPanel3
 */
public class ColorFrame6 extends JFrame {
  public ColorFrame6() {
    super("Mouse Moved Named Inner Class");
    setContentPane(new ColorPanel6());
    setSize(600, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
  
  public static void main(String[] args) {
    new ColorFrame6();
  }
}