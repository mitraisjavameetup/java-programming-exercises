package com.mitrais.cdc.java.shape;

/**
 * Mitrais Java Training List
 * Circle class
 * @author mitrais
 * @version 1.1
 *
 */

public class Circle extends Shape {
	private double radius;

	/** Builds a Circle with the given radius. */
	 
	public Circle(double radius) {
	  this.radius = radius;
	}
	
	/** Returns the current radius. */
	  
	public double getRadius() {
	  return(radius);
	}
	
	/** Sets the current radius. */
	  
	public void setRadius(double radius) {
	  this.radius = radius;
	}
	
	/** Calculates the area from the radius. */
	@Override
	public double getArea() {
	  return(Math.PI * radius * radius);
	}
	
	/** Indirectly sets the area by working backward to the radius.
	 *  The resultant area may not be EXACTLY what you set, due to roundoff
	 *  error when working with doubles.
	 */
	public void setArea(double area) {
	  radius = Math.sqrt(area / Math.PI);
	}
	
	@Override
	public String toString(){
		return Double.toString(getArea());
	}
}
