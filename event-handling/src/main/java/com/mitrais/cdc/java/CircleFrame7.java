package com.mitrais.cdc.java;

import java.awt.Color;

import javax.swing.JFrame;


public class CircleFrame7 extends JFrame{

	public CircleFrame7() {
		super("Drawing Shapes");
		setBackground(Color.BLACK);
	    JFrame f=new JFrame();
		f.setSize(500, 500);
	    f.setTitle("Circle");
	    f.setBackground(Color.BLACK);
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    f.setContentPane(new CirclePanel7());
	    f.setVisible(true);	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CircleFrame7();
	}

}
