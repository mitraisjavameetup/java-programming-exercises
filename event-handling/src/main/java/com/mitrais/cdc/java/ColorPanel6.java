package com.mitrais.cdc.java;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class ColorPanel6 extends JPanel{
	public ColorPanel6() {
		setBackground(Color.WHITE);
		addMouseMotionListener(new ChangeColor());
		
	}
	public class ChangeColor extends MouseMotionAdapter{
		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			super.mouseMoved(e);
			if (e.getX()<(getWidth()/2)) {
				setBackground(Color.BLUE);
			}
			if (e.getX()>getWidth()/2) {
				setBackground(Color.RED);
			}
		}
	}
}
