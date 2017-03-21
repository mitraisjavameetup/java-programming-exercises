package com.mitrais.cdc.java.coreservlets;

import java.awt.*;
import javax.swing.*;

public class TicTacToePanel2 extends JPanel {
	
	public TicTacToePanel2() {
		setVisible(true);
		setOpaque(true);
		setBackground(Color.white);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		int width = getParent().getWidth();
		int height = getParent().getHeight();
		super.paintComponent(g);
		// add code to show lines, so it look like tic tac toe board
		g.drawLine((width / 3), 1, (width / 3), height);
		g.drawLine((width - width / 3), 1, (width - width / 3), height);
		g.drawLine(1, (height / 3), width, (height / 3));
		g.drawLine(1, (height - height / 3), width, (height - height / 3));
	}
}
