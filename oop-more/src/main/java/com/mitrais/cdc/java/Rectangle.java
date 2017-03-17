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

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	public Rectangle() {
		// TODO Auto-generated constructor stub
		width = 0.123;
		height = 0.432;
	}

	public double getArea() {
		// TODO Auto-generated method stub
		return width*height;
	}

	public String toString(){
		return "Rectangle (width="+ width +", height="+ height +", area="+ getArea() +")";
	}
}