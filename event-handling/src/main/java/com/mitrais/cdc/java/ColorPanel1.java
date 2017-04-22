package com.mitrais.cdc.java;

import java.awt.*;
import java.awt.event.MouseListener;

import javax.swing.*;

/** TO DO 
 *  Change the background color when the user clicks.
 *  Please using a separate class as the mouse listener concept
 */

public class ColorPanel1 extends JPanel {
  public ColorPanel1() {
    //TO DO
	//setBackground color as Red
	//call separate class that available (ColorListener.java) as the mouseListener
	  setBackground(Color.red);
	  addMouseListener(new ColorListener(this));
  }
  
  public void swapColors() {
	//TO DO
	//Method to give logic to change the background color
	//if the background is Red now change to blue, and vice versa
	  if(this.getBackground()==Color.red){
			setBackground(Color.blue);
		}else{
			setBackground(Color.red);
		}

		this.repaint();
  }
}
