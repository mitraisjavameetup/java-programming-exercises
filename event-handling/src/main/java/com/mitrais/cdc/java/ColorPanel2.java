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

	private boolean flag;
	private Color color;

	public ColorPanel2() {
		// TO DO
		// setBackground color as Red
		// call mouseListener
		this.setBackground(Color.RED);
		this.flag = true;
		this.addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub	
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		color = flag ? Color.RED : Color.BLUE;		
		setBackground(color);
		flag = !flag;
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	// TO DO
	// don't forget to override all methods of MouseListener Interface
	// let the override method empty if there is no need

}
