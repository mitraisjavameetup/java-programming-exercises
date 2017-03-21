package com.mitrais.cdc.java;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JPanel;

/** using Mouse Motion Listener*/
public class ColorPanel6 extends JPanel{
	public ColorPanel6() {
		//Set background color to Red
		setFocusable(true);
		requestFocusInWindow();
		setBackground(Color.RED);
	    //call MotionListener
		addMouseMotionListener(new ColorChanger());
	  }
	
	/** Change the background color*/
	private class ColorChanger extends MouseMotionAdapter {
	    public void mouseMoved(MouseEvent e) {
	    	if(e.getX() < getWidth()/2){
		  	  setBackground(Color.RED);
		  	}
		  	else{
		  	  setBackground(Color.BLUE);
		  	}
	    }
	  }
}
