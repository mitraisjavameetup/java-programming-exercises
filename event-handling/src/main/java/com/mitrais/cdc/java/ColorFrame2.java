package com.mitrais.cdc.java;

import javax.swing.*;
import java.awt.Color;

/**
 * 
 * @author Relung Satria
 * Color Frame class
 *
 */
public class ColorFrame2 extends JFrame {
  public ColorFrame2() {
    super("Main JPanel implements MouseListener");
    setContentPane(new ColorPanel2());
    setSize(600, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
  
  public static void main(String[] args) {
    new ColorFrame2();
  }
}
