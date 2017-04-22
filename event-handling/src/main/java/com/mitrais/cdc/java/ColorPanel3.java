package com.mitrais.cdc.java;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/** TO DO 
 *  Change the background color when the user clicks.
 *  Please using a named inner class as the mouse listener
 */

/**
 * Class to popup (JFrame) whose (JPanel) toggles back and forth between red and blue each time you click in the window
 * with a named inner class
 * @author Egi
 * @version 1.0
 */
public class ColorPanel3 extends JPanel {
  /**
   * ColorPanel3 calass constructor
   */
  public ColorPanel3() {
	//TO DO
	//setBackground color as Red
	//call named inner class as mouseListener
	setBackground(Color.RED);
	addMouseListener(new ColorChanger());
  }
  
  private class ColorChanger extends MouseAdapter {
	/**
	 * will change panel background from blue to red vice versa when mouse is pressed
	 */
    public void mousePressed(MouseEvent event) {
    	//TO DO
    	//Method to give logic to change the background color
    	//if the background is Red now change to blue, and vice versa
    	if(getBackground() == Color.RED) {
    		setBackground(Color.BLUE);
    	} else {
    		setBackground(Color.RED);
    	}
    }
  }
}
