package com.mitrais.cdc.java;
import java.lang.Math;


public class Circle  {
	
	/*
	 * 1. Give the Circle class a radius field of type double
	 */
	public double radius;
	
	
	/*
	 * 2. Give Circle a method that computes the area ((Math.PI)*radius*radius) 
	 */
	public double getArea() {
		return ((Math.PI) * this.radius * this.radius);
	}
	
	
	/*
	 * 3. Give Circle a constructor to which you can pass the radius
	 * 4. Have the constructor use the â€œthisâ€� variable
	 */
	public Circle(double radius) {
		this.radius = radius;
	}
	
	
	/*
	 * 5. Add a toString method
	 */
	public String toString() {
		return "radius = " + this.radius;
	}
	
}