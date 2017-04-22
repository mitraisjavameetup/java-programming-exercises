package com.mitrais.cdc.java;

import javax.swing.*;

public class ColorFrame5 extends JFrame {
	public ColorFrame5() {
		super("KeyListener");
		setContentPane(new ColorPanel5());
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ColorFrame5();
	}
}
