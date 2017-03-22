package com.mitrais.cdc.java;

import java.awt.Color;
import javax.swing.*;

/*
 * Class main to run the ColorPanel1
 */
public class ColorFrame6 extends JFrame {
  public ColorFrame6() {
    super("Left and Right Side Mouse");
    setContentPane(new ColorPanel6());
    setSize(600, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
  
  public static void main(String[] args) {
    new ColorFrame6();
  }
}