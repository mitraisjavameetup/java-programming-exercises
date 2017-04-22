package com.mitrais.cdc.java.coreservlets;

import java.awt.*;
import javax.swing.*;

public class TicTacToePanel2 extends JPanel {
  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    
    //add code to show lines, so it look like tic tac toe board
    g.drawLine(getWidth()/3, 0, getWidth()/3, getHeight());
    g.drawLine(getWidth()*2/3, 0, getWidth()*2/3, getHeight());
    g.drawLine(0, getHeight()/3, getWidth(), getHeight()/3);
    g.drawLine(0, getHeight()*2/3, getWidth(), getHeight()*2/3);
    
      
    
    
    
    
  }
}
