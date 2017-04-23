package com.mitrais.cdc.java;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.*;

public class CirclePanel extends JPanel implements MouseListener {
	
	private int diameter = 20;
	private List<Circle> listCircle;
	
	
	public CirclePanel(Color bgColor) {
		setBackground(bgColor);
		addMouseListener(this);
		listCircle = new ArrayList<>();
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		// complete this method to display yellow rounds on screen
		
		for (Circle c : listCircle) {
			g.setColor(c.getColor());
			g.fillOval(c.getX(), c.getY(), c.getRadius(), c.getRadius());
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getButton() == e.BUTTON1) {
			listCircle.add(new Circle(e.getX(), e.getY(), diameter, Color.YELLOW));
		} else if(e.getButton() == e.BUTTON3) {
			double dist = 0;
			for (Iterator iterator = listCircle.iterator(); iterator.hasNext();) {
				Circle c = (Circle) iterator.next();
				dist = Helper.euclideanDist(c.getX() + (c.getRadius()/2), c.getY() + (c.getRadius()/2), e.getX(), e.getY());
				if(dist <= c.getRadius()) {
					iterator.remove();
					break;
				}
			}
		}
		paintComponent(this.getGraphics());
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
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
