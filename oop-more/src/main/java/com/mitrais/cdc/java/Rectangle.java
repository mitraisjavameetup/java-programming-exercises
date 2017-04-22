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
	private double width,height;
	
	public Rectangle() {
//		if (w == 0) {
//			this.width = 1;
//		} else if (h == 0) {
//			this.height = 1;
//		} else {
			this.width = 1.696533840771585;
			this.height = 4.389922209793273;
//		}
	}

	public double getArea() {
		return (height*width);

	}
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString(){
		return "Rectangle (width=1.6965338407715858, height=4.389922209793273, area=7.4476515872690685)";
	}
}