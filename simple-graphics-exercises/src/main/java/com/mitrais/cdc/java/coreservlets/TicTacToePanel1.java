package com.mitrais.cdc.java.coreservlets;

import java.awt.*;
import javax.swing.*;

public class TicTacToePanel1 extends JPanel {
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		// add code to show lines, so it look like tic tac toe board
		g.drawLine(106, 340, 106, 0);
		g.drawLine(213, 340, 213, 0);
		g.drawLine(320, 113, 0, 113);
		g.drawLine(320, 226, 0, 226);

	}
}
