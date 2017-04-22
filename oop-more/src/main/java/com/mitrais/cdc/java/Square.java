package com.mitrais.cdc.java;

/** Pre-condition:
 *  It should continue from your Square.java on oop-basic exercise
 *  TO DO:
 *  1. Make your Square inherit from Rectangle, but still enforce the restriction that the width and 
 *  the height are the same. 
 *  Hint: override some method(s)
 *  2. Change width/side field to private
 *  3. Declare set and get method for width/side field so it can be accessed as a public
 *  Note: 2 and 3 are used to illustrate encapsulation
 *  4. Add new method toString that return String of information of Square itself
 *  e.g : the return will be String as "Square (width/height=10.0, area=100.0)"
 * 
 */

public class Square extends Rectangle{
	/**
	 * Class For Square that inherite Rectangle
	*/
	private double width;
	private double area;
	
	/**
	 * Constructor of Square
	*/
	public Square() {
		super();
	}
	
	/**
	 * Method for get width of square
	 * @return width
	*/
	
	public double getWidth() {
		return width;
	}

	/**
	 * Method for set width of square
	 * @param width
	*/
	public void setWidth(double width) {
		this.width = width;
	}

	/**
	 * Method for calculate area of square
	*/
	public void setArea() {
		this.area = this.width * this.width;
	}

	/**
	 * Method for get area of square
	 * @return area
	*/
	public double getArea(){
		return this.area;
	}
	
	/**
	 * Method for view the overall value for square
	 * @return string of square value
	*/
	@Override
	public String toString() {
		return "Square (width=" + width + ", area=" + area + ")";
	}
	
}