package com.mitrais.cdc.java;

public class Square {
	
	/*
	 * 1. Give the Square class a width field of type double
	 */
	public double width;
	
	
	/*
	 * 2. Give Square a method that computes the area (width * width) 
	 */
	public double getArea() {
		return this.width * this.width;
	}
	
	
	/*
	 * 3. Give Square a constructor to which you can pass the width 
	 * 4. Have the constructor use the “this” variable
	 */
	public Square(double width) {
		this.width = width;
	}
	
	
	/*
	 * 5. Add a toString method 
	 */
	public String toString() {
		return "Width = " + this.width;
	}
	
}
