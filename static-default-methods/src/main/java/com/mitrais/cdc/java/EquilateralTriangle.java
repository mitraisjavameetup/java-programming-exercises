package com.mitrais.cdc.java;

public class EquilateralTriangle implements RegularPolygon {
	/* To Do :
	 * Create a class EquilateralTriangle that implements the interface, 
	 *     has getNumSides return 3 and getSideLength return an instance variable that is set by the constructor.
	 */
	private int NumSides = 3;
	private double SideLength;
	
	public EquilateralTriangle (double SideLength) {
		this.SideLength = SideLength;
	}
	
	@Override
	public int getNumSides() {
		// TODO Auto-generated method stub
		return NumSides;
	}

	@Override
	public double getSideLength() {
		// TODO Auto-generated method stub
		return SideLength;
	}

	
}
