package com.mitrais.cdc.java;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import javax.swing.JPanel;

public class ColorPanel6 extends JPanel implements MouseMotionListener{
	  public ColorPanel6() {
		  setBackground(Color.RED);
		  addMouseMotionListener(this);
	  }

	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseMoved(MouseEvent e) {
		if(e.getX()<getWidth()/2) setBackground(Color.RED);
		else setBackground(Color.BLUE);
		
	}
	  
	  
	  
//	  private class ColorChanger extends MouseMotionAdapter {
//
//		@Override
//		public void mouseMoved(MouseEvent e) {
//			// TODO Auto-generated method stub
//			super.mouseMoved(e);
//			if(e.getX()<getWidth()/2) setBackground(Color.RED);
//			else setBackground(Color.BLUE);
//		}
//		  
//	  }
}
