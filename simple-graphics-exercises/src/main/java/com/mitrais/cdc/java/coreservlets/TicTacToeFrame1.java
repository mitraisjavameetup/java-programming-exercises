package com.mitrais.cdc.java.coreservlets;

import javax.swing.*;

public class TicTacToeFrame1 extends JFrame {
  public TicTacToeFrame1() {
    super("Tic-Tac-Toe");
    //complete this method to show tic tac toe board
    JFrame f=new JFrame("Tic-Tac-Toe");
    f.setSize(700, 700);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setContentPane(new TicTacToePanel1());
    f.setVisible(true);

    
}
  
  public static void main(String[] args) {
	//call method to show tic tac toe frame
	  new TicTacToeFrame1();
	  
  
  }
}
