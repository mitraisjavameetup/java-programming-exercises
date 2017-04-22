package com.mitrais.cdc.java;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.*;

import javax.swing.*;

import javax.swing.JPanel;

import com.mitrais.cdc.java.Circle;

public class ColorPanel7 extends JPanel {
	int radius = 20;
	List<Circle> circleList;
	public ColorPanel7() {
		  setBackground(Color.RED);
		  circleList = new ArrayList<Circle>();
		  addMouseListener(new MouseListener() {
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				if (e.getButton() == MouseEvent.BUTTON1)
				{
					int X = e.getX();
					int Y = e.getY();
					Circle c1 = new Circle(X,Y,radius);
					circleList.add(c1);
				}else if (e.getButton() == MouseEvent.BUTTON3)
				{
					//remove
					int X = e.getX();
					int Y = e.getY();
					for (int i = 0; i<circleList.size();i++)
					{
						int minWidth = circleList.get(i).getX();
						int minHeight = circleList.get(i).getY();
						int maxWidth = circleList.get(i).getX()+circleList.get(i).getRadius();
						int maxHeight = circleList.get(i).getY()+circleList.get(i).getRadius();
						if ((X < maxWidth && X > minWidth) && (Y < maxHeight && Y > minHeight))
						{
							circleList.remove(i);
						}
					}
				}
				repaint();
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	  }
	@Override
	public void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.setColor(Color.YELLOW);
		for (int i = 0;i<circleList.size();i++)
		{
			int circleX = circleList.get(i).getX();
			int circleY = circleList.get(i).getY();
			int circleRadius = circleList.get(i).getRadius();
			g.fillOval(circleX, circleY, circleRadius, circleRadius);
		}
	}

	
}
