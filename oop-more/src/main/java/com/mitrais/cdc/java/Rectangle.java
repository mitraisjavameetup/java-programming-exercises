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
	public double width, height;
	/**
	 * constractor for Rectangle
	 * @param width , height
	 */
	public Rectangle (double width, double height){
		this.width = width;
		this.height= height;

	}
	
	/**
	 * Method for get the width and height for Rectangle
	 * @return area
	 */
	
	public double getArea(){
		return width * height ;
		
	}
	
	/**
	 * Method for get the width for Rectangle
	 * @return width
	 */
	
	public double getWidth() {
		return width;
	}
	/**
	 * Method for get the Width for Rectangle
	 * @param width
	 */
	
	public void setWidth(double width) {
		this.width = width;
	}
	/**
	 * Method for get the height for Rectangle
	 * @return radius
	 */
	public double getHeight() {
		return height;
	}
	/**
	 * Method for get the Height for Rectangle
	 * @param height
	 */
	
	public void setHeight(double height) {
		this.height = height;
	}
	
}