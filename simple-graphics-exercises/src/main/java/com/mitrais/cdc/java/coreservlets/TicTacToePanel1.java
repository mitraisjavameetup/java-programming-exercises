package com.mitrais.cdc.java.coreservlets;

import java.awt.*;
import javax.swing.*;

public class TicTacToePanel1 extends JPanel {
  public TicTacToePanel1(Color color) {
		// TODO Auto-generated constructor stub
	 setBackground(color);
	}

@Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    //add code to show lines, so it look like tic tac toe board
    /*
     * Horizontal Line
     */
    g.drawLine(0, 100, 300, 100);
    g.drawLine(0, 200, 300, 200);
    /*
     * Vertical Line
     */
    g.drawLine(100, 0, 100, 300);
    g.drawLine(200, 0, 200, 300);
    
  
  
  
  }
}
