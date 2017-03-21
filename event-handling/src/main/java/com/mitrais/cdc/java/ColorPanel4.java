package com.mitrais.cdc.java;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/**
 * TO DO Change the background color when the user clicks. Please using an
 * anonymous inner class as the mouse listener
 */

public class ColorPanel4 extends JPanel {
	
	private boolean flag;
	private Color color;
	
	public ColorPanel4() {
		// TO DO
		// setBackground color as Red
		this.setBackground(Color.RED);
		this.flag = true;
		

		/**
		 * call anonymous inner class as mouseListener : addMouseListener({ give
		 * logic to change the background color if the background is Red now
		 * change to blue, and vice versa });
		 */
		this.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				color = flag ? Color.RED : Color.BLUE;		
				setBackground(color);
				flag = !flag;
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
			}
		});
	}
}
