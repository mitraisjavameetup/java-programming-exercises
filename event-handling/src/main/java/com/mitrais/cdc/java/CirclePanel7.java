package com.mitrais.cdc.java;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.*;
import javax.swing.event.MouseInputListener;

public class CirclePanel7 extends JPanel implements MouseListener{
	private int diameter = 50;
	private List<Circle> list;

	public CirclePanel7(Color bgColor){
		setBackground(bgColor);
		addMouseListener(this);
		list = new ArrayList<>();
	}

	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		for (Circle circle : list) {
			g.setColor(circle.getColor());
			g.fillOval(circle.getX(), circle.getY(), circle.getRadius(), circle.getRadius());
		}


	}

	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getButton() == e.BUTTON1) {
			list.add(new Circle(e.getX(), e.getY(), diameter, Color.RED));
		} else if(e.getButton() == e.BUTTON3) {
			double distance = 0;
			for (Iterator iterator = list.iterator(); iterator.hasNext();) {
				Circle c = (Circle) iterator.next();
				distance = distanceCalculator.euclianDistance(c.getX() + (c.getRadius()/2), c.getY() + (c.getRadius()/2), e.getX(), e.getY());
				if(distance <= c.getRadius()) {
					iterator.remove();
					break;
				}
			}
		}
		paintComponent(this.getGraphics());
	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}


}
