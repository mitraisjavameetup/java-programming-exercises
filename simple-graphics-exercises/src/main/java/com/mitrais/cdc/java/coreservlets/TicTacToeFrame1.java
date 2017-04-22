package com.mitrais.cdc.java.coreservlets;

import javax.swing.*;

public class TicTacToeFrame1 extends JFrame {
  static JPanel jPanel = new TicTacToePanel1();
  public TicTacToeFrame1() {
    super("Tic-Tac-Toe");
    //complete this method to show tic tac toe board
    setSize(230, 340);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    

    
}
  
  public static void main(String[] args) {
	//call method to show tic tac toe frame
	TicTacToeFrame1 frame1 = new TicTacToeFrame1();
	frame1.add(jPanel);
  }
}
