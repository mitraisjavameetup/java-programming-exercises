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

	/**
	 * Constructor for Circle
	*/
	public Circle() {
		
	}

	/**
	 * Method for get radius of circle
	 * @return radius
	*/
	public double getRadius() {
		return radius;
	}
	
	/**
	 * Method for set radius of circle
	 * @param radius
	*/

	public void setRadius(double radius) {
		this.radius = radius;
	}

	/**
	 * Method for get area of circle
	 * @return area
	*/
	public double getArea() {
		return this.area;
	}
	
	/**
	 * Method for calculate area of circle
	*/
	public void setArea(){
		this.area = Math.PI * this.radius * this.radius;
	}

	/**
	 * Method for get overall value of circle
	 * @return String of circle value
	*/
	@Override
	public String toString() {
		return "Circle (radius=" + radius + ", area=" + area + ")";
	}

}