package com.mitrais.cdc.java;

import java.awt.Color;
import javax.swing.*;



/*
 * Class main to run the ColorPanel3
 */
public class FrameCircle extends JFrame {
  public FrameCircle() {
    super("Circle ADD CLICK");
    setContentPane(new TaskCircle());
    setSize(600, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    JPanel circleP = new TaskCircle();
	this.add(circleP);
  }
  
  public static void main(String[] args) {
    new FrameCircle();
  }
}