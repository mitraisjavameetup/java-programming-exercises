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

public class Square extends Rectangle {

	/**
	 * Constructor of Square
	 */
	public Square() {
		super();
		// TODO Auto-generated constructor stub
	}

	/** Method to get the width of the square
	 * @param wid
	 */
	public Square(double wid) {
		super(wid, wid);
		// TODO Auto-generated constructor stub
	}

	/** Method to get overall value of the square
	 * @return String of square value
	 */
	@Override
	public String toString() {
		return "Square [getArea()=" + getArea() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	

	
}
	
	
	
	
