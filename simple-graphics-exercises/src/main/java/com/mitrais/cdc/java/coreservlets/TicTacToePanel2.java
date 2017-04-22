package com.mitrais.cdc.java.coreservlets;

import java.awt.*;
import javax.swing.*;

public class TicTacToePanel2 extends JPanel {
  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    
    //add code to show lines, so it look like tic tac toe board
    
    g.drawLine(0, getParent().getHeight() / 3, getParent().getWidth(), getParent().getHeight() / 3);
    
    
    
    
    
    
  }
}
