package com.mitrais.cdc.java;

public class Square implements RegularPolygon {
	
	/* To Do :
	 * Create a class EquilateralTriangle that implements the interface, 
	 *     has getNumSides return 4 and getSideLength return an instance variable that is set by the constructor.
	 */
	
	private int side = 4;
	private double sideLength;
	
	public Square(double sideLength)
	{
		this.sideLength = sideLength;
	}
	
	@Override
	public int getNumSides()
	{
		return side;
	}
	
	@Override
	public double getSideLength()
	{
		return sideLength;
	}
}
