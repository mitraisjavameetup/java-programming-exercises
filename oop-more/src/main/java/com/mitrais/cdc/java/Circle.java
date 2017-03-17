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

public class Circle  {
	private double radius;
	
	/**
	 * Constructor for Circle
	 */
	
	public Circle(double radius) {
		this.radius = radius;
		
	}
	
	/**
	 * Method for get the radius Circle
	 * @return radius
	 */
	
	public double getArea() {
		return Math.PI * radius * radius;
	}

	/**
	 * Method for get the radius Circle
	 * @return radius
	 */
	
	public double getRadius() {
		return radius;
	}

	/**
	 * Method for get the radius Circle
	 * @param radius for cirlce
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}

	/**
	 * Method for get the radius Circle
	 * @return string for circle
	 */
	
	@Override
	public String toString() {
		return "Circle (radius=" + radius +" area = " + getArea()+")";
	}
	
}