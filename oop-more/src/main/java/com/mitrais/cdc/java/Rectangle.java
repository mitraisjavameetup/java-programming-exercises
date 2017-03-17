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

/** Rectangle Class */
public class Rectangle {
	private double width, height;
	private double area;
	
	/** Constructor */
	public Rectangle(double width, double height)
	{
		this.width = width;
		this.height = height;
		calculateArea();
	}
	
	public Rectangle()
	{
		
	}
	
	private void calculateArea()
	{
		area = width * height;
	}
	
	/** Get Rectangle Width */
	public double getWidth() {
		return width;
	}

	/** Set Rectangle Width */
	public void setWidth(double width) {
		this.width = width;
		calculateArea();
	}

	/** Get Rectangle Height */
	public double getHeight() {
		return height;
	}
	
	/** Set Rectangle Height */
	public void setHeight(double height) {
		this.height = height;
		calculateArea();
	}

	/** Get Rectangle Area */
	public double getArea()
	{
		return area;
	}
	
	@Override /** Print Rectangle width, height, and Area */
	public String toString() {
		return "Rectangle (width="+ getWidth() +", height="+ getHeight() +", area="+ getArea() +")";
	}
}