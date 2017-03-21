package com.mitrais.cdc.java.coreservlets;

import java.awt.*;
import javax.swing.*;

public class TicTacToePanel1 extends JPanel {
  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    //add code to show lines, so it look like tic tac toe board
    int height = 100, width = 100;
    for (int x = 0; x < 2; x++)
    {
    	height += height * x;
    	width += width * x;
    	
    	//Horizontal Line
    	g.drawLine(0, height, 300, height);
    	
    	//Vertical Line
    	g.drawLine(width, 0, width, 300);
    }
  }
}
