package com.mitrais.cdc.java;

public class Square {

	//1
	public double width;

	// 2
	public double getArea(){
		return this.width * this.width;
	}
	
	// 3 and 4
	public Square(double width){
		this.width = width; 
	}
	
	//5
	public String toString(){
		return "width = " + this.width;
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
