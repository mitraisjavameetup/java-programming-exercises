package com.mitrais.cdc.java;

public class Square implements RegularPolygon {
	private double length;
	public Square(double length) {
		this.length = length;
	}
	public int getNumSides() {
		return 4;
	}

	public double getSideLength() {
		return length;
	}
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
	
	
	/* To Do :
	 * Create a class EquilateralTriangle that implements the interface, 
	 *     has getNumSides return 4 and getSideLength return an instance variable that is set by the constructor.
	 */
	
}
