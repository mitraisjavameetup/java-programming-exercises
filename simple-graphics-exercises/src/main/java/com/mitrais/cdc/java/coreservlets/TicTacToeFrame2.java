package com.mitrais.cdc.java.coreservlets;

import javax.swing.*;

public class TicTacToeFrame2 extends JFrame {
	public TicTacToeFrame2() {
	    super("Tic-Tac-Toe");
	    //complete this method to show tic tac toe board
	setSize(320,340); //(horizontal, vertical)
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setVisible(true);
	 JPanel TicTac = new TicTacToePanel2();
	 
	this.add(TicTac);    
	}
	  
	  public static void main(String[] args) {
		//call method to show tic tac toe frame
	new TicTacToeFrame2();
	  
	  }
}
