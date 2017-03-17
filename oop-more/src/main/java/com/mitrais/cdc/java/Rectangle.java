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
/*
 * Rectangle Class
 */
public class Rectangle {

	private double width, height;
	/*
	 * Blank Constructor
	 */
	public Rectangle(){}
	/*
	 * Constructor
	 */
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	
	/*
	 * calculating area of the Rectangle
	 */
	public double getArea() {
		return width * height;
	}
	
	
	/*
	 * getter for Rectangle width
	 * you can take radius value through this method
	 */
	public double getWidth() {
		return width;
	}
	
	/*
	 * getter for Rectangle heigth
	 * you can take radius value through this method
	 */
	public double getHeight() {
		return height;
	}
	
	/*
	 * setter for Rectangle width
	 * you can assign radius from this method
	 */
	public void setWidth(double width) {
		this.width = width;
	}
	
	/*
	 * setter for Rectangle height
	 * you can assign radius from this method
	 */
	public void setHeight(double height) {
		this.height = height;
	}
	
	@Override
	public String toString() {
		return "Rectangle (width = " + width + ", height = " + height + ", area = " + getArea() + ")";
	}
}