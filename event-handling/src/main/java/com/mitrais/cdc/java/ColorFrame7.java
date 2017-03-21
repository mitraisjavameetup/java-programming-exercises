package com.mitrais.cdc.java;

import javax.swing.JFrame;

public class ColorFrame7 extends JFrame {
	public ColorFrame7()
	{
		setSize(500,500);
		setContentPane(new ColorPanel7());
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ColorFrame7();
	}
}
