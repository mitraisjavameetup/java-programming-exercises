package com.mitrais.cdc.java;

import javax.swing.*;
/**
 * 
 * @author Relung Satria
 * Color Frame class
 *
 */
public class ColorFrame7 extends JFrame {
	
  public ColorFrame7() {
    super("Circle Drawer");
    setContentPane(new ColorPanel7());
    setSize(600, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
  
  public static void main(String[] args) {
    new ColorFrame7();
  }
}
