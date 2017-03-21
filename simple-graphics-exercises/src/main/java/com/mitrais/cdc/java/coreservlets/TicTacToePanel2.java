package com.mitrais.cdc.java.coreservlets;

import java.awt.*;
import javax.swing.*;

public class TicTacToePanel2 extends JPanel {
  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    
    //add code to show lines, so it look like tic tac toe board
    int width = this.getWidth();
    int height = this.getHeight();
    int size = 0;
    if (width < height)
    {
    	size = width;
    }else
    {
    	size = height;
    }
    //left border
    g.drawLine(((width-size)/2), 0 + ((height-size)/2),((width-size)/2), height-((height-size)/2));
    //first vertical line
    g.drawLine((size/3)+0+((width-size)/2), 0 + ((height-size)/2),(size/3)+0+((width-size)/2), height-((height-size)/2));
    //second vertical line
    g.drawLine((size*2/3)+0+((width-size)/2), 0 + ((height-size)/2), (size*2/3)+0+((width-size)/2), height-((height-size)/2));
    //right border
    g.drawLine((size)+0+((width-size)/2), 0 + ((height-size)/2),(size)+0+((width-size)/2), height-((height-size)/2));//
    //top border
    g.drawLine(0+((width-size)/2),((height-size)/2), width-((width-size)/2),((height-size)/2));
    //first horizontal line
    g.drawLine(0+((width-size)/2),(size/3)+0 + ((height-size)/2), width-((width-size)/2),(size/3)+0 + ((height-size)/2));
    //second horizontal line
    g.drawLine(0+((width-size)/2), (size*2/3)+0 + ((height-size)/2), width-((width-size)/2), (size*2/3)+0 + ((height-size)/2));
    //bottom border
    g.drawLine(0+((width-size)/2),(size)+0 + ((height-size)/2), width-((width-size)/2),(size)+0 + ((height-size)/2));
    
    
    
    
    
    
  }
}
