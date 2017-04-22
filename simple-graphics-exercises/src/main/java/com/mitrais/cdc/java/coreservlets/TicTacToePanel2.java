package com.mitrais.cdc.java.coreservlets;

import java.awt.*;
import javax.swing.*;

public class TicTacToePanel2 extends JPanel {
  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    
    //add code to show lines, so it look like tic tac toe board
    int height = getHeight() / 3;
    int width = getWidth() / 3;
    
    for (int x = 0; x < 2; x++)
    {
    	height += height * x;
    	width += width * x;
    	
    	//Horizontal Line
    	g.drawLine(0, height, getWidth(), height);
    	
    	//Vertical Line
    	g.drawLine(width, 0, width, getHeight());
    }
    
  }
}
