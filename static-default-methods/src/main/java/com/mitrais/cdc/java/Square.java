package com.mitrais.cdc.java;

public class Square implements RegularPolygon {
	
	private int numSides;
	private double sideLength;
	

	public Square(double sideLength) {
		this.numSides = 4;
		this.sideLength = sideLength;
	}

	public void setSideLength(double sideLength) {
		this.sideLength = sideLength;
	}

	public int getNumSides() {
		// TODO Auto-generated method stub
		return numSides;
	}

	public double getSideLength() {
		// TODO Auto-generated method stub
		return sideLength;
	}
	

	
	/* To Do :
	 * Create a class EquilateralTriangle that implements the interface, 
	 *     has getNumSides return 4 and getSideLength return an instance variable that is set by the constructor.
	 */
	
}
