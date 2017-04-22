package com.mitrais.cdc.java;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/** TO DO 
 *  Change the background color when the user clicks.
 *  Please using a named inner class as the mouse listener
 */

public class ColorPanel3 extends JPanel {
	int flag = 0;
  public ColorPanel3() {
	//TO DO
	//setBackground color as Red
	//call named inner class as mouseListener
	  setBackground(Color.RED);
	  flag =0;
	  addMouseListener(new ColorChanger());
  }
  
  private class ColorChanger extends MouseAdapter {
    public void mousePressed(MouseEvent e) {
    	//TO DO
    	//Method to give logic to change the background color
    	//if the background is Red now change to blue, and vice versa
    	if (flag == 0)
	  	  {
	  		  setBackground(Color.BLUE);
	  		  flag = 1;
	  	  }else
	  	  {
	  		  setBackground(Color.RED);
	  		  flag = 0;
	  	  }
    }
  }
}
