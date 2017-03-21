package com.mitrais.cdc.java.coreservlets;

import java.awt.*;
import javax.swing.*;

public class TicTacToePanel2 extends JPanel {
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		// add code to show lines, so it look like tic tac toe board
		g.drawLine(getWidth() / 3, getHeight(), getWidth() / 3, 0);
		g.drawLine((getWidth() / 3) * 2, getHeight(), (getWidth() / 3) * 2, 0);
		g.drawLine(getWidth(), getHeight() / 3, 0, getHeight() / 3);
		g.drawLine(getWidth(), (getHeight() / 3) * 2, 0, (getHeight() / 3) * 2);

	}
}
