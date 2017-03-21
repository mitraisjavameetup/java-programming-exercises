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
	  setBackground(Color.RED);
	  addMouseListener(this);
	  
    //TO DO
	//setBackground color as Red
    //call mouseListener
  }
  
  public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	if (this.getBackground() == Color.BLUE) {
		  setBackground(Color.RED);
	  }
	  else
		  setBackground(Color.BLUE);
}

public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}


	  
	//TO DO
	//Method to give logic to change the background color
	//if the background is Red now change to blue, and vice versa
  
  
  //TO DO
  //don't forget to override all methods of MouseListener Interface
  //let the override method empty if there is no need

}
