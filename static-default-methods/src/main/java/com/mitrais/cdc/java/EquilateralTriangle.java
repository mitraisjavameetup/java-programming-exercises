package com.mitrais.cdc.java;

public class EquilateralTriangle implements RegularPolygon {
	/* To Do :
	 * Create a class EquilateralTriangle that implements the interface, 
	 *     has getNumSides return 3 and getSideLength return an instance variable that is set by the constructor.
	 */
	private int sides = 3;
	private double length;
	
	EquilateralTriangle(double length){
		this.length = length;
	}
	
	@Override
	public int getNumSides() {
		return sides;
	}

	@Override
	public double getSideLength() {
		return length;
	}
	
}
