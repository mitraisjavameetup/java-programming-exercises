package com.mitrais.cdc.java.coreservlets;

import java.awt.*;
import javax.swing.*;

public class TicTacToePanel2 extends JPanel {
  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    
    //add code to show lines, so it look like tic tac toe board
    int x1=200+(Math.abs(this.getWidth()-this.getHeight()))/2,
        x2=200+(Math.abs(this.getWidth()-this.getHeight()))/2,
        y1=200+(Math.abs(this.getWidth()-this.getHeight()))/2,
        y2=500+(Math.abs(this.getWidth()-this.getHeight()))/2;
    for(int i=0;i<4;i++){
    g.setColor(Color.WHITE);
    g.drawLine(x1, y1, x2, y2);
    x1+=100;
    x2+=100;
    }
    x1=200+(Math.abs(this.getWidth()-this.getHeight()))/2;
    x2=500+(Math.abs(this.getWidth()-this.getHeight()))/2;
    y1=200+(Math.abs(this.getWidth()-this.getHeight()))/2;
    y2=200+(Math.abs(this.getWidth()-this.getHeight()))/2;
    for(int i=0;i<4;i++){
    g.drawLine(x1, y1, x2, y2);
    y1+=100;
    y2=y1;
    }
    
    
    
    
     
    
  }
}
