package com.mitrais.cdc.java;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/** TO DO 
 *  Change the background color when the user clicks.
 *  Please using a named inner class as the mouse listener
 */

public class ColorPanel3 extends JPanel {
  public ColorPanel3() {

	  setBackground(Color.RED);
	  addMouseListener(new ColorChanger());
	  
	  
	  
	//TO DO
	//setBackground color as Red
	//call named inner class as mouseListener
  }
  
  private class ColorChanger extends MouseAdapter {
   @Override
public void mousePressed(MouseEvent e) {
	   if (getBackground() == Color.BLUE) {
	  		  setBackground(Color.RED);
	  		  }
	   else
	  		  setBackground(Color.BLUE);
	
   		}
	  
	 
    	
    	//TO DO
    	//Method to give logic to change the background color
    	//if the background is Red now change to blue, and vice versa
    
  }
}
