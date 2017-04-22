package com.mitrais.cdc.java;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ColorPanel6 extends JPanel {
	public ColorPanel6() {
		// Set background color to Red
		// call mouseListener
		addMouseMotionListener(new ColorChanger());
		//setFocusable(true);
		//requestFocusInWindow();
	}

	private class ColorChanger extends MouseMotionAdapter {
		public void mouseMoved(MouseEvent e) {
			if(e.getX()<getWidth()/2){
				setBackground(Color.BLUE);
			}
			else{
				setBackground(Color.RED);
			}
		}
	}

}
