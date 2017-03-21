package com.mitrais.cdc.java.coreservlets;

import java.awt.*;
import javax.swing.*;
/**
 * 
 * @author Relung Satria
 * TicTacToePanel1 class
 *
 */
public class TicTacToePanel1 extends JPanel {
	private int width;
	private int height;
	
  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    //add code to show lines, so it look like tic tac toe board
    setBackground(Color.BLACK);
    g.setColor(Color.WHITE);
    g.drawLine(0, width/3, height, width/3);
    g.drawLine(0, width*2/3, height, width*2/3);
    g.drawLine(height/3, 0, height/3, width);
    g.drawLine(height*2/3, 0, height*2/3, width);
  
  
  }
  public TicTacToePanel1(int width, int height){
	  this.width = width;
	  this.height = height;
  }
}
