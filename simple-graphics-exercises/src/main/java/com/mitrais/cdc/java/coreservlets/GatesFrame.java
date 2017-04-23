package com.mitrais.cdc.java.coreservlets;

import javax.swing.*;

public class GatesFrame extends JFrame {
	public GatesFrame(String relativePath) {
		super("Bill Gates");
		// complete the method to show image
		this.setSize(320, 340);
		this.setContentPane(new GatesPanel(relativePath));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// call method to show image on frame
		// image location is on images/gates-blue-screen.jpg
		new GatesFrame("images/gates.jpg").setVisible(true);
		
	}
}
