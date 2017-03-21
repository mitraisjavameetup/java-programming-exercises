package com.mitrais.cdc.java;

import java.awt.Color;

/** Pre-condition:
 *  It should continue from your Circle.java on oop-basic exercise
 *  TO DO:
 *  1. Change radius field to private
 *  2. Declare set and get method for radius field so it can be accessed as a public
 *  Note: 1 and 2 are used to illustrate encapsulation
 *  3. Add new method toString that return String of information of Circle itself
 *  e.g : the return will be String as "Circle (radius=0.26359375131266183, area=0.21828309061994705)"
 */

public class Circle {
	//radius variable
	private int radius;
	private int x;
	private int y;
	private Color color;
	/**
	 * Calculate Area of the circle
	 * @return area of circle
	 */
	public double getArea(){
		return radius*radius*Math.PI;
	}
	/**
	 * Constructor of Circle class with parameter
	 * @param radius
	 */
	public Circle(int x, int y, int radius, Color color) {
		super();
		this.radius = radius;
		this.x = x;
		this.y = y;
		this.color = color;
	}
	/**
	 * Constructor for implementing overloading
	 */
	public Circle(){
		super();
	}
	/**
	 * getter of radius
	 * @return radius
	 */
	public int getRadius() {
		return radius;
	}
	/**
	 * setter of radius
	 * @param radius
	 */
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	/**
	 * overriding toString()
	 * @return Circle (radius=0.26359375131266183, area=0.21828309061994705) 
	 */
	@Override
	public String toString() {
		return "Circle (radius="+this.radius+", area="+getArea()+")";
	}
}