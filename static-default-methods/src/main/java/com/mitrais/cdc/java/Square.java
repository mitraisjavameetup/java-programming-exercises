package com.mitrais.cdc.java;

public class Square implements RegularPolygon {
	
	/* To Do :
	 * Create a class EquilateralTriangle that implements the interface, 
	 *     has getNumSides return 4 and getSideLength return an instance variable that is set by the constructor.
	 */
	int numSides;
	double sideLength;
	
	public Square(double sideLength) {
		this.numSides = 4;
		this.sideLength = sideLength;
	}
	
	public int getNumSides() {
		return this.numSides;
	}
	
	public double getSideLength() {
		return this.sideLength;
	}
}
