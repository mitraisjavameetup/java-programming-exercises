package com.mitrais.cdc.java;

public class EquilateralTriangle implements RegularPolygon {
	/* To Do :
	 * Create a class EquilateralTriangle that implements the interface, 
	 *     has getNumSides return 3 and getSideLength return an instance variable that is set by the constructor.
	 */
	public double sideLength;
	
	public EquilateralTriangle(double sideLength) {
		// TODO Auto-generated constructor stub
		this.sideLength = sideLength;
	}

	public int getNumSides() {
		// TODO Auto-generated method stub
		return 3;
	}

	public double getSideLength() {
		// TODO Auto-generated method stub
		return this.sideLength;
	}



	
}
