package com.mitrais.cdc.java.coreservlets;

import javax.swing.*;

public class TicTacToeFrame2 extends JFrame {
  public TicTacToeFrame2() {
    super("Tic-Tac-Toe");
    //complete this method to show tic tac toe board
    
    JFrame frame = new JFrame("TicTacToeFrame2");
    frame.setSize(200,200);
    frame.setContentPane(new TicTacToePanel2());
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
  
  public static void main(String[] args) {
	//call method to show tic tac toe frame
	  new TicTacToeFrame2();
  
  }
}
