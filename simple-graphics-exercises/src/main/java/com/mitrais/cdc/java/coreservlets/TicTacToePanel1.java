package com.mitrais.cdc.java.coreservlets;

import java.awt.*;
import javax.swing.*;

public class TicTacToePanel1 extends JPanel {
  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    //add code to show lines, so it look like tic tac toe board

    g.drawLine(250, 0, 250, 750);
    g.drawLine(500, 0, 500, 750);
    g.drawLine(0, 250, 750, 250);
    g.drawLine(0, 500, 750, 500);
  
  
  }
}
