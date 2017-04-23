package com.mitrais.cdc.java.coreservlets;

import java.awt.*;
import java.awt.geom.Line2D;

import javax.swing.*;

public class TicTacToePanel1 extends JPanel {
  public TicTacToePanel1() {
	setBackground(Color.DARK_GRAY);
  }
  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    //add code to show lines, so it look like tic tac toe board
    int x1=200,x2=200,y1=200,y2=500;
    for(int i=0;i<4;i++){
    g.setColor(Color.WHITE);
    g.drawLine(x1, y1, x2, y2);
    x1+=100;
    x2+=100;
    }
    x1=200;
    x2=500;
    y1=200;
    y2=200;
    for(int i=0;i<4;i++){
    g.drawLine(x1, y1, x2, y2);
    y1+=100;
    y2=y1;
    }
  }
}
