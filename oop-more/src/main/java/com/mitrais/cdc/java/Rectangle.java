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
	//Declaring @width and @height variable
	private double width, height;
	/**
	 * calculate area of rectangle	
	 * @return width*height
	 */
	
	public double getArea(){
		return width*height;
	}
	/**
	 * Constructor with parameter	
	 * @param width
	 * @param height
	 */
	public Rectangle (double width, double height){
		super();
		this.width = width;
		this.height = height;
	}
	/**
	 * implementing overloading
	 * Constructor without parameter
	 */
	public Rectangle(){
		super();
	}
	/**
	 * getter for width
	 * @return width
	 */
	public double getWidth() {
		return width;
	}
	/**
	 * setter for width
	 * @param width
	 */
	public void setWidth(double width) {
		this.width = width;
	}
	/**
	 * getter for height
	 * @return height
	 */
	public double getHeight() {
		return height;
	}
	/**
	 * setter for height
	 * @param height
	 */
	public void setHeight(double height) {
		this.height = height;
	}
	/**
	 * overriding toString method
	 * @reutrn Rectangle (width=1.6965338407715858, height=4.389922209793273, area=7.4476515872690685)
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Rectangle (width="+width+", height="+height+", area="+getArea()+")";
	}
}