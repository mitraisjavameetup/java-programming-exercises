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
	  this.setBackground(Color.RED);
	  this.addMouseListener(this);
  }	
  
  public void mousePressed() {
	//TO DO
	//Method to give logic to change the background color
	//if the background is Red now change to blue, and vice versa
  }

	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		if(this.getBackground() == Color.red){
			  this.setBackground(Color.BLUE);
		  }else{
			  this.setBackground(Color.RED);
		  }
	}
	
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
  
  //TO DO
  //don't forget to override all methods of MouseListener Interface
  //let the override method empty if there is no need

}
