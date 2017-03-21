package com.mitrais.cdc.java;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.LinkedList;
import java.util.List;

import javax.swing.*;

public class CirclePanel extends JPanel {
  private static int radius = 100;
  List<Circle> circle;
  public CirclePanel(Color bgColor) {
    setBackground(bgColor);
    circle = new LinkedList<Circle>();
    /**
     * Listneer for add or remove circle
     */
    addMouseListener(new MouseAdapter() {

		@Override
		public void mousePressed(MouseEvent e) {
			boolean found = false;
				for(Circle cr : circle){
					if(cr.getDistance(e.getX(),e.getY())){
						RemoveCircle(cr.getX(),cr.getY());
						circle.remove(cr);
						found = true;
						break;
					}
				}
				if(!found){
					Circle c = new Circle(radius);
					c.setX(e.getX());
					c.setY(e.getY());
					circle.add(c);
					DrawCircle(e.getX(), e.getY());
				}	
		}
	});
  }
  /**
   * Draw Circle
   * @param x int
   * @param y int
   */
  private void DrawCircle(int x,int y){
	  Graphics g = this.getGraphics();
	  g.setColor(Color.white);
	  g.fillOval(x, y, radius, radius);
  }
  /**
   * Remove Circle
   * @param x int 
   * @param y int
   */
  private void RemoveCircle(int x, int y) {
	  Graphics g = this.getGraphics();
	  g.setColor(Color.pink);
	  g.fillOval(x, y, radius, radius);
	}

}

  
