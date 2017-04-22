package com.mitrais.cdc.java.three;

import java.awt.*;
import javax.swing.*;

public class StaticJLabels extends JFrame {
	public StaticJLabels() {
		super("Flipping Coins");
		Container contentPane = getContentPane();
		contentPane.setLayout(new GridLayout(5, 1));
		for (int i = 0; i < 5; i++) {
			JLabel label = new JLabel("Label " + i);
			label.setFont(new Font("SansSerif", Font.PLAIN, 60));
			contentPane.add(label);
		}
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		new StaticJLabels();
	}
}