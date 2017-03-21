package com.mitrais.cdc.java.coreservlets;

import java.awt.*;

import javax.swing.*;
/**
 * 
 * @author trainee
 * CircleFrame Class
 */
public class CircleFrame extends JFrame {
	/**
	 * constructor of Circleframe
	 */
  public CircleFrame() {
    super("Drawing Shapes");
    //complete the method to show frame
    JFrame f=new JFrame();
	f.setSize(500, 500);
    f.setTitle("Circle");
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setContentPane(new CirclePanel(Color.BLUE));
    f.setVisible(true);
  
  
  }
  
  public static void main(String[] args) {
	//call method to show frame
	  new CircleFrame();
	  
  }
}
