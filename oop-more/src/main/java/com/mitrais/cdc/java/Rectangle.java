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

	/**
	 * Constructor for rectangle
	*/
	public Rectangle() {
		
	}
	
	/**
	 * Method for get area of rectangle
	 * @return area
	*/
	public double getArea(){
		return this.area;
	}
	/**
	 * Method for get width of rectangle
	 * @return width
	*/
	public double getWidth() {
		return width;
	}

	/**
	 * Method for set width of rectangle
	 * @param width
	*/
	public void setWidth(double width) {
		this.width = width;
	}

	/**
	 * Method for get height of rectangle
	 * @return height
	*/
	public double getHeight() {
		return height;
	}

	/**
	 * Method for set height of rectangle
	 * @param height
	*/
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * Method for calculate area of rectangle
	*/
	public void setArea() {
		this.area = this.width*this.height;
	}

	/**
	 * Method for get overall value of rectangle
	 * @return String of rectangle value
	*/
	@Override
	public String toString() {
		return "Rectangle (width=" + width + ", height=" + height + ", area=" + area + ")";
	}

	

}