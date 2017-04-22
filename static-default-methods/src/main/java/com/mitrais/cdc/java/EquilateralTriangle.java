package com.mitrais.cdc.java;

public class EquilateralTriangle implements RegularPolygon {

	private double sideLength;
	private int numSides;
	
	
	public EquilateralTriangle(double sideLength) {
		this.sideLength = sideLength;
		this.numSides = 3;
	}
	
	public double getSideLength() {
		return sideLength;
	}

	public void setSideLength(double sideLength) {
		this.sideLength = sideLength;
	}


	public int getNumSides() {
		// TODO Auto-generated method stub
		return numSides;
	}


	/* To Do :
	 * Create a class EquilateralTriangle that implements the interface, 
	 *     has getNumSides return 3 and getSideLength return an instance variable that is set by the constructor.
	 */
	
}
