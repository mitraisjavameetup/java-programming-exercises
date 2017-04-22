package com.mitrais.cdc.java.coreservlets;

import java.awt.*;
import javax.swing.*;

/**
 * Panel for drawing on TicTacToeFrame1
 * @author Egi
 * @version 1.0
 */
public class TicTacToePanel1 extends JPanel {
  /**
   * Override paintComponent method for drawing TicTacToe line
   */
  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    //add code to show lines, so it look like tic tac toe board
    g.drawLine(0, 100, 300, 100);
    g.drawLine(0, 200, 300, 200);
    g.drawLine(100, 0, 100, 300);
    g.drawLine(200, 0, 200, 300);
  }
}
