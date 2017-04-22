package com.mitrais.cdc.java;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JPanel;


public class ColorPanel6 extends JPanel {

	 public ColorPanel6() {
			  setBackground(Color.RED);
			  setFocusable(true);
			  requestFocusInWindow();
			  addMouseMotionListener(new MouseMotionAdapter() {
				@Override
				public void mouseMoved(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
					if(arg0.getXOnScreen()<getWidth()/2)
						setBackground(Color.RED);
					if(arg0.getXOnScreen()>getWidth()/2)
						setBackground(Color.BLUE);
				}
			});
		  }

}
