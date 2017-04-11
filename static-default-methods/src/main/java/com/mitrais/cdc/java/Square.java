package com.mitrais.cdc.java;

public class Square implements RegularPolygon {
	
	/* To Do :
	 * Create a class EquilateralTriangle that implements the interface, 
	 *     has getNumSides return 4 and getSideLength return an instance variable that is set by the constructor.
	 */
	
	private double sideLength;
	private int numSides = 4;
	
	public Square(double sideLength) {
		// TODO Auto-generated constructor stub
		this.sideLength = sideLength;
	}
	@Override
	public double getSideLength() {
		// TODO Auto-generated method stub
		return this.sideLength;
	}
	@Override
	public int getNumSides() {
		// TODO Auto-generated method stub
		return this.numSides;
	}
	
	
}
