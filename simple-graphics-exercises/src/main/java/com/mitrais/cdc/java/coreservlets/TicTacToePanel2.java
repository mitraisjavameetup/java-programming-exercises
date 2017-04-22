package com.mitrais.cdc.java.coreservlets;

import java.awt.*;
import javax.swing.*;

public class TicTacToePanel2 extends JPanel {
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		//add code to show lines, so it look like tic tac toe board
		
		//Init size based on parent width and height
		setSize(getParent().getWidth(), getParent().getHeight());

		//Draw Vertical Lines
		g.drawLine(this.getWidth() / 3, 0, this.getWidth() / 3, this.getHeight());
		g.drawLine(this.getWidth() / 3 * 2, 0, this.getWidth() / 3 * 2, this.getHeight());

		//Draw Horizontal Lines
		g.drawLine(0, this.getHeight() / 3, this.getWidth(), this.getHeight() / 3);
		g.drawLine(0, this.getHeight() / 3 * 2, this.getWidth(), this.getHeight() / 3 * 2);
	}
}
