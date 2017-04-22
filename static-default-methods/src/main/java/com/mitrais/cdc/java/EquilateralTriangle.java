package com.mitrais.cdc.java;

public class EquilateralTriangle implements RegularPolygon {
	

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return RegularPolygon.super.getPerimeter();
	}
	@Override
	public double getInteriorAngle() {
		// TODO Auto-generated method stub
		return RegularPolygon.super.getInteriorAngle();
	}

	private double length;
	
	public EquilateralTriangle(double length){
		this.length = length;
	}
	public int getNumSides() {
		return 3;
	}

	public double getSideLength() {
		return length;
	}
	/* To Do :
	 * Create a class EquilateralTriangle that implements the interface, 
	 *     has getNumSides return 3 and getSideLength return an instance variable that is set by the constructor.
	 */
	
}
