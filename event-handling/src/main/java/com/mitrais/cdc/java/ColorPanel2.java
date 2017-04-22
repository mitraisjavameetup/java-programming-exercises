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
	  setBackground(Color.red);
	  addMouseListener(this);
  }

/* (non-Javadoc)
 * @see java.awt.event.MouseListener#mouseClicked(java.awt.event.MouseEvent)
 */
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

/* (non-Javadoc)
 * @see java.awt.event.MouseListener#mousePressed(java.awt.event.MouseEvent)
 */
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	if (this.getBackground() == Color.blue) {
		  setBackground(Color.red);
	} else{
		setBackground(Color.blue);
	}
}

/* (non-Javadoc)
 * @see java.awt.event.MouseListener#mouseReleased(java.awt.event.MouseEvent)
 */
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

/* (non-Javadoc)
 * @see java.awt.event.MouseListener#mouseEntered(java.awt.event.MouseEvent)
 */
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

/* (non-Javadoc)
 * @see java.awt.event.MouseListener#mouseExited(java.awt.event.MouseEvent)
 */
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
  
  //TO DO
  //don't forget to override all methods of MouseListener Interface
  //let the override method empty if there is no need

}
