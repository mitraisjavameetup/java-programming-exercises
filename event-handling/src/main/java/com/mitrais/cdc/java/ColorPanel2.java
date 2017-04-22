package com.mitrais.cdc.java;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
/** TO DO 
 *  Change the background color when the user clicks.
 *  Please using itself (which implements the MouseListener interface) as the mouse listener
 */

/**
 * Class to popup (JFrame) whose (JPanel) toggles back and forth between red and blue each time you click in the window
 * with mousePressed method inside  the jPanel sub-class
 * @author Egi
 * @version 1.0
 */
public class ColorPanel2 extends JPanel implements MouseListener{
  /**
   * ColorPanel2 class constructor
   */
  public ColorPanel2() {
    //TO DO
	//setBackground color as Red
    //call mouseListener
	setBackground(Color.RED);
	addMouseListener(this);
  }
  
  /**
   * auto generated method from MouseListener interface
   */
  public void mouseClicked(MouseEvent arg0) {
	// TODO Auto-generated method stub
  }

  /**
   * auto generated method from MouseListener interface
   */
  public void mouseEntered(MouseEvent arg0) {
	// TODO Auto-generated method stub
  }

  /**
   * auto generated method from MouseListener interface
   */
  public void mouseExited(MouseEvent arg0) {
	// TODO Auto-generated method stub	
  }

  /**
   * will change panel background from blue to red vice versa when mouse is pressed
   */
  public void mousePressed(MouseEvent event) {
	// TODO Auto-generated method stub
	if(getBackground() == Color.RED) {
		setBackground(Color.BLUE);
	} else {
		setBackground(Color.RED);
	}
  }

  /**
   * auto generated method from MouseListener interface
   */
  public void mouseReleased(MouseEvent arg0) {
	// TODO Auto-generated method stub
  }
  
  //TO DO
  //don't forget to override all methods of MouseListener Interface
  //let the override method empty if there is no need

}
