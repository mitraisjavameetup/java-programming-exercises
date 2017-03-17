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
	private double width;
	private double height;
	
	public double getArea(){
		return (this.width*this.height);
	}
	
	public Rectangle(double w,double h){
		this.width=w;
		this.height=h;
	}
	
	public Rectangle(){
		
	}
	
	
	public String toString() {
		return "(Width = " + width + ", Height= "+ height+")";
	}

}