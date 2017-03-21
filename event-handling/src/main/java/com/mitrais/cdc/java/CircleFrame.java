package com.mitrais.cdc.java;

import java.awt.*;
import javax.swing.*;

public class CircleFrame extends JFrame {
	
	JPanel panel = new CirclePanel(Color.white);
	
	public CircleFrame() {
		super("Drawing Shapes");
		// complete the method to show frame
		setSize(200, 200);
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
