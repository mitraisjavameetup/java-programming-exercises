package com.mitrais.cdc.java;

import java.awt.*;
import java.awt.List;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;
/**
 * 
 * @author Relung Satria
 * Color Panel class
 *
 */
public class ColorPanel7 extends JPanel {
	private ArrayList<Circle> circles = new ArrayList<Circle>();
	
  public ColorPanel7() {
	  addMouseListener(new CircleDrawer()); 
  }
  @Override
  protected void paintComponent(Graphics g) {
      super.paintComponent(g);
      drawCircle();
  }
  
  public void drawCircle(){
	  Graphics g = this.getGraphics();
	  g.clearRect(0, 0, getWidth(), getHeight());
	  for(Circle c: circles){
		  g.setColor(Color.RED);
		  g.fillOval(c.getX() - (c.getD()/2), c.getY() - (c.getD()/2), c.getD(), c.getD());
	  }
	  System.out.println(circles.size());
  }

  private class CircleDrawer extends MouseAdapter implements MouseListener {
    public void mousePressed(MouseEvent e) {
    	int x = e.getX();
    	int y = e.getY();
    	
    	if(e.getButton() == MouseEvent.BUTTON1){
	    	circles.add(new Circle(x, y));
    	}
    	if(e.getButton() == MouseEvent.BUTTON3){
    		Iterator<Circle> i = circles.listIterator();
    		while(i.hasNext()){
    			Circle c = i.next();
    			double distance = Math.sqrt((x - c.getX()) * (x - c.getX()) + (y - c.getY()) * (y - c.getY()));
    			if(distance < c.getD()/2){
    				i.remove();
    			}
    		}
    	}
    	drawCircle();
    }
  }
  
  private class Circle {
	  int x, y;
	  int d = 50;
	  
	  public Circle(int x, int y){
		  this.x = x;
		  this.y = y;
	  }
	  public int getX(){
		  return x;
	  }
	  public int getY(){
		  return y;
	  }
	  public int getD(){
		  return d;
	  }
  }
}
