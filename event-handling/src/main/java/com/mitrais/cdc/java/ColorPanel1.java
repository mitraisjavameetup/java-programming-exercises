package com.mitrais.cdc.java;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

/** TO DO 
 *  Change the background color when the user clicks.
 *  Please using a separate class as the mouse listener concept
 */

public class ColorPanel1 extends JPanel implements MouseListener{
  public ColorPanel1() {
    //TO DO
	//setBackground color as Red
	//call separate class that available (ColorListener.java) as the mouseListener
	setBackground(Color.RED);
	addMouseListener(new ColorListener(this));
	
  }
  /**
   * swap color
   */
  public void swapColors() {
	//TO DO
	//Method to give logic to change the background color
	//if the background is Red now change to blue, and vice versa
	  if(getBackground()==Color.RED){
		  setBackground(Color.BLUE);
	  }
	  else setBackground(Color.RED);
  }

public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
}

public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

}
