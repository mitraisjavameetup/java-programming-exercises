package com.mitrais.cdc.java;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**using an anonymous inner class as the mouse listener
 */

public class ColorPanel4 extends JPanel {
	/** Call MouseListener with anonymous inner class*/
  public ColorPanel4() {
	//TO DO
	//setBackground color as Red
	setBackground(Color.RED);
	addMouseListener(new MouseListener(){
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
