package com.mitrais.cdc.java.coreservlets;

import java.awt.*;
import java.util.Random;

import javax.swing.*;

public class CirclePanel extends JPanel {
	private int diameter = 20;

	public CirclePanel(Color bgColor) {
		setBackground(bgColor);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Random r = new Random();
		// complete this method to display yellow rounds on screen
		for (int i = 0; i < 50; i++) {
			g.setColor(Color.YELLOW);
			g.fillOval(r.nextInt(getWidth()), r.nextInt(getHeight()), diameter, diameter);
		}

	}
}
