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
	 * Double
	 */
	private double width;
	/**
	 * Constructor
	 * Calling Parents Constructor using SUPER
	 */
	public Square(){
		super(10,10);
		width = 10;
	}
	/**
	 * Getter Area
	 * Double
	 */
	@Override
	public double getArea(){
		return width*width;
	}
	/**
	 * Constructor
	 * Double
	 * @param width Double
	 */
	public Square(double width){
		this.width = width;
	}
	/**
	 * Override Method return String 
	 */
	@Override
	public String toString(){
		return "Square (width/height="+width+", area="+getArea()+")";
	}
	/**
	 * Getter Width
	 * Double
	 */
	public double getWidth() {
		return width;
	}
	/**
	 * Setter Width
	 * Double
	 */
	public void setWidth(double width) {
		this.width = width;
	}
	
  
}