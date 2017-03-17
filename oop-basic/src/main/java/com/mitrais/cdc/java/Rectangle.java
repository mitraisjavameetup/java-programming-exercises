package com.mitrais.cdc.java;

public class Rectangle {

	public double width, height;

	/*
	 * todo: make a Square class with various capabilities below: 1. Give the
	 * Square class a width and height field of type double 2. Give Square a
	 * method that computes the area (width * height) 3. Give Square a
	 * constructor to which you can pass the width 4. Have the constructor use
	 * the “this” variable 5. Add a toString method
	 * 
	 */
	public Rectangle(double w, double h) {
		if (w == 0) {
			this.width = 1;
		} else if (h == 0) {
			this.height = 1;
		} else {
			this.width = width * 100;
			this.height = height * 100;
		}
	}

	public double getArea() {
		return (height*width);

	}
	@Override
	public String toString(){
		return "So the Question is"+this.width+this.height;
	}
}
