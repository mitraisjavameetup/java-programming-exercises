package com.mitrais.cdc.java;
/**
 * Circle Frame
 */
import java.awt.*;

import javax.swing.*;

public class CircleFrame extends JFrame {
  public CircleFrame() {
    super("Drawing Shapes");
    //complete the method to show frame
    setContentPane(new CirclePanel(Color.pink));
    setSize(500,500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setVisible(true);
  }
  
  public static void main(String[] args) {
	//call method to show frame
	 new CircleFrame();
  
  }
}
