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

	/**Fixed-width/height Constructor*/
	public Rectangle(double width, double height)
	{
		this.width = width;
		this.height = height;
	}
	
	/**Default constructor*/
	public Rectangle()
	{
		this.width = Math.random();
		this.height = Math.random();
	}
	
	/**Specifically used to generate squares*/
	public Rectangle(boolean square)
	{
		if (square)
		{
			this.width = Math.random();
			this.height = this.width;
		}
		else
		{
			setHeight(Math.random());
			setWidth(Math.random());
		}
	}
	
	/**Returns the width*/
	public double getWidth() {
		return width;
	}
	
	/**Sets the width*/
	public void setWidth(double width) {
		this.width = width;
	}

	/**Gets the height*/
	public double getHeight() {
		return height;
	}

	/**Sets the height*/
	public void setHeight(double height) {
		this.height = height;
	}

	/**Gets the area*/
	public double getArea()
	{
		return width * height;
	}
	
	@Override
	public String toString() {
		return "Rectangle (width=" + width + ", height=" + height + ", area=" + getArea() + ")";
	}
}