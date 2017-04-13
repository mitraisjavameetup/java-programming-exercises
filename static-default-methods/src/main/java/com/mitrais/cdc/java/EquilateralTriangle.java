package com.mitrais.cdc.java;

public class EquilateralTriangle implements RegularPolygon {
	
	public double SideLength;

	@Override
	public int getNumSides() {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	public double getSideLength() {
		// TODO Auto-generated method stub
		return this.SideLength;
	}
	
	public EquilateralTriangle(double n) {
		// TODO Auto-generated constructor stub
		this.SideLength = n;
	}
	
	

	
	
	
	
	/* To Do :
	 * Create a class EquilateralTriangle that implements the interface, 
	 *     has getNumSides return 3 and getSideLength return an instance variable that is set by the constructor.
	 */
	
}
