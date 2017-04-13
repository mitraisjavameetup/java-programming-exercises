package com.mitrais.cdc.java;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class ColorPanel6 extends JPanel implements MouseMotionListener {
	  public ColorPanel6() {

		  setBackground(Color.WHITE);
		  addMouseMotionListener(this);
		
	  }
	  
	    public void mouseMoved(MouseEvent e) {
	    	if(e.getX() < getWidth()/2) {
	    		setBackground(Color.BLUE);
	    	}
	    	else
	    		setBackground(Color.RED);
	    }

		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	  }
	
