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
 * 
 * @author Relung Satria
 * Color Panel class
 *
 */
public class ColorPanel5 extends JPanel {
	private Color bg = Color.RED;
  public ColorPanel5() {
	//Set background color to Red
    //call KeyListener
	  setBackground(bg);
	  addKeyListener(new ColorChanger());
  	  setFocusable(true);
  	  requestFocusInWindow();
  }
  
  private class ColorChanger extends KeyAdapter {
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		super.keyTyped(e);
    	char key = e.getKeyChar();
    	System.out.println(key);

    	if(key == 'b')
    		bg = Color.BLUE;
    	if(key == 'r')
    		bg = Color.RED;
    	if(key == 'g')
    		bg = Color.GREEN;
    	if(key == 'y')
    		bg = Color.YELLOW;
    	
    	setBackground(bg);
	}
  }
}
