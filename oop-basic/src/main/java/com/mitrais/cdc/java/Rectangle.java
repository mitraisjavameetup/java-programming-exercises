package com.mitrais.cdc.java;

public class Rectangle {
	
	/*
	 * 1. Give the Rectangle class a width and height field of type double
	 */
	public double width, height;
	
	
	/*
	 * 2. Give Rectangle a method that computes the area (width * height) 
	 */
	public double getArea() {
		return this.width * this.height;
	}
	
	
	/*
	 * 3. Give Rectangle a constructor to which you can pass the width 
	 * 4. Have the constructor use the “this” variable
	 */
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	
	/*
	 * 5. Add a toString method 
	 */
	public String toString() {
		return "Width = " + this.width + " and height = " + this.height;
	}
	
}
