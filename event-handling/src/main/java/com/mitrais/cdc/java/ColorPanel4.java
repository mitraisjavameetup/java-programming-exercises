package com.mitrais.cdc.java;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/** TO DO 
 *  Change the background color when the user clicks.
 *  Please using an anonymous inner class as the mouse listener
 */

/**
 * Class to popup (JFrame) whose (JPanel) toggles back and forth between red and blue each time you click in the window
 * with a anonymous inner class
 * @author Egi
 * @version 1.0
 */
public class ColorPanel4 extends JPanel {
	/**
	 * ColorPanel4 class constructor
	 */
  public ColorPanel4() {
	//TO DO
	//setBackground color as Red
	setBackground(Color.RED);
	addMouseListener(new MouseListener() {
		/**
		 * auto generated method from MouseListener interface
		 */
		public void mouseClicked(MouseEvent arg0) {
			// TODO Auto-generated method stub
		}

		/**
		 * auto generated method from MouseListener interface
		 */
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
		}

		/**
		 * auto generated method from MouseListener interface
		 */
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub	
		}


		/**
		 * will change panel background from blue to red vice versa when mouse is pressed
		 */
		public void mousePressed(MouseEvent event) {
			// TODO Auto-generated method stub
			if(getBackground() == Color.RED) {
				setBackground(Color.BLUE);
			} else {
				setBackground(Color.RED);
			}
		}

		/**
		 * auto generated method from MouseListener interface
		 */
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
		}
	});
	  
    /**call anonymous inner class as mouseListener :
	*    addMouseListener({
	*      give logic to change the background color
	*      if the background is Red now change to blue, and vice versa
	*    });
	*/
  }
}
