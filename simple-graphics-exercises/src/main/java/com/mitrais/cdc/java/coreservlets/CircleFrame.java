package com.mitrais.cdc.java.coreservlets;

import java.awt.*;

import javax.swing.*;

public class CircleFrame extends JFrame {
	public CircleFrame() {
		super("Drawing Shapes");
		// complete the method to show frame
		CirclePanel panel = new CirclePanel(Color.RED);
		setContentPane(panel);
		setSize(1000, 1000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

	public static void main(String[] args) {
		// call method to show frame
		CircleFrame frame = new CircleFrame();

	}
}
