package com.mitrais.cdc.java;

public class EquilateralTriangle implements RegularPolygon {
	/* To Do :
	 * Create a class EquilateralTriangle that implements the interface, 
	 *     has getNumSides return 3 and getSideLength return an instance variable that is set by the constructor.
	 */
	private double sideLength;
	
	public EquilateralTriangle() {
		// TODO Auto-generated constructor stub
	}
	
	public EquilateralTriangle(double sideLength) {
		// TODO Auto-generated constructor stub
		this.sideLength = sideLength;
	}
	
	@Override
	public int getNumSides() {
		// TODO Auto-generated method stub
		return 3;
	}
	
	@Override
	public double getSideLength() {
		// TODO Auto-generated method stub
		return sideLength;
	}
}
