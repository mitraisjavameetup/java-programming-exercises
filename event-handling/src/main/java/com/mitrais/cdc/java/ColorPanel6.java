package com.mitrais.cdc.java;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JPanel;

public class ColorPanel6 extends JPanel{
	public ColorPanel6(){
		setBackground(Color.RED);
		addMouseMotionListener(new ColorsChanger());
	}
	private class ColorsChanger extends MouseMotionAdapter{

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			super.mouseMoved(e);
			if(e.getX() <= getWidth()/2){
				setBackground(Color.RED);
			}
			else{
				setBackground(Color.BLUE);
			}
		}
		
	}
}
