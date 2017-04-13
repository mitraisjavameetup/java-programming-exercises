package com.mitrais.cdc.java;

public class EquilateralTriangle implements RegularPolygon {
	/* To Do :
	 * Create a class EquilateralTriangle that implements the interface, 
	 *     has getNumSides return 3 and getSideLength return an instance variable that is set by the constructor.
	 */
	double sideLength;
	public EquilateralTriangle(double sideLength){
		this.sideLength = sideLength;
	}
	/** Override function to get equilateral triangle sides */
	@Override
	public int getNumSides(){
		return 3;
	}

	/** Override function to get equilateral triangle sides length */
	@Override
	public double getSideLength() {
		// TODO Auto-generated method stub
		return this.sideLength;
	}
}
