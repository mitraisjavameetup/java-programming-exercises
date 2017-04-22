package com.mitrais.cdc.java;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
/** TO DO 
 *  Change the background color when the user clicks.
 *  Please using itself (which implements the MouseListener interface) as the mouse listener
 */

public class ColorPanel2 extends JPanel implements MouseListener{
  public ColorPanel2() {
    //TO DO
	//setBackground color as Red
    //call mouseListener
	setBackground(Color.RED);
	addMouseListener(this);
  }
  
  public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		  Color color;
		  
		  if (this.getBackground() == Color.RED)
			  color = Color.BLUE;
		  else
			  color = Color.RED;
		  
		  this.setBackground(color);
	}
  
  //TO DO
  //don't forget to override all methods of MouseListener Interface
  //let the override method empty if there is no need

	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
  }
