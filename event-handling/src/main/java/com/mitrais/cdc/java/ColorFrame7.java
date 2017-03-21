package com.mitrais.cdc.java;

import java.awt.*;

import javax.swing.*;

public class ColorFrame7 extends JFrame {
	public ColorFrame7() {
		super("Drawing Shapes");
		// complete the method to show frame
		this.setSize(320, 340);
		this.setContentPane(new ColorPanel7(Color.RED));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// call method to show frame
		new ColorFrame7().setVisible(true);
	}
}
