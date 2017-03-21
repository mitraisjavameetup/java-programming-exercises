package com.mitrais.cdc.java;

import javax.swing.*;

public class ColorFrame6 extends JFrame {
	public ColorFrame6() {
		super("Color 6");
		setContentPane(new ColorPanel6());
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ColorFrame6();
	}
}
