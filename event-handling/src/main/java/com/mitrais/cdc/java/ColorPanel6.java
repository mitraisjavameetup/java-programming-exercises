package com.mitrais.cdc.java;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class ColorPanel6 extends JPanel implements MouseMotionListener {
	public ColorPanel6() {
		// TO DO
		// setBackground color as Red
		// call named inner class as mouseListener
		setBackground(Color.red);
		addMouseMotionListener(this);
	}

	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub             
	}

	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getX() <= getParent().getWidth() / 2) {
			setBackground(Color.RED);
		} else {
			setBackground(Color.BLUE);
		}

	}
}