package com.mitrais.cdc.java;

import javax.swing.JFrame;

public class ColorFrame6 extends JFrame{

	 public ColorFrame6() {
	    super("Number 6");
	    setContentPane(new ColorPanel6());
	    setSize(600, 400);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setVisible(true);
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 new ColorFrame6();
	}

}
