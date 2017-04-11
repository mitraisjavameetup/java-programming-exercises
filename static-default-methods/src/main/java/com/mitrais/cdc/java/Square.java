package com.mitrais.cdc.java;

public class Square implements RegularPolygon {

	private int sides = 4;
	private double length;
	
	Square(double length){
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
	
	/* To Do :
	 * Create a class EquilateralTriangle that implements the interface, 
	 *     has getNumSides return 4 and getSideLength return an instance variable that is set by the constructor.
	 */
	
}
