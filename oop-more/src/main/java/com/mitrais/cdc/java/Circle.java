package com.mitrais.cdc.java;

/** Pre-condition:
 *  It should continue from your Circle.java on oop-basic exercise
 *  TO DO:
 *  1. Change radius field to private
 *  2. Declare set and get method for radius field so it can be accessed as a public
 *  Note: 1 and 2 are used to illustrate encapsulation
 *  3. Add new method toString that return String of information of Circle itself
 *  e.g : the return will be String as "Circle (radius=0.26359375131266183, area=0.21828309061994705)"
 */

public class Circle {
	private double radius;
	private double area;

	/**Fixed circle radius*/
	public Circle(double radius)
	{
		this.radius = radius;
	}

	/**Default constructor*/
	public Circle()
	{
		this.radius = Math.random();
	}

	/**Gets the radius*/
	public double getRadius() {
		return radius;
	}

	/**Sets the radius*/
	public void setRadius(double radius) {
		this.radius = radius;
	}

	/**Computes the area*/
	public void computeArea()
	{
		area = Math.PI * radius * radius;
	}

	/**Gets the area*/
	public double getArea()
	{
		computeArea();
		return area;
	}
	
	@Override
	public String toString() {
		return "Circle (radius=" + radius + ", area=" + getArea() + ")";
	}
}