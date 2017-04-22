package com.mitrais.cdc.java.coreservlets;

import java.awt.*;
import javax.swing.*;

public class TicTacToePanel1 extends JPanel {
  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    //add code to show lines, so it look like tic tac toe board
    g.drawLine(200, 0, 200, 600);
    g.drawLine(400, 0, 400, 600);
    g.drawLine(0, 200, 600, 200);
    g.drawLine(0, 400, 600, 400);
  
  }
}
