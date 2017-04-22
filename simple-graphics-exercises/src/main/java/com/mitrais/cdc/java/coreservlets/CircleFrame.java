package com.mitrais.cdc.java.coreservlets;

import java.awt.*;

import javax.swing.*;

public class CircleFrame extends JFrame {
  public CircleFrame() {
    super("Drawing Shapes");
    //complete the method to show frame
    super.setSize(620, 624);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
	setVisible(true);
	JPanel circleP = new CirclePanel(Color.RED);
	this.add(circleP);
     
  
  }
  
  public static void main(String[] args) {
	//call method to show frame
new CircleFrame();
  
  }
}
