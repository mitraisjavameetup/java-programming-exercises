package com.mitrais.cdc.java;

public class Circle  {

	public double radius;
	private double area;
	/*
	 * todo: make a Circle class with various capabilities below:
	 * 1. Give the Circle class a radius field of type double
	 * 2. Give Circle a method that computes the area ((Math.PI)*radius*radius) 
	 * 3. Give Circle a constructor to which you can pass the radius
	 * 4. Have the constructor use the “this” variable
	 * 5. Add a toString method
	 */
	
	public Circle(double radius)
	{
		this.radius = radius;
		calculateArea();
	}
	
	private void calculateArea()
	{
		area = Math.PI * this.radius * this.radius;
	}
	
	public double getArea()
	{
		return area;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Radius = " + radius + " Area = " + getArea();
	}
	
}