package com.mitrais.cdc.java.coreservlets;

import java.awt.Color;

import javax.swing.*;

/**
 * Class that make a popup window that draws an empty tic-tac-toe board
 * @author Egi
 * @version 1.0
 */
public class TicTacToeFrame1 extends JFrame {
	
  /**
   * TicTacToe class constructor
   */
  public TicTacToeFrame1() {
    super("Tic-Tac-Toe");
    //complete this method to show tic tac toe board
    setContentPane(new TicTacToePanel1());
    setSize(320, 340);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
  
  /**
   * TicTacToe class main method
   * @param args
   */
  public static void main(String[] args) {
	//call method to show tic tac toe frame
	new TicTacToeFrame1();
  }
  
}
