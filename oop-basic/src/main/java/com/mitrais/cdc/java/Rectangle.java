package com.mitrais.cdc.java;

public class Rectangle {
	
	//1
	public double width, height;

	//2
	public double getArea(){
		return this.width * this.height;
	}
	
	//3 and 4
	public Rectangle(double width, double height){
		this.width = width;
		this.height = height;
	}
	
	//5
	public String toString(){
		return "width = " + this.width + " and height = " + this.height;
		
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
