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
public class Circle {
	
	/* 
	 * 1. Change radius field to private
	 */
	private double radius;
	
	
	/* 
	 * Circle class constructor
	 */
	public Circle() {
		this.radius = Math.random();
	}
	
	
	/*
	 * 2. Declare get method for radius field so it can be accessed as a public
	 */
	public double getRadius() {
		return radius;
	}


	/*
	 * 2. Declare set method for radius field so it can be accessed as a public
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
	/*
	 * Method to calculate Circle area
	 */
	public double getArea() {
		return ((Math.PI) * this.radius * this.radius);
	}


	/*
	 * 3. Add new method toString that return String of information of Circle itself
	 */
	@Override
	public String toString() {
		return "Circle (radius = " + this.radius + ", area = " + this.getArea();
	}
	

}