package com.mitrais.cdc.java;

import javax.swing.*;

/**ColorFrame5 Class**/
public class ColorFrame5 extends JFrame {
	
	/**ColorFrame5 Constructor**/
  public ColorFrame5() {
    super("KeyListener");
    setContentPane(new ColorPanel5());
    setSize(600, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
  
	/**ColorFrame5 Main**/
  public static void main(String[] args) {
    new ColorFrame5();
  }
}
