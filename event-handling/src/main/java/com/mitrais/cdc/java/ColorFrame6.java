package com.mitrais.cdc.java;

import javax.swing.JFrame;

public class ColorFrame6 extends JFrame{
	public ColorFrame6()
	{
		setSize(500,500);
		setContentPane(new ColorPanel6());
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ColorFrame6();
	}
}
