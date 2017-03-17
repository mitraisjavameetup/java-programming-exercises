package com.mitrais.cdc.java;

public class Circle  {

	public double radius;
	public double area;
	
	
	
	public double getArea() {
		this.area	= Math.PI*(this.radius*this.radius);
		return this.area;
	}
	
	public String toString() {
		return "Radius = " + radius;
	}


	public void setRadius(double rad) {
		this.radius = rad;
	}
	
	
	/*
	 * todo: make a Circle class with various capabilities below:
	 * 1. Give the Circle class a radius field of type double
	 * 2. Give Circle a method that computes the area ((Math.PI)*radius*radius) 
	 * 3. Give Circle a constructor to which you can pass the radius
	 * 4. Have the constructor use the “this” variable
	 * 5. Add a toString method
	 */
	
}