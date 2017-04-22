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
	private double width;
	
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
	 * Constructor with parameter
	 * @param width
	 */
	public Square(double width) {
		super();
		this.width = width;
	}
	/**
	 * Implementing overloading
	 * Constructor without parameter
	 */
	public Square(){
		super();
	}
	
	/**
	 * overriding getArea method
	 */
	@Override
	public double getArea() {
		return this.width * this.width;
	}
	/**
	 * overriding toString method
	 */
	@Override
	public String toString() {
		return "Square (width/height="+this.width+", area="+getArea()+")";
	}
}