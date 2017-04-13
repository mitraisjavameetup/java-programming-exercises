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
	
	
	/** Method to calculate the Area of the circle
	 * @return double area calculated
	 */
	public double getArea() {
		this.area	= Math.PI*(this.radius*this.radius);
		return this.area;
	}
	
	/** Method to get overall value of the circle
	 * @return String of circle value
	 */
	public String toString() {
		return "Circle (radius=" + this.radius + ", area=" + this.area + ")";
	}
	/** Method to get the radius of the circle
	 * @param rad
	 */
	public void setRadius (double rad) {
		this.radius = rad;
	}
	
	
}