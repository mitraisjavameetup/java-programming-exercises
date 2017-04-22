package com.mitrais.cdc.java.coreservlets;

import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import javax.swing.*;

public class TicTacToeFrame2 extends JFrame {
	static JPanel jPanel = new TicTacToePanel2();
  public TicTacToeFrame2() {
    super("Tic-Tac-Toe");
    //complete this method to show tic tac toe board
    setSize(500, 500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  
  }
  
  public static void main(String[] args) {
	//call method to show tic tac toe frame
	  TicTacToeFrame2 frame1 = new TicTacToeFrame2();
	  frame1.add(jPanel);
	  frame1.addComponentListener(new ComponentListener() {
	  
		@Override
		public void componentShown(ComponentEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void componentResized(ComponentEvent e) {
			// TODO Auto-generated method stub
			jPanel = new JPanel();
			frame1.add(jPanel);
		}
		
		@Override
		public void componentMoved(ComponentEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void componentHidden(ComponentEvent e) {
			// TODO Auto-generated method stub
			
		}
	});
	  
  
  }
}
