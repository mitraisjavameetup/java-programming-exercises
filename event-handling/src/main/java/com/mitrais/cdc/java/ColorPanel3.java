package com.mitrais.cdc.java;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/** TO DO 
 *  Change the background color when the user clicks.
 *  Please using a named inner class as the mouse listener
 */
/**
 * 
 * @author Relung Satria
 * Color Panel class
 *
 */
public class ColorPanel3 extends JPanel {
	private Color bg;
  public ColorPanel3() {
	//TO DO
	//setBackground color as Red
	//call named inner class as mouseListener
	  bg = Color.RED;
	  setBackground(bg);
	  addMouseListener(new ColorChanger()); 
  }

  private class ColorChanger extends MouseAdapter implements MouseListener {
    public void mousePressed(MouseEvent e) {
    	//TO DO
    	//Method to give logic to change the background color
    	//if the background is Red now change to blue, and vice versa
    	swapColor();
    }
    
    private void swapColor(){
   	 if(bg == Color.RED){
   		  bg = Color.BLUE;
   	  } else {
   		  bg = Color.RED;
   	  }
   	  setBackground(bg);
    }
  }
}
