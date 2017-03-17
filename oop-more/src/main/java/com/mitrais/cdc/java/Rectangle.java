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
 * Rectangle class
 */
public class Rectangle {
	
	/*
	 * 1. Change width and height field to private
	 */
	private double width, height;
	
	/*
	 * Rectangle class constructor
	 */
	public Rectangle() {
		this.width = Math.random();
		this.height = Math.random();
	}
	
	
	/*
	 *  2. Declare get method for width fields so it can be accessed as a public
	 */
	public double getWidth() {
		return width;
	}

	
	/*
	 *  2. Declare set method for width fields so it can be accessed as a public
	 */
	public void setWidth(double width) {
		this.width = width;
	}

	
	/*
	 *  2. Declare get method for height fields so it can be accessed as a public
	 */
	public double getHeight() {
		return height;
	}

	
	/*
	 *  2. Declare set method for height fields so it can be accessed as a public
	 */
	public void setHeight(double height) {
		this.height = height;
	}
	
	
	/*
	 *  Method to calculate Rectangle area
	 */
	public double getArea() {
		return this.width * this.height;
	}
	
	
	/*
	 * 3. Add new method toString that return String of information of Rectangle itself
	 */
	@Override
	public String toString() {
		return "Rectangle (width = " + this.width + ", height = " + this.height + ", area = " + this.getArea();
	}
	

}