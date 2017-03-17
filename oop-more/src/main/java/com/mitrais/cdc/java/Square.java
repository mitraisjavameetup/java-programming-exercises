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

	/** Function to get width of the square */
	public double getWidth() {
		return width;
	}

	/** Function to set width of the square */
	public void setWidth(double width) {
		this.width = width;
	}

	/** Constructor of the square */
	public Square(double width) {
		super(width, width);
		this.width = width;
	}

	/** Constructor of the square */
	public Square() {
		// TODO Auto-generated constructor stub
		width = 0.213;
	}

	/** Function to get the area of the square */
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.pow(width, 2);
	}
	
	/** Function to get the detail result of the square */
	@Override
	public String toString(){
		return "Square (width/height="+ width +", area="+ getArea() +")";
	}
}