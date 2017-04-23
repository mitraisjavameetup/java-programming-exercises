package com.mitrais.cdc.java;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * TO DO Change the background color when the user clicks. Please using a named
 * inner class as the mouse listener
 */

public class ColorPanel3 extends JPanel {

	private boolean flag;
	private Color color;

	public ColorPanel3() {
		// TO DO
		// setBackground color as Red
		// call named inner class as mouseListener
		this.setBackground(Color.RED);
		this.flag = true;
		this.addMouseListener(new ColorChanger());
	}

	private class ColorChanger extends MouseAdapter {
		
		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			super.mousePressed(e);
			color = flag ? Color.RED : Color.BLUE;		
			setBackground(color);
			flag = !flag;
		}
		
	}
}
