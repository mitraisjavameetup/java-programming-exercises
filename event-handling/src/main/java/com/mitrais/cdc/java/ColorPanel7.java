package com.mitrais.cdc.java;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

public class ColorPanel7 extends JPanel implements MouseListener{

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);

	}

	List<Circle> circles = new ArrayList<Circle>();
	public ColorPanel7(){
		setBackground(Color.RED);
		addMouseListener(this);
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

	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getButton() == MouseEvent.BUTTON1){
			Circle c = new Circle(arg0.getX(),arg0.getY());
			circles.add(c);
			drawCircle();
		}
		if(arg0.getButton() == MouseEvent.BUTTON3){
			removeCircle(arg0.getX(),arg0.getY());
			
			drawCircle();
		}
	}

	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	private void drawCircle(){
		setBackground(Color.RED);
		setSize(getWidth(),getHeight());
		Graphics g = this.getGraphics();
		g.setColor(Color.YELLOW);
		for(int i =0;i<circles.size();i++){
			g.fillOval(circles.get(i).getX(), circles.get(i).getY(), circles.get(i).getR(), circles.get(i).getR());
		}
	}
	private void removeCircle(int x, int y){
		for(int i =0; i<circles.size();i++){
			if(circles.get(i).insideCircle(x, y)){

				setBackground(Color.RED);
				Graphics g = this.getGraphics();
				g.setColor(Color.RED);
				g.fillOval(circles.get(i).getX(), circles.get(i).getY(), circles.get(i).getR(), circles.get(i).getR());
				circles.remove(i);
			}
		}
	}

}
