package com.mitrais.cdc.java;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

public class ColorPanel6 extends JPanel{

	public ColorPanel6() {
		// TODO Auto-generated constructor stub
		
		addMouseMotionListener(new MouseAdapter()
				{

					@Override
					public void mouseMoved(MouseEvent e) {
						// TODO Auto-generated method stub
						//super.mouseMoved(e);
						if (e.getXOnScreen()<getWidth()/2)
						{
						setBackground(Color.BLUE);
						int name = JOptionPane.showConfirmDialog(getParent(), "Its Blue");
						
						}
						else
						{
						setBackground(Color.RED);
						int name = JOptionPane.showConfirmDialog(getParent(), "Its Red");
						
						}
					}
					
				});
	}
}
