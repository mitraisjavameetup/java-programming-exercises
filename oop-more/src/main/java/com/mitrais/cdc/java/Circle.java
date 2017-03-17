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
	private double area;
	
	

	public double getArea() {
		this.area	= Math.PI*(this.radius*this.radius);
		return this.area;
	}
	
	public String toString() {
		return "Circle (radius=" + this.radius + ", area=" + this.area + ")";
	}
	
	public void setRadius (double rad) {
		this.radius = rad;
	}
	
	
}