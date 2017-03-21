package com.mitrais.cdc.java;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class ColorPanel6 extends JPanel implements MouseMotionListener {
	
	public ColorPanel6(){
		setBackground(Color.RED);
		addMouseMotionListener(this);
	}

	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getX()<getWidth()/2){
			setBackground(Color.RED);
		}else if(e.getX()>getWidth()/2){
			setBackground(Color.BLUE);
		}
	}

}
