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
	//radius variable
	private double radius;
	/**
	 * Calculate Area of the circle
	 * @return area of circle
	 */
	public double getArea(){
		return radius*radius*Math.PI;
	}
	/**
	 * Constructor of Circle class with parameter
	 * @param radius
	 */
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	/**
	 * Constructor for implementing overloading
	 */
	public Circle(){
		super();
	}
	/**
	 * getter of radius
	 * @return radius
	 */
	public double getRadius() {
		return radius;
	}
	/**
	 * setter of radius
	 * @param radius
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}
	/**
	 * overriding toString()
	 * @return Circle (radius=0.26359375131266183, area=0.21828309061994705) 
	 */
	@Override
	public String toString() {
		return "Circle (radius="+this.radius+", area="+getArea()+")";
	}
}