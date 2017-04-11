package com.mitrais.cdc.java;

public class Square implements RegularPolygon {
	
	/* To Do :
	 * Create a class EquilateralTriangle that implements the interface, 
	 *     has getNumSides return 4 and getSideLength return an instance variable that is set by the constructor.
	 */
	public double length; 
	
	public Square(double length) {
		super();
		this.length = length;
	}

	public int getNumSides(){
		return 4;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getSideLength(){
		return this.length;
	}
	
}
