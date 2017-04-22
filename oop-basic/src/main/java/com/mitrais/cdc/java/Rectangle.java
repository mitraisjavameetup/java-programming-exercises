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
	public Rectangle(double width, double heigth){
		this.width = width;
		this.height = heigth;
	}
	
	public double getArea(){
		return width * height;
	}
	
	public String toString(){
		return "width ="+this.width+" height="+this.height;
	}
	
	
	
}
