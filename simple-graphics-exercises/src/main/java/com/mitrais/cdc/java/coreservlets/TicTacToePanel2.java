package com.mitrais.cdc.java.coreservlets;

import java.awt.*;
import javax.swing.*;

/**
 * Panel for drawing on TicTacToeFrame2
 * @author Egi
 * @version 1.0
 */
public class TicTacToePanel2 extends JPanel {
  /**
   * Override paintComponent method for drawing TicTacToe line
   */
  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    //add code to show lines, so it look like tic tac toe board
    int width =  super.getWidth();
    int height = super.getHeight();
    
    g.drawLine(0, 1 * height / 3, 500, 1 * height / 3);
    g.drawLine(0, 2 * height / 3, 500, 2 * height / 3);
    g.drawLine(1 * width / 3, 0, 1 * width / 3, height);
    g.drawLine(2 * width / 3, 0, 2 * width / 3, height);
  }
}
