package com.mitrais.cdc.java.coreservlets;

import java.awt.GridBagLayout;

import javax.swing.*;

public class TicTacToeFrame1 extends JFrame {
	public TicTacToeFrame1() {
		super("Tic-Tac-Toe");
		// complete this method to show tic tac toe board
		this.setSize(320, 340);
		this.setContentPane(new TicTacToePanel1());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// call method to show tic tac toe frame
		new TicTacToeFrame1().setVisible(true); 
	}
}
