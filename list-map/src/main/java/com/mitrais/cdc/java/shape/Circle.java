package com.mitrais.cdc.java.shape;

/**
 * Class to make Circle with Shape interface
 * @author Egi
 * @version 1.0
 */
public class Circle implements Shape {
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
}
