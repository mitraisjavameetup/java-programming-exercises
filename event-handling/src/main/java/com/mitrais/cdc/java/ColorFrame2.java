package com.mitrais.cdc.java;

import javax.swing.*;
import java.awt.Color;

/*
 * Class main to run the ColorPanel2
 */
public class ColorFrame2 extends JFrame {
	public ColorFrame2() {
		super("Main JPanel implements MouseListener");
		setContentPane(new ColorPanel2());
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ColorFrame2();
	}
}
