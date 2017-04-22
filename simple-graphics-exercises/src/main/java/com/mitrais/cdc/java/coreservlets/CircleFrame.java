package com.mitrais.cdc.java.coreservlets;

import java.awt.*;
import javax.swing.*;

public class CircleFrame extends JFrame {
	
	JPanel panel = new CirclePanel(Color.red);
	
	public CircleFrame() {
		super("Drawing Shapes");
		// complete the method to show frame
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		add(panel);
	}

	public static void main(String[] args) {
		// call method to show frame
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new CircleFrame().setVisible(true);
			}
		});
	}
}
