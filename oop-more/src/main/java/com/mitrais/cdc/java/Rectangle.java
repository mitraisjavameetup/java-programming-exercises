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
/**rectangle class */
public class Rectangle {

	private double width, height;
	/**get width of the rectangle */
	public double getWidth() {
		return width;
	}
	/**set wudth of the rectangle */
	public void setWidth(double width) {
		this.width = width;
	}
	/**get height of the rectangle */
	public double getHeight() {
		return height;
	}
	/**set height of the rectangle */
	public void setHeight(double height) {
		this.height = height;
	}
	/**calculate the rectangle area */
	public double getArea(){
		return width*height;
	}
	/**rectangle constructor with parameter */
	Rectangle(double width){
		this.width=width;
	}
	/**rectangle constructor with parameter */
	Rectangle(){
		width=1.6965338407715858;
		height=4.389922209793273;
	}
	/**method to print out all variable in rectangle  */
	public String toString(){
		return "Rectangle (width="+width+", height"+height+", area="+getArea()+")";
	}
}