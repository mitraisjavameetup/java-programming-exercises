package com.mitrais.cdc.java;

import java.awt.Color;
import javax.swing.*;

/*
 * Class main to run the ColorPanel1
 */
public class ColorFrame7 extends JFrame {
  public ColorFrame7() {
    super("Motion Listener");
    setContentPane(new ColorPanel7());
    setSize(600, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
  
  public static void main(String[] args) {
    new ColorFrame7();
  }
}
