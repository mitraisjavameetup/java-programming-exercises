package com.mitrais.cdc.java.coreservlets;

import java.awt.*;
import javax.swing.*;

public class TicTacToePanel2 extends JPanel {
  public TicTacToePanel2(Color color) {
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
    g.drawLine(0, getWidth()/3, getWidth(), getWidth()/3);
    g.drawLine(0, (getWidth()*2)/3, getWidth(), (getWidth()*2)/3);
    /*
     * Vertical Line
     */
    g.drawLine(getHeight()/3, 0, getHeight()/3, getHeight());
    g.drawLine((getHeight()*2)/3, 0, (getHeight()*2)/3, getHeight());
    
    
    
    
    
    
    
  }
}
