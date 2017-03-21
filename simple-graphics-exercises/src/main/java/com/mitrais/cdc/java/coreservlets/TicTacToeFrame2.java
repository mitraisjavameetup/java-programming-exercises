package com.mitrais.cdc.java.coreservlets;

import javax.swing.*;

public class TicTacToeFrame2 extends JFrame {
  public TicTacToeFrame2() {
    super("Tic-Tac-Toe");
    //complete this method to show tic tac toe board
    setContentPane(new TicTacToePanel2());
    setSize(600,600);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  
  
  
  
  }
  
  public static void main(String[] args) {
	//call method to show tic tac toe frame
	 new TicTacToeFrame2();
  
  }
}
