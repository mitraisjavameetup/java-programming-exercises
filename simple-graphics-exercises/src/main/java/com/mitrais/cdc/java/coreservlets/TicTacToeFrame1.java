package com.mitrais.cdc.java.coreservlets;

import javax.swing.*;

public class TicTacToeFrame1 extends JFrame {
	
	JPanel panel = new TicTacToePanel1();
	
	public TicTacToeFrame1() {
		super("Tic-Tac-Toe");
		// complete this method to show tic tac toe board
		setSize(320, 340);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		add(panel);
	}

	public static void main(String[] args) {
		// call method to show tic tac toe frame
		java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToeFrame1().setVisible(true);
            }
        });
	}
}
