package com.mitrais.cdc.java;

public class Rectangle {

	public double width, height;

	/*
	 * todo: make a Square class with various capabilities below:
	 * 1. Give the Square class a width and height field of type double
	 * 2. Give Square a method that computes the area (width * height) 
	 * 3. Give Square a constructor to which you can pass the width
	 * 4. Have the constructor use the “this” variable
	 * 5. Add a toString method
	 * 
	 */
	public double getArea(){
		return (this.width*this.height);
	}
	
	public Rectangle(double w,double h){
		this.width=w;
		this.height=h;
	}
	
	public String toString() {
		return "Width = " + width + " Height= "+ height;
	}
}
