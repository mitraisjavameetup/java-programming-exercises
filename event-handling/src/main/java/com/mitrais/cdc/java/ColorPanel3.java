package com.mitrais.cdc.java;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/** TO DO 
 *  Change the background color when the user clicks.
 *  Please using a named inner class as the mouse listener
 */

public class ColorPanel3 extends JPanel {
	private Color color;
	private boolean status;
	public ColorPanel3() {
		//TO DO
		//setBackground color as Red
		//call named inner class as mouseListener
		setBackground(Color.RED);
		status = true;
		addMouseListener(new ColorChanger());
	}

	private class ColorChanger extends MouseAdapter {
		//adding MouseEvent e because it isn't there before
		public void mousePressed(MouseEvent e) {
			//TO DO
			//Method to give logic to change the background color
			//if the background is Red now change to blue, and vice versa
			color = (status) ? Color.RED : Color.BLUE;
			setBackground(color);
			status = !status;
		}
	}
}
