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

/*
 * Circle class
 */
public class Circle  {

	private double radius;

	/*
	 * Constructor
	 */
	public Circle (double radius) {
		this.radius = radius;
	}
	
	/*
	 * calculating area of the circle
	 */
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	/*
	 * getter for circle radius
	 * you can take radius value through this method
	 */
	public double getRadius() {
		return radius;
	}
	
	/*
	 * setter for circle radius
	 * you can assign radius from this method
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle (radius = " + radius + ", area = " + getArea() + ")";
	}
}