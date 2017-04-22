package com.mitrais.cdc.java.coreservlets;

import java.awt.*;
import javax.swing.*;

public class TicTacToeFrame2 extends JFrame {
	
	JPanel panel = new TicTacToePanel2();

	public TicTacToeFrame2() {
		super("Tic-Tac-Toe");
		// complete this method to show tic tac toe board
		setSize(320, 340);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		add(panel);
	}

	public static void main(String[] args) {
		// call method to show tic tac toe frame
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new TicTacToeFrame2().setVisible(true);
			}
		});
	}
}
