package com.mitrais.cdc.java.coreservlets;

import javax.swing.*;

public class TicTacToeFrame1 extends JFrame {
/**Constructor Static Tic Tac Toe Frame**/
  public TicTacToeFrame1() {
    super("Tic-Tac-Toe");
    //complete this method to show tic tac toe board
    setContentPane(new TicTacToePanel1());
    setSize(320,340);
    setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    setVisible(true);
  

    
}
  /**Main Method to create a frame**/
  public static void main(String[] args) {
	//call method to show tic tac toe frame
	 new TicTacToeFrame1();
  
  }
}
