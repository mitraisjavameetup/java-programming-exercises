package com.mitrais.cdc.java;

public class Circle  {

	public int radius = 10;
	private double area;
	private int x, y;
	
	public Circle(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void computeArea()
	{
		area = Math.PI * radius * radius;
	}
	
	public double getArea()
	{
		computeArea();
		return area;
	}
	
	public String toString()
	{
		return "Radius: " + Double.toString(radius) + " Area: " + Double.toString(area);
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