package com.mitrais.cdc.java;

import java.awt.Color;
import javax.swing.*;

public class ColorFrame7 extends JFrame {
  public ColorFrame7() {
    super("Drawing Shapes");
    //complete the method to show frame
    setContentPane(new ColorPanel7());
    setSize(320,340);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  
  }
  
  public static void main(String[] args) {
	//call method to show frame
	  new ColorFrame7();
  
  }
}
