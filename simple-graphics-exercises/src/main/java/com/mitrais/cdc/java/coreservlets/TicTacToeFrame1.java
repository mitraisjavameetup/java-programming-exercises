package com.mitrais.cdc.java.coreservlets;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.*;

public class TicTacToeFrame1 extends JFrame {
  public TicTacToeFrame1() {
    super("Tic-Tac-Toe");
    TicTacToePanel1 panel = new TicTacToePanel1();
    panel.setSize(300,300);
    setContentPane(panel);
    setSize(320, 340);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  
}
  
  public static void main(String[] args) {
	//call method to show tic tac toe frame
	  TicTacToeFrame1 frame = new TicTacToeFrame1();
	  
  
  }
}
