package com.mitrais.cdc.java.coreservlets;

import java.awt.*;
import javax.swing.*;

public class TicTacToePanel1 extends JPanel {
	private final int width = 300;
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		//add code to show lines, so it look like tic tac toe board
		setSize(this.width, this.width);
		
		//Draw Vertical Lines
		g.drawLine(this.width / 3, 0, this.width / 3, this.width);
		g.drawLine(this.width / 3 * 2, 0, this.width / 3 * 2,this.width);

		//Draw Horizontal Lines
		g.drawLine(0, this.width / 3, this.width, this.width / 3);
		g.drawLine(0, this.width / 3 * 2, this.width, this.width / 3 * 2);
	}
}
