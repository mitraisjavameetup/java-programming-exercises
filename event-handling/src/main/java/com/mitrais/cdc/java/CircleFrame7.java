package com.mitrais.cdc.java;

import java.awt.Color;

import javax.swing.*;


public class CircleFrame7 extends JFrame {
	public CircleFrame7(){
		
		super("Left Click or Right Click to Add or Remove Circle");
		setSize(500,500);
		setContentPane(new CirclePanel7(Color.BLUE));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new CircleFrame7();
	}
}
