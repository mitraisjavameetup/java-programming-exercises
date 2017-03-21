package com.mitrais.cdc.java;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/** TO DO 
 *  Change the background color when the user clicks.
 *  Please using an anonymous inner class as the mouse listener
 */

public class ColorPanel4 extends JPanel {
  public ColorPanel4() {

	  setBackground(Color.RED);

	//TO DO
	//setBackground color as Red
	  
	  addMouseListener(new MouseAdapter() {

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			super.mousePressed(e);
			if (getBackground() == Color.BLUE) {
		  		  setBackground(Color.RED);
		  	  }
		  	  else
		  		  setBackground(Color.BLUE);
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
