package com.mitrais.cdc.java.coreservlets;

import java.awt.Color;

import javax.swing.*;

public class GatesFrame extends JFrame {
	public GatesFrame(String relativePath) {
		super("Bill Gates");
		// complete the method to show image
		GatesPanel panel = new GatesPanel(relativePath);
		setContentPane(panel);
		setSize(600, 450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

	public static void main(String[] args) {
		// call method to show image on frame
		// image location is on images/gates-blue-screen.jpg
		GatesFrame gates = new GatesFrame("images\\gates-blue-screen.jpg");

	}
}
