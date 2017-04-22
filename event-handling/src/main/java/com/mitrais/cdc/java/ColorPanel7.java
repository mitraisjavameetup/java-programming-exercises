package com.mitrais.cdc.java;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

public class ColorPanel7 extends JPanel implements MouseListener {
	
	List<Circle> listCircle;
	int radius = 15;

	public ColorPanel7(){
		setBackground(Color.RED);
		listCircle = new ArrayList<Circle>();
		addMouseListener(this);
	}
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		for(Circle c :listCircle){
			g.setColor(Color.YELLOW);
			g.fillOval(c.getX(), c.getY(), c.getRadius(), c.getRadius());
		}
	}

	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getButton()== e.BUTTON1){
			listCircle.add(new Circle(this.radius, e.getX(), e.getY()));
		}else if(e.getButton() == e.BUTTON3){
			for(int i=0;i<listCircle.size();i++){
				double distance = Math.sqrt(Math.pow((listCircle.get(i).getX()+listCircle.get(i).getRadius()/2)-e.getX(), 2) - Math.pow((listCircle.get(i).getY()+listCircle.get(i).getRadius()/2)-e.getY(), 2));
				if(distance<=listCircle.get(i).getRadius()){
					listCircle.remove(i);
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
