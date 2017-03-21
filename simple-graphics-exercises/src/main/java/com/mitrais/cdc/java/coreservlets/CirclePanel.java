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
		//complete this method to display yellow rounds on screen
		setSize(getParent().getWidth(), getParent().getHeight());
		
		for (int i = 0; i < 50; i++) {
			int batasX = (int) (Math.random()*this.getWidth());
			int batasY = (int) (Math.random()*this.getHeight());
			g.drawOval(batasX, batasY, this.diameter, this.diameter);
		}
	}
}
