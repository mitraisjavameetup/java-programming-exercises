package com.mitrais.cdc.java.coreservlets;

import java.awt.*;
import javax.swing.*;

public class TicTacToePanel1 extends JPanel {
  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    //add code to show lines, so it look like tic tac toe board
    g.drawLine(0, 70, 250, 70);
    g.drawLine(0, 200, 250, 200);
    g.drawLine(70, 300, 70, 0);
    g.drawLine(150, 300, 150, 0);
    g.setColor(Color.RED);
  
  
  }
}
