package com.mitrais.cdc.java;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.List;

import javax.swing.*;
/** TO DO 
 *  Change the background color when the user clicks.
 *  Please using a named inner class as the mouse listener
 */

public class ColorPanel7 extends JPanel {
  List<Circle> CircleList = new ArrayList();
	  
  public ColorPanel7() {
	//TO DO
	//setBackground color as Red
	//call named inner class as mouseListener
	  setBackground(Color.red);
	  addMouseListener(new MyMouseAdapter());;

  }
  
  private void AddCircle(int x, int y){
	  CircleList.add(new Circle(x, y, 14));
  }
  
  private void RemoveCircle(int x, int y){
	  int idx = -1;
	  for(int i=0;i<CircleList.size();i++){
		  if(CircleList.get(i).isCollide(x, y)){
			  idx = i;
			  //break;
		  }
	  }
	  if(idx>=0){
		  CircleList.remove(idx);
		  paintComponent(getGraphics());
	  }
  }
  
  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    //complete this method to display yellow rounds on screen
    //g.setColor(getBackground());
    for (Circle circle : CircleList) {
    	g.setColor(Color.yellow);
    	g.drawOval(circle.getX()-(circle.getD()/2), circle.getY()-(circle.getD()/2), circle.getD(), circle.getD());
    }
   
  }
  
  private class MyMouseAdapter extends MouseAdapter {

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		super.mouseClicked(e);
		if(e.getButton()==MouseEvent.BUTTON1){
			//System.out.println("1");
			AddCircle(e.getX(), e.getY());
			paintComponent(getGraphics());
		}
		if(e.getButton()==MouseEvent.BUTTON3){
			//System.out.println("2");
			RemoveCircle(e.getX(), e.getY());
		}
	}


  }
}