package com.mitrais.cdc.java;

import java.awt.*;import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.*;

/**
 * TO DO Change the background color when the user clicks. Please using a
 * separate class as the mouse listener concept
 */

public class ColorPanel1 extends JPanel {
	
	private boolean flag;
	private Color color;
	
	public ColorPanel1() {
		// TO DO
		// setBackground color as Red
		// call separate class that available (ColorListener.java) as the
		// mouseListener
		this.setBackground(Color.RED);
		this.flag = true;
		this.addMouseListener(new ColorListener(this));
	}

	public void swapColors() {
		// TO DO
		// Method to give logic to change the background color
		// if the background is Red now change to blue, and vice versa
		color = flag ? Color.RED : Color.BLUE;		
		setBackground(color);
		flag = !flag;
	}
}
