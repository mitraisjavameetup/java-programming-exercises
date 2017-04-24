package com.mitrais.cdc.java;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorPanel7 extends JPanel{

	public List<Circle> circles= new ArrayList<Circle>();
	
	
	public ColorPanel7()
	{
		setBackground(Color.CYAN);
		
		addMouseListener(new MouseListener() {
			
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				if (e.getButton()==MouseEvent.BUTTON1)
				{
					Circle c1= new Circle(e.getX(),e.getY(),20);
					circles.add(c1);
				}
				else if (e.getButton()==MouseEvent.BUTTON3)
				{
					for (int i=0;i<circles.size();i++)
					{
						int minXValue= circles.get(i).getX();
						int maxXValue= circles.get(i).getX()+circles.get(i).getRadius();
						int minYValue= circles.get(i).getY();
						int maxYValue= circles.get(i).getY()+circles.get(i).getRadius();

						
						if ((e.getX()>= minXValue && e.getX()<=maxXValue) && (e.getY()>= minYValue&& e.getY()<=maxYValue) )
						{
							
							circles.remove(i);
						}
					}
				}
				
				repaint();
			}

			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		
		});
		
	}

	@Override
	  protected void paintComponent(Graphics g) {
	    //complete this method to display yellow rounds on screen
		super.paintComponent(g);
		g.setColor(Color.BLUE);
		System.out.println(circles.size());
		for (Circle test : circles)
		{
			g.fillOval(test.getX(), test.getY(), test.getRadius(), test.getRadius());
		}
	  }
	
	
}
