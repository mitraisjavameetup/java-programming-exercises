package com.mitrais.cdc.java;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.*;

/**
 * TO DO Change the background color when the user clicks. Please using itself
 * (which implements the MouseListener interface) as the mouse listener
 */

public class ColorPanel6 extends JPanel implements MouseMotionListener {

	public ColorPanel6() {
		// TO DO
		// setBackground color as Red
		// call mouseListener
		this.setBackground(Color.RED);
		this.addMouseMotionListener(this);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		int x = e.getX();
		
		if(x > this.getX() + this.getWidth()/2) {
			setBackground(Color.BLUE);
		} else if (x < this.getX() + this.getWidth()/2) {
			setBackground(Color.RED);
		} else {
			setBackground(Color.WHITE);
		}
	}

	

	// TO DO
	// don't forget to override all methods of MouseListener Interface
	// let the override method empty if there is no need

}
