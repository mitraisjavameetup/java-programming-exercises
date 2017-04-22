package com.mitrais.cdc.java;

public class Square {

	public double width;
	
	public Square() {
		this.width = 2.0;
	}
	
	public Square(double width) {
		this.width = width;
	}
	
	public double getArea() {
		return (this.width * this.width);
	}
	
	@Override
	public String toString() {
		return "A square with a width of "+this.width;
	}
	/*
	 * todo: make a Square class with various capabilities below:
	 * 1. Give the Square class a width field of type double
	 * 2. Give Square a method that computes the area (width * width) 
	 * 3. Give Square a constructor to which you can pass the width
	 * 4. Have the constructor use the “this” variable
	 * 5. Add a toString method
	 * 
	 */
	
}
