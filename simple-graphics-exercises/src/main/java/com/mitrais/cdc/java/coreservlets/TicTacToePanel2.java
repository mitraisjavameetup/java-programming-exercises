package com.mitrais.cdc.java.coreservlets;

import java.awt.*;
import javax.swing.*;

public class TicTacToePanel2 extends JPanel {
  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    //add code to show lines, so it look like tic tac toe board   
    int startX = 0, startY = 0, scale= 0;
    if(this.getWidth()>this.getHeight()){
    	scale = this.getHeight();
    	startX = (this.getWidth() - this.getHeight()) /2;
    	startY = 0;
    } else {
    	scale = this.getWidth();
    	startX = 0;
    	startY = (this.getHeight() - this.getWidth()) /2;
    }
    g.drawLine(startX + scale/3, startY, startX + scale/3, startY + scale);
    g.drawLine(startX + scale/3*2, startY, startX + scale/3*2, startY + scale);
    g.drawLine(startX, startY + scale/3, startX + scale, startY + scale/3);
    g.drawLine(startX, startY + scale/3*2, startX + scale, startY + scale/3*2);
    g.drawRect(startX, startY, scale, scale);
  }
}
