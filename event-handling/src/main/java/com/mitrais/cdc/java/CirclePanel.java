package com.mitrais.cdc.java;

import java.util.*;
import java.util.List;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class CirclePanel extends JPanel {
  private int diameter = 20; 
  private int x, y;
  private List<Circle> circleList = new ArrayList<Circle>();
  
  public CirclePanel(Color bgColor) {
    setBackground(bgColor);
    addMouseListener(new CircleMouseListener(this));
  }
  
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
	g.setColor(Color.YELLOW);
    
	for (Circle circle:circleList)
		g.fillOval(circle.getX(), circle.getY(), circle.getRadius() * 2, circle.getRadius() * 2);
  }
  
  private class CircleMouseListener extends MouseAdapter
  {
	  private CirclePanel panel;
	  
	  public CircleMouseListener(CirclePanel panel)
	  {
		  this.panel = panel;
	  }
	  
	  @Override
	  public void mousePressed(MouseEvent e)
	  {
		  int button = e.getButton();
		  int x = e.getX() - 10;
		  int y = e.getY() - 10;
		  
		  switch(button)
		  {
		  case 1:
			  circleList.add(new Circle(x, y));
			  break;
		  case 3:
			  for (int z = 0; z < circleList.size(); z++)
			  {
				  int upperXLimit = circleList.get(z).getX() + 10;
				  int lowerXLimit = circleList.get(z).getX() - 10;
				  int upperYLimit = circleList.get(z).getY() + 10;
				  int lowerYLimit = circleList.get(z).getY() - 10;
				  
				  if (x <= upperXLimit && x >= lowerXLimit && y <= upperYLimit && y >= lowerYLimit)
					  circleList.remove(z);
			  }
			  break;
		  default:
			  break;
		  }
		  
		  panel.repaint();
	  }
  }
}
