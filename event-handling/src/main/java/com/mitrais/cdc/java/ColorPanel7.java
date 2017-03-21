package com.mitrais.cdc.java;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

public class ColorPanel7 extends JPanel {

	public ColorPanel7(){
		
	}
	private class ColorChanger extends MouseAdapter {
		public void mousePressed(MouseEvent e) {
			//TO DO
			//Method to give logic to change the background color
			//if the background is Red now change to blue, and vice versa
			if(getBackground() == Color.RED){
				setBackground(Color.BLUE);
			}
			else{
				setBackground(Color.RED);
			}
		}
	}
}
