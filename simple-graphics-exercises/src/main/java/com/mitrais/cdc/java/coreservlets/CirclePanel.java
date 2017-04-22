package com.mitrais.cdc.java.coreservlets;

import java.awt.*;
import javax.swing.*;
import java.util.concurrent.ThreadLocalRandom;

public class CirclePanel extends JPanel {
	private int diameter = 20;

	public CirclePanel(Color bgColor) {
		setBackground(bgColor);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		// complete this method to display yellow rounds on screen
		g.setColor(Color.yellow);
		for (int i = 1; i <= 50; i++) {
			int randomx = ThreadLocalRandom.current().nextInt(getParent().getWidth() + 1);
			int randomy = ThreadLocalRandom.current().nextInt(getParent().getHeight() + 1);
			g.fillOval(randomx, randomy, diameter, diameter);
			g.drawOval(randomx, randomy, diameter, diameter);
		}
	}
}
