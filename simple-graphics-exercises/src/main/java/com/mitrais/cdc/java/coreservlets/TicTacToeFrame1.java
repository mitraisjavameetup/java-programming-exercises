package com.mitrais.cdc.java.coreservlets;

import java.awt.Color;

import javax.swing.*;

public class TicTacToeFrame1 extends JFrame {
  public TicTacToeFrame1() {
    super("Tic-Tac-Toe");
    //complete this method to show tic tac toe board
    setContentPane(new TicTacToePanel1());
    setSize(320,340);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    
}
  
  public static void main(String[] args) {
	//call method to show tic tac toe frame
	  new TicTacToeFrame1();
  
  }
}
