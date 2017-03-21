/**
 * 
 */
package com.mitrais.cdc.java;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.*;


/**
 * @author trainee
 *
 */
public class ColorPanel6 extends JPanel implements MouseMotionListener{

	/**
	 * 
	 */
	public ColorPanel6() {
		//Set background color to Red
	    //call KeyListener
		  this.setBackground(Color.RED);
		  this.addMouseMotionListener(this);
	  }

	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		double x = getWidth();
		double mPosition = e.getX();
		if(mPosition < x/2){
			setBackground(Color.RED);
		}else{
			setBackground(Color.BLUE);
		}
	}
	
}
