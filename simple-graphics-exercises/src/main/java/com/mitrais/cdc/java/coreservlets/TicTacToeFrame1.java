package com.mitrais.cdc.java.coreservlets;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Logger;

public class TicTacToeFrame1 extends JFrame {
	public TicTacToeFrame1() {
		setContentPane(new TicTacToePanel1());
		setSize(750, 750);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
    //complete this method to show tic tac toe board
    
	}
  

    

  
  public static void main(String[] args) {
	//call method to show tic tac toe frame
	  new TicTacToeFrame1();
  
  }
}
