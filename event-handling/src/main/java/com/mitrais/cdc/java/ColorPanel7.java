package com.mitrais.cdc.java;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.*;

import javax.swing.JPanel;

public class ColorPanel7 extends JPanel implements MouseListener{
	private int diameter = 20;
	private List<Circle> circles = new ArrayList<Circle>();
	public ColorPanel7() {
		setBackground(Color.RED);
		addMouseListener(this);
		
	}
	  
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
	    //complete this method to display yellow rounds on screen
	    int x;
	    int y;
	    for(int i=0; i<circles.size(); i++){
	    	x = circles.get(i).getX() - circles.get(i).getR();
	    	y = circles.get(i).getY() - circles.get(i).getR();
	    	g.drawOval(x, y, diameter, diameter);
	        g.setColor(Color.YELLOW);
	        g.fillOval(x, y, diameter, diameter);
	    }
	    
	}
	 
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void mousePressed(MouseEvent e) {
		if(e.getButton()==MouseEvent.BUTTON1){
			circles.add(new Circle(e.getX(), e.getY(), diameter));
			paintComponent(getGraphics());
			
		}
		else if(e.getButton()==MouseEvent.BUTTON3){
			for(int i=0; i<circles.size(); i++){
				if(circles.get(i).inCircle(e.getX(), e.getY())){
					circles.remove(i);
					paintComponent(getGraphics());
				}
			}
			
		}
		
	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
