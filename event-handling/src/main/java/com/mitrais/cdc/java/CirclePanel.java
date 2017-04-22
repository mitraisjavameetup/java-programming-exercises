package com.mitrais.cdc.java;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

import java.util.concurrent.ThreadLocalRandom;

public class CirclePanel extends JPanel implements MouseListener {
	private int diameter = 20;
	private int x, y;

	public CirclePanel(Color bgColor) {
		setBackground(Color.red);
		addMouseListener(this);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.yellow);
		g.fillOval(x, y, diameter, diameter);
		g.drawOval(x, y, diameter, diameter);
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
		if (e.getButton() == MouseEvent.BUTTON3) {
			x = e.getX();
			y = e.getY();
			repaint();
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
