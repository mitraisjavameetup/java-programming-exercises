package com.mitrais.cdc.java;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * 
 * @author Relung Satria
 * Color Panel class
 *
 */
public class ColorPanel6 extends JPanel {
	private Color bg = Color.RED;
  public ColorPanel6() {
	  setBackground(bg);
	  addMouseMotionListener(new ColorChanger());
  }
  private class ColorChanger extends MouseAdapter implements MouseMotionListener  {
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mouseMoved(MouseEvent e)    {
		// TODO Auto-generated method stub
		int x = e.getX();
		if(x <= getWidth()/2)
			bg = Color.RED;
		if(x > getWidth()/2)
			bg = Color.BLUE;
		
		setBackground(bg);
	}
  }
}