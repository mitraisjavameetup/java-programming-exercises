package com.mitrais.cdc.java;

import java.awt.*;
import javax.swing.*;

/** TO DO 
 *  Change the background color when the user clicks.
 *  Please using a separate class as the mouse listener concept
 */

public class ColorPanel1 extends JPanel {
  public ColorPanel1() {
	  
	  setBackground(Color.RED);
	  addMouseListener(new ColorListener(this));
	  
    //TO DO
	//setBackground color as Red
	//call separate class that available (ColorListener.java) as the mouseListener
  }
  
  public void swapColors() {
	  if (this.getBackground() == Color.BLUE) {
		  setBackground(Color.RED);
	  }
	  else
		  setBackground(Color.BLUE);
	//TO DO
	//Method to give logic to change the background color
	//if the background is Red now change to blue, and vice versa
  }
}
