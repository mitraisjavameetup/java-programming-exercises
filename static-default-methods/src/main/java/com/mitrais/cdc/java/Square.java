package com.mitrais.cdc.java;

public class Square implements RegularPolygon {
	public double sideLength;
	public Square(double sideLength) {
		// TODO Auto-generated constructor stub
		this.sideLength = sideLength;
	}	
	
	
	public double getSideLength() {
		// TODO Auto-generated method stub
		return this.sideLength;
	}


	public int getNumSides() {
		// TODO Auto-generated method stub
		return 4;
	}
	
	/* To Do :
	 * Create a class EquilateralTriangle that implements the interface, 
	 *     has getNumSides return 4 and getSideLength return an instance variable that is set by the constructor.
	 */
	
}
