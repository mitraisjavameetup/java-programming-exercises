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
	//TO DO
	//setBackground color as Red
	//call named inner class as mouseListener
	  setBackground(Color.red);
	  addMouseListener(new ColorChanger());
  }
  
  private class ColorChanger extends MouseAdapter {
	  @Override
	public void mousePressed(MouseEvent e) {
		  if (getBackground() == Color.blue) {
		  		setBackground(Color.red);
  		} else{
  			setBackground(Color.blue);
  		}
	}
    
  }
}
