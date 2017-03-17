package com.mitrais.cdc.java;

/** Pre-condition:
 *  It should continue from your Rectangle.java on oop-basic exercise
 *  TO DO:
 *  1. Change width and height field to private
 *  2. Declare set and get method for width and height fields so it can be accessed as a public
 *  Note: 1 and 2 are used to illustrate encapsulation
 *  3. Add new method toString that return String of information of Rectangle itself
 *  e.g : the return will be String as "Rectangle (width=1.6965338407715858, height=4.389922209793273, area=7.4476515872690685)"
 */

public class Rectangle {
	private double width, height;
	private double area;

	public double getArea() {
		this.area = this.width* this.height;
		return this.area;
	}
	
	public String toString() {
		return "Rectangle (width=" + width + ", height=" + height + ", area=" + area + ")";
	}


	public Rectangle( double wid, double hig) {
		this.width = wid;
		this.height = hig;
	}
	
	public Rectangle() {
		
	}
	
}