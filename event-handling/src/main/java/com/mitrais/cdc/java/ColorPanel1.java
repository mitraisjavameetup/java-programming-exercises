package com.mitrais.cdc.java;

import java.awt.*;
import javax.swing.*;

/** using a separate class mouse listener 
 */

public class ColorPanel1 extends JPanel {
	/** Call MouseListener*/
  public ColorPanel1() {
    //TO DO
	//setBackground color as Red
	//call separate class that available (ColorListener.java) as the mouseListener
	  setBackground(Color.RED);
	  addMouseListener(new ColorListener(this));
  }
  /** Swap colors*/
  public void swapColors() {
	//TO DO
	//Method to give logic to change the background color
	//if the background is Red now change to blue, and vice versa
	  if(getBackground() == Color.RED){
		  setBackground(Color.BLUE);
	  }
	  else{
		  setBackground(Color.RED);
	  }
  }
}
