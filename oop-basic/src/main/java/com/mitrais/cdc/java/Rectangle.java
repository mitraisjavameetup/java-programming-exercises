package com.mitrais.cdc.java;

public class Rectangle {

	public double width, height;
	public double area;

	public double getArea() {
		this.area = this.width* this.height;
		return this.area;
	}
	
	public String toString() {
		return "Width = " + width + "Height = " + height;
	}


	public void setWidth(double wid) {
		this.width = wid;
	}
	
	public void setHeight(double hig) {
		this.height = hig;
	}
	
	
	/*
	 * todo: make a Square class with various capabilities below:
	 * 1. Give the Square class a width and height field of type double
	 * 2. Give Square a method that computes the area (width * height) 
	 * 3. Give Square a constructor to which you can pass the width
	 * 4. Have the constructor use the “this” variable
	 * 5. Add a toString method
	 * 
	 */
	
}
