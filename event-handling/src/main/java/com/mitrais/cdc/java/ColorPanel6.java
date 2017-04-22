package com.mitrais.cdc.java;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;


public class ColorPanel6 extends JPanel {
	public ColorPanel6() {
		//Set background color to Red
	    //call KeyListener
		setBackground(Color.RED);
		setFocusable(true);
		requestFocusInWindow();
		addMouseMotionListener(new ColorChanger());
	  }
	  
	  private class ColorChanger implements MouseMotionListener {
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			if(e.getX() > 300) ColorPanel6.this.setBackground(Color.BLUE); else ColorPanel6.this.setBackground(Color.RED);
			
		}

		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	  }
}
