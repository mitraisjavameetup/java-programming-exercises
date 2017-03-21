package com.mitrais.cdc.java;

import java.awt.Color;
import javax.swing.*;

/**
 * 
 * @author Relung Satria
 * Color Frame class
 *
 */
public class ColorFrame1 extends JFrame {
  public ColorFrame1() {
    super("Separate Class as MouseListener");
    setContentPane(new ColorPanel1());
    setSize(600, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
  
  public static void main(String[] args) {
    new ColorFrame1();
  }
}
