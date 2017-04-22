package com.mitrais.cdc.java;

import java.awt.*;
import javax.swing.*;

/** TO DO 
 *  Change the background color when the user clicks.
 *  Please using a separate class as the mouse listener concept
 */

/**
 * Class to popup (JFrame) whose (JPanel) toggles back and forth between red and blue each time you click in the window
 * @author Egi
 * @version 1.0
 */
public class ColorPanel1 extends JPanel {
	/**
	* ColorPanel1 class constructor
	*/
	public ColorPanel1() {
		//TO DO
		//setBackground color as Red
		//call separate class that available (ColorListener.java) as the mouseListener
		setBackground(Color.RED);
		addMouseListener(new ColorListener(this));
	}
	 
	/**
	* Will change window background color to RED or BLUE
	*/
	public void swapColors() {
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
