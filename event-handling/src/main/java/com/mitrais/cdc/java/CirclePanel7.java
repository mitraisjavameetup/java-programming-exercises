package com.mitrais.cdc.java;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.SwingUtilities;
/**
 * 
 * @author trainee
 *
 */
public class CirclePanel7 extends JPanel{
	
	List<Integer> x=new ArrayList<Integer>(); 
	List<Integer> y=new ArrayList<Integer>(); 
	protected void paintComponent(Graphics g) {
	   setBackground(Color.white);
	    //complete this method to display yellow rounds on screen
	    
	    
	  }
	/**
	 *  mouse listener
	 */
	public CirclePanel7(){
		addMouseListener(new CircleDrawer());
	}
	/**
	 * draw circle
	 * @param x
	 * @param y
	 */
	public void DrawCircle(int x,int y){
		this.x.add(x);
		this.y.add(y);
		
		for(int i=0;i<this.x.size();i++){
		Graphics g=this.getGraphics();
		g.setColor(Color.YELLOW);
	    g.fillOval(this.x.get(i), this.y.get(i), 100, 100);
		}
	}
	/**
	 * erase circle
	 * @param x
	 * @param y
	 */
	public void ErasCircle(int x,int y){
		for(int i=0;i<this.x.size();i++){
			double distance=Math.sqrt(Math.pow(x-this.x.get(i),2)+Math.pow(y-this.y.get(i),2));
			if(distance<=(double)100){
				Graphics g=this.getGraphics();
				g.setColor(Color.black);
			    g.fillOval(this.x.get(i), this.y.get(i), 100, 100);
				this.x.remove(i);
				this.y.remove(i);
			}
		}
		
	}
	 private class CircleDrawer extends MouseAdapter {
			@Override
		    public void mousePressed(MouseEvent e) {
		    	
		    	if(e.getButton()==MouseEvent.BUTTON1){
		    		DrawCircle(e.getX(), e.getY());
		    	}
		    	else{
		    		
		    		ErasCircle(e.getX(), e.getY());
		    	}
		    }
			
		  }
}


