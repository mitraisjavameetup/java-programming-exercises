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
	/**
	 * Atribut Double
	 */
	private double width, height;
	/**
	 * Default Constructor 
	 */
	public Rectangle() {	}
	/**
	 * Overloading Constructor with value
	 * @param width Double
	 * @param heigth Double
	 */
	public Rectangle(double width, double heigth){
		this.width = width;
		this.height = heigth;
	}
	/**
	 * Method with return area Rectangle
	 * (Double)
	 * @return Area Double
	 */
	public double getArea(){
		return width * height;
	}
	/**
	 * Override Method return String 
	 */
	@Override
	public String toString(){
		return "Rectangle (width="+width + ", height="+height+", area="+getArea()+")";
	}
	/**
	 * Getter Width
	 * @return Widht Double
	 */
	public double getWidth() {
		return width;
	}
	/**
	 * Setter Width
	 * @param width Double
	 */
	public void setWidth(double width) {
		this.width = width;
	}
	/**
	 * Getter Height
	 * @return Double
	 */
	public double getHeight() {
		return height;
	}
	/**
	 * Setter Height
	 * @param height Double
	 */
	public void setHeight(double height) {
		this.height = height;
	}
	

}