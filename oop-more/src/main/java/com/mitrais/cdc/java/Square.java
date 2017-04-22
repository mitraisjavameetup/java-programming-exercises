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

/** Square Class */
public class Square extends Rectangle{
	private double width;
	private double area;
	
	/** Constructor */
	public Square(double width)
	{
		super(width, width);
		this.width = width;
		calculateArea();
	}
	
	/** Default Constructor */
	public Square()
	{
		
	}
	
	private void calculateArea()
	{
		area = width * width;
	}
	
	/** Get Square Width */
	public double getWidth() {
		return width;
	}

	/** Set Square Width */
	public void setWidth(double width) {
		this.width = width;
		calculateArea();
	}

	/** Get Square Area */
	public double getArea()
	{
		return area;
	}
	
	/** Print Square width and Area */
	@Override
	public String toString() {
		return "Square (width/height="+ getWidth() +", area="+ getArea() +")";
	}
}