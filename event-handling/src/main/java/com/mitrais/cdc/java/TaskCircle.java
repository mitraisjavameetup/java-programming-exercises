package com.mitrais.cdc.java;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.JPanel;

/**
 * TO DO Change the background color when the user clicks. Please using a named
 * inner class as the mouse listener
 */

public class TaskCircle extends JPanel {
	ArrayList<Integer> cirleListx = new ArrayList<>();
	ArrayList<Integer> cirleListy = new ArrayList<>();
	public TaskCircle() {
		// TO DO
		// setBackground color as Red
		// call named inner class as mouseListener
		setBackground(Color.red);
		addMouseListener(new CircleAdd());

	}

	private class CircleAdd extends MouseAdapter {

		@Override
		public void mousePressed(MouseEvent e) {
			// TO DO
			// Method to give logic to change the background color
			// if the background is Red now change to blue, and vice versa
Graphics g;
g.drawOval(e.getX(), e.getY(), arg2, arg3);
			cirleListx.add(e.getX());
			cirleListy.add(e.getY());
						
			
					}
		}
}