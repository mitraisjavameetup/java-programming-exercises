package com.mitrais.cdc.java.coreservlets;

import javax.swing.*;

public class TicTacToeFrame2 extends JFrame {
	public TicTacToeFrame2() {
		super("Tic-Tac-Toe");
		TicTacToePanel2 panel = new TicTacToePanel2();
		setContentPane(panel);
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

	public static void main(String[] args) {
		TicTacToeFrame2 frame = new TicTacToeFrame2();

	}
}
