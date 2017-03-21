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
	  setBackground(Color.RED);
	  addMouseListener(new ColorChanger());
	  
  }
  
  private class ColorChanger extends MouseAdapter {
    public void mousePressed(MouseEvent e) {
    	//TO DO
    	//Method to give logic to change the background color
    	//if the background is Red now change to blue, and vice versa
    	if(ColorPanel3.this.getBackground() == Color.RED) setBackground(Color.BLUE); else setBackground(Color.RED);
    }
  }
}
