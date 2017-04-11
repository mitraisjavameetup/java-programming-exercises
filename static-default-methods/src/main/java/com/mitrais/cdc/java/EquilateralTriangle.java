package com.mitrais.cdc.java;

public class EquilateralTriangle implements RegularPolygon {

	/* To Do :
	 * Create a class EquilateralTriangle that implements the interface, 
	 *     has getNumSides return 3 and getSideLength return an instance variable that is set by the constructor.
	 */
	
	private double sideLength;
	
	EquilateralTriangle(double sideLength){
		this.sideLength=sideLength;
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
