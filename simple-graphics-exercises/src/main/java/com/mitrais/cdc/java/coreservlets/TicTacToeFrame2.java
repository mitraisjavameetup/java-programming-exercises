package com.mitrais.cdc.java.coreservlets;

import javax.swing.*;

public class TicTacToeFrame2 extends JFrame {
	public TicTacToeFrame2() {
		super("Tic-Tac-Toe");
		// complete this method to show tic tac toe board
		this.setSize(320, 340);
		this.setContentPane(new TicTacToePanel2());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		// call method to show tic tac toe frame
		new TicTacToeFrame2().setVisible(true);
	}
}
