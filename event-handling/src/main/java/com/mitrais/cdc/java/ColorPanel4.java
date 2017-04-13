package com.mitrais.cdc.java;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/* TO DO 
 *  Change the background color when the user clicks.
 *  Please using an anonymous inner class as the mouse listener
 */

public class ColorPanel4 extends JPanel {
  public ColorPanel4() {
	//TO DO
	//setBackground color as Red
	  
    /**call anonymous inner class as mouseListener :
	*    addMouseListener({
	*      give logic to change the background color
	*      if the background is Red now change to blue, and vice versa
	*    });
	*/
	setBackground(Color.RED);
	this.addMouseListener(new MouseListener(){
		public void mousePressed(MouseEvent e){
			if(getBackground() == Color.RED){
				setBackground(Color.BLUE);
			}
			else{
				setBackground(Color.RED);
			}
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

		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	});
  }
}
