package com.mitrais.cdc.java.coreservlets;

import javax.swing.*;

public class TicTacToeFrame2 extends JFrame {
  public TicTacToeFrame2() {
    super("Tic-Tac-Toe");
    setContentPane(new TicTacToePanel2());
    setSize(750, 750);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    //complete this method to show tic tac toe board

  
  
  
  
  }
  
  public static void main(String[] args) {
	//call method to show tic tac toe frame
	  new TicTacToeFrame2();
  
  }
}
