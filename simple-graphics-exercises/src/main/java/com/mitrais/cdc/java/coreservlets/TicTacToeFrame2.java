package com.mitrais.cdc.java.coreservlets;

import java.awt.Color;

import javax.swing.*;

public class TicTacToeFrame2 extends JFrame {
  public TicTacToeFrame2() {
    super("Tic-Tac-Toe");
    //complete this method to show tic tac toe board
    setContentPane(new TicTacToePanel2(Color.GRAY));
    setSize(620,640);
    setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setVisible(true);
  
  }
  
  public static void main(String[] args) {
	  new TicTacToeFrame2();
  }
}
