package com.mitrais.cdc.java;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*TO DO
 * Make a popup window that turns:
 * red when you press “r”, 
 * yellow when you press “y”, 
 * green when you press “g”, 
 * and blue when you press “b”. 
 * Use a KeyListener or KeyAdapter, and the keyTyped method. 
 * The notes show how to get a String from the KeyEvent. However, panels normally ignore 
 * keyboard events, so to make them respond, you must add these two lines to the constructor of your 
 * JPanel subclass:
 * -setFocusable(true);
 * -requestFocusInWindow();
 */

/**
 * Class to popup (JFrame) whose (JPanel) toggles back and forth between red and blue each time you click in the window
 * by mouse position on the window
 * @author Egi
 * @version 1.0
 */
public class ColorPanel6 extends JPanel {
  /**
   * ColorPanel6 constructor
   */
  public ColorPanel6() {
	//Set background color to Red
    //call KeyListener
	setBackground(Color.RED);
	addMouseMotionListener(new ColorChanger());
  }
  
  private class ColorChanger extends MouseMotionAdapter {
	/**
	 * Will change panel background based on cursor position
	 */
    public void mouseMoved(MouseEvent event) {
    	if(event.getX() < (getWidth() / 2)) {
    		setBackground(Color.BLUE);
    	} else {
    		setBackground(Color.RED);
    	}
    }
  }
}
