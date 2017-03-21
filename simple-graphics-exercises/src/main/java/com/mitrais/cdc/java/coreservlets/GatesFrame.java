package com.mitrais.cdc.java.coreservlets;

import java.awt.EventQueue;
import javax.swing.*;

public class GatesFrame extends JFrame {
	
	private JPanel panel = new GatesPanel("images/bill.jpeg");
	
	public GatesFrame(String relativePath) {
		super("Bill Gates");
		// complete the method to show image
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		add(panel);
	}

	public static void main(String[] args) {
		// call method to show image on frame
		// image location is on images/gates-blue-screen.jpg
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new GatesFrame("images/bill.jpeg").setVisible(true);
			}
		});
	}
}
