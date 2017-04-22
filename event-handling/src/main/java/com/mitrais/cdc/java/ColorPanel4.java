package com.mitrais.cdc.java;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/** TO DO 
 *  Change the background color when the user clicks.
 *  Please using an anonymous inner class as the mouse listener
 */
/**
 * 
 * @author Relung Satria
 * Color Panel class
 *
 */
public class ColorPanel4 extends JPanel {
	private Color bg;
  public ColorPanel4() {
	//TO DO
	//setBackground color as Red
	  
	  bg = Color.RED;
	  setBackground(bg);
	  addMouseListener(new MouseListener(){

		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
		   	 if(bg == Color.RED){
		   		  bg = Color.BLUE;
		   	  } else {
		   		  bg = Color.RED;
		   	  }
		   	  setBackground(bg);
		}

		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
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
		  
	  }); 
	  
    /**call anonymous inner class as mouseListener :
	*    addMouseListener({
	*      give logic to change the background color
	*      if the background is Red now change to blue, and vice versa
	*    });
	*/
	  
  }
}
