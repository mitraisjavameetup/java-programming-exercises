package com.mitrais.cdc.java;

/** Pre-condition:
 *  It should continue from your Circle.java on oop-basic exercise
 *  TO DO:
 *  1. Change radius field to private
 *  2. Declare set and get method for radius field so it can be accessed as a public
 *  Note: 1 and 2 are used to illustrate encapsulation
 *  3. Add new method toString that return String of information of Circle itself
 *  e.g : the return will be String as "Circle (radius=0.26359375131266183, area=0.21828309061994705)"
 */
/**circle class */
public class Circle {
	
	private double radius;
	/**get the radius of circle class */
	public double getRadius() {
		return radius;
	}
	/**set the radius of circle class */
	public void setRadius(double radius) {
		this.radius = radius;
	}
	/**calculate the area */
	public double getArea(){
		return Math.PI*radius*radius;
		
	}
	/**circle class constructor with parameter*/
	Circle(double radius){
	this.radius=radius;	
	}
	/**circle class constructor without parameter*/
	Circle(){
		this.radius=0.26359375131266183;
	}
	/**method to print out circle class*/
	public String toString(){
		return "Circle (Radius="+this.radius+","+"area="+getArea()+")";
	}
}