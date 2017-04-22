package com.mitrais.cdc.java.coreservlets;

import java.awt.*;
import javax.swing.*;

public class TicTacToePanel1 extends JPanel {
	
	public TicTacToePanel1() {
		setVisible(true);
		setOpaque(true);
		setBackground(Color.white);
		setSize(300, 300);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		// add code to show lines, so it look like tic tac toe board
		g.drawLine(100, 1, 100, 300);
		g.drawLine(200, 1, 200, 300);
		g.drawLine(1, 100, 300, 100);
		g.drawLine(1, 200, 300, 200);
	}
}
