package com.mitrais.cdc.java.coreservlets;

import java.awt.*;

import javax.swing.*;

public class CirclePanel extends JPanel {
	private int diameter = 20;
	public CirclePanel(Color bgColor) {
		setBackground(bgColor);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		// complete this method to display yellow rounds on screen
		int pos = 0;
		int posY = 0;
		
		g.setColor(Color.YELLOW);
		for (int i = 0; i < 50; i++) {
			pos = (int) (Math.random() * this.getWidth());
			posY = (int) (Math.random() * this.getHeight());
			g.fillOval(pos, posY, diameter, diameter);
			
		}		
	}
}
