package com.mitrais.cdc.java.coreservlets;

import java.awt.*;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.*;

public class CirclePanel extends JPanel {
	private int diameter = 20;
	int i, y , x;
	

	public CirclePanel(Color bgColor) {
		setBackground(bgColor);

	}

	@Override
	protected void paintComponent(Graphics g) {

		super.paintComponent(g);
		// complete this method to display yellow rounds on screen
		g.setColor(Color.YELLOW);
		for (int i = 0; i < 50; i++) {
			x=ThreadLocalRandom.current().nextInt(getParent().getWidth());
			y=ThreadLocalRandom.current().nextInt(getParent().getHeight());
			g.fillOval(x, y, diameter, diameter);
			g.drawOval(x, y, diameter, diameter);
			
		}

	}
}
