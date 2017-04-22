package com.mitrais.cdc.java;

import javax.swing.*;

/**
 * Class main to run the ColorPanel5
 * @author Egi
 * @version 1.0
 */
public class ColorFrame6 extends JFrame {
  public ColorFrame6() {
    super("Cursor position as MouseListener");
    setContentPane(new ColorPanel6());
    setSize(600, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
  
  public static void main(String[] args) {
    new ColorFrame6();
  }
}
