package com.mitrais.cdc.java.coreservlets;

import java.awt.*;
import javax.swing.*;

public class TicTacToePanel1 extends JPanel {
 
/**Draw a static tic tac toe board**/
  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    this.setSize(300, 300);
    //add code to show lines, so it look like tic tac toe board
    
    //draw horizontal line
    g.drawLine(30,100,220,100);
    g.drawLine(30, 130, 220, 130);
  
    //draw vertical line
    g.drawLine(90, 60, 90, 180);
    g.drawLine(170, 60, 170, 180);
  
  
  }
}
