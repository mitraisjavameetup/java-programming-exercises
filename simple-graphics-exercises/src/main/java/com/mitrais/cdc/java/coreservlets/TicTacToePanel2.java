package com.mitrais.cdc.java.coreservlets;

import java.awt.*;
import javax.swing.*;

public class TicTacToePanel2 extends JPanel {

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		// add code to show lines, so it look like tic tac toe board
		int WIDTH, HEIGHT;
//		HEIGHT = WIDTH = getParent().getWidth() < getParent().getHeight() ? getParent().getWidth() : getParent().getHeight(); 
		WIDTH = getParent().getWidth();
		HEIGHT = getParent().getHeight();

		super.paintComponent(g);
		// add code to show lines, so it look like tic tac toe board
		this.setSize(WIDTH, HEIGHT);
		g.setColor(Color.BLACK);

		// vertical
		g.drawLine(0, 0, WIDTH, 0);
		g.drawLine(WIDTH / 3, 0, WIDTH / 3 * 1, HEIGHT);
		g.drawLine(WIDTH / 3 * 2, 0, WIDTH / 3 * 2, HEIGHT);
		g.drawLine(WIDTH-1, 0, WIDTH-1, HEIGHT);

		// horizontal
		g.drawLine(0, 0, 0, HEIGHT);
		g.drawLine(0, HEIGHT / 3, WIDTH, HEIGHT / 3);
		g.drawLine(0, HEIGHT / 3 * 2, WIDTH, HEIGHT / 3 * 2);
		g.drawLine(0, HEIGHT-1, WIDTH, HEIGHT-1);
		
//		setLocation(WIDTH/2, 0);

	}
}
