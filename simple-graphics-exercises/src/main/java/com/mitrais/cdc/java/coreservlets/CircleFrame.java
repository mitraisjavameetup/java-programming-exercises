package com.mitrais.cdc.java.coreservlets;

import java.awt.*;

import javax.swing.*;

public class CircleFrame extends JFrame {
 
	/**Create a circle constructor**/
	public CircleFrame() {
    super("Drawing Shapes");
    //complete the method to show frame
    setSize(300,300);
    setContentPane(new CirclePanel(Color.yellow));
    setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    setVisible(true);
  
  
  }
  
	/**Main Method to create a frame**/
  public static void main(String[] args) {
	//call method to show frame
	  new CircleFrame();
  
  }
}
