package com.mitrais.cdc.java;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**TO DO
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

public class ColorPanel5 extends JPanel {
  public ColorPanel5() {
	//Set background color to Red
    //call KeyListener
	  setBackground(Color.RED);
	  setFocusable(true);
	  requestFocusInWindow();
	  addKeyListener(new ColorChanger());
  }
  
  private class ColorChanger extends KeyAdapter {
	@Override
	public void keyTyped(KeyEvent arg0) {
		/*TO DO
	       * give logic to set background color when user press "r", "y", "g", and "b" from keyboard
	       */
		if(arg0.getKeyChar()=='r')
			setBackground(Color.red);
		if(arg0.getKeyChar()=='y')
			setBackground(Color.yellow);
		if(arg0.getKeyChar()=='g')
			setBackground(Color.green);
		if(arg0.getKeyChar()=='b')
			setBackground(Color.blue);
	}

  }
}
