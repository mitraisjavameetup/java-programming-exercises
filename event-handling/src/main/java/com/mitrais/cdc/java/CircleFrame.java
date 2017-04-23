package com.mitrais.cdc.java;

import java.awt.*;

import javax.swing.*;

public class CircleFrame extends JFrame {
	public CircleFrame() {
		super("Drawing Shapes");
		// complete the method to show frame
		this.setSize(320, 340);
		this.setContentPane(new CirclePanel(Color.RED));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// call method to show frame
		new CircleFrame().setVisible(true);
	}
}
