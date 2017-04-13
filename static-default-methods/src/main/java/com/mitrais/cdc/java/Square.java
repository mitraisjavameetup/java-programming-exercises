package com.mitrais.cdc.java;

public class Square implements RegularPolygon {
	
	public double SideLength;

	@Override
	public int getNumSides() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public double getSideLength() {
		// TODO Auto-generated method stub
		return this.SideLength;
	}

	public Square(double n) {
		// TODO Auto-generated constructor stub
		this.SideLength = n;
	}
	/* To Do :
	 * Create a class Square that implements the interface, 
	 *     has getNumSides return 4 and getSideLength return an instance variable that is set by the constructor.
	 */
	
}
