package com.mitrais.cdc.java;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/** TO DO 
 *  Change the background color when the user clicks.
 *  Please using a named inner class as the mouse listener
 */

public class ColorPanel6 extends JPanel {
  public ColorPanel6() {
	//TO DO
	//setBackground color as Red
	//call named inner class as mouseListener
	  setBackground(Color.red);
	  addMouseMotionListener(new ColorChanger());;
  }
  
  private class ColorChanger extends MouseMotionAdapter {

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		super.mouseMoved(e);
		if(e.getX()<getWidth()/2){
			setBackground(Color.red);
		} else{
			setBackground(Color.blue);
		}
	}
  }
}