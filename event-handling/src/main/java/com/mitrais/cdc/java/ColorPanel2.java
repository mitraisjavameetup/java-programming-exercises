package com.mitrais.cdc.java;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

/**
 * TO DO Change the background color when the user clicks. Please using itself
 * (which implements the MouseListener interface) as the mouse listener
 */

public class ColorPanel2 extends JPanel implements MouseListener {
	public ColorPanel2() {
		// TO DO
		// setBackground color as Red
		// call mouseListener
		setBackground(Color.RED);
		addMouseListener(this);
	}

	public void mousePressed() {
		// TO DO
		// Method to give logic to change the background color
		// if the background is Red now change to blue, and vice versa
		if (getBackground().equals(Color.RED)) {
			setBackground(Color.BLUE);
		} else {
			setBackground(Color.RED);
		}
	}

	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		mousePressed();

	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	// TO DO
	// don't forget to override all methods of MouseListener Interface
	// let the override method empty if there is no need

}
