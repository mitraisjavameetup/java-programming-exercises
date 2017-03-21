package com.mitrais.cdc.java.coreservlets;

import java.awt.*;
import javax.swing.*;

public class TicTacToePanel1 extends JPanel {
  int WIDTH=300,HEIGHT=300;
	@Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    //add code to show lines, so it look like tic tac toe board
super.setSize(WIDTH, HEIGHT);
g.setColor(Color.BLACK);
g.drawLine(WIDTH/3, 0, WIDTH/3, HEIGHT);
g.drawLine((WIDTH-WIDTH/3), 0, (WIDTH-WIDTH/3), HEIGHT);

g.drawLine(0, HEIGHT/3, WIDTH, HEIGHT/3);
g.drawLine(0, (HEIGHT-HEIGHT/3), WIDTH, (HEIGHT-HEIGHT/3));
  
  
  }
}
