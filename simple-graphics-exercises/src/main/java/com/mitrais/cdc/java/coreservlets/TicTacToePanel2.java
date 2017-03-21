package com.mitrais.cdc.java.coreservlets;

import java.awt.*;
import javax.swing.*;

public class TicTacToePanel2 extends JPanel {
  
/**Creating a dynamic tic tac toe board**/
  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    
    //add code to show lines, so it look like tic tac toe board
    //draw horizontal line
    g.drawLine(getWidth()/3,getHeight()/3,(getWidth()-(getWidth()/3)),getHeight()/3);
    g.drawLine(getWidth()/3,(getHeight()/3)+getHeight()/5,(getWidth()-(getWidth()/3)),(getHeight()/3)+getHeight()/5);
    
    //draw Vertical Line
    g.drawLine(getWidth()/2-getWidth()/10, getHeight()/3-40, getWidth()/2-getWidth()/10,(getHeight()-(getHeight()/3)) );
    g.drawLine(getWidth()/2+getWidth()/10, getHeight()/3-40, getWidth()/2+getWidth()/10,(getHeight()-(getHeight()/3)) );
    
    
    
    
    
    
  }
}
