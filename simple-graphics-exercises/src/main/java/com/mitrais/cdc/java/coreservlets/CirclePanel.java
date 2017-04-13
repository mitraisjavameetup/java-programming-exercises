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
		//complete this method to display yellow rounds on screen
		setSize(getWidth(),getHeight());
		g.setColor(Color.YELLOW);
		for(int i=0;i<50;i++){
			g.fillOval((int)(Math.random()*super.getWidth()), (int)(Math.random()*super.getHeight()), diameter, diameter);
		}
	}
}
