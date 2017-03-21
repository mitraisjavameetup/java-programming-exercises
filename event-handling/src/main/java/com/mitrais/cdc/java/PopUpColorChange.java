package com.mitrais.cdc.java;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PopUpColorChange extends JFrame {
	
	JPanel panel = new JPanel();
	
	public PopUpColorChange() {
		initComponents();
		addMouseMotionListener(new MouseMotionListener() {
			
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
				if (e.getX() > (panel.getWidth() / 2)) {
					panel.setBackground(Color.red);
				} else {
					panel.setBackground(Color.blue);
				}
			}
			
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	
	public void initComponents() {
		setTitle("Pop-up Color Change");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(200, 200);
		setResizable(false);
		setLocationRelativeTo(null);
		panelMod();
		add(panel);
	}
	
	public void panelMod() {
		panel.setBackground(Color.white);
		panel.setVisible(true);
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new PopUpColorChange().setVisible(true);
			}
		});
	}
}
