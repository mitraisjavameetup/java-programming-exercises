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
	  this.addMouseListener(new ColorChanger());
  }
  /**
   * 
   * @author Agus Mistiawan
   * Inner Class for color listener
   *
   */
  private class ColorChanger extends MouseAdapter {
	 @Override
  	public void mousePressed(MouseEvent event) {
    	//TO DO
    	//Method to give logic to change the background color
    	//if the background is Red now change to blue, and vice versa
		 if(getBackground()==Color.red){
				setBackground(Color.blue);
			}else{
				setBackground(Color.red);
			}
			repaint();
    }
  }
}
