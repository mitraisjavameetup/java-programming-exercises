package com.mitrais.cdc.java.coreservlets;

import javax.swing.*;

public class TicTacToeFrame1 extends JFrame {
  public TicTacToeFrame1() {
    super("Tic-Tac-Toe");
    //complete this method to show tic tac toe board
    JFrame frame = new JFrame("TicTacToeFrame1");
    frame.setContentPane(new TicTacToePanel1());
    frame.setSize(320, 340);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
}
  
  public static void main(String[] args) {
	//call method to show tic tac toe frame
	  new TicTacToeFrame1();
  }
}
