package com.mitrais.cdc.java;

public class EquilateralTriangle implements RegularPolygon {
	/* To Do :
	 * Create a class EquilateralTriangle that implements the interface, 
	 *     has getNumSides return 3 and getSideLength return an instance variable that is set by the constructor.
	 */
	public double length; 
	
	
	public EquilateralTriangle(double length) {
		super();
		this.length = length;
	}


	public int getNumSides(){
		return 3;
	}
	
	public void setLength(double length) {
		this.length = length;
	}

	public double getSideLength(){
		return this.length;
	}
	
	
}
