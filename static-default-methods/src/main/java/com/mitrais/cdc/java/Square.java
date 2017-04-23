package com.mitrais.cdc.java;
/**
 * 
 * @author trainee
 * class Square
 */
public class Square implements RegularPolygon {
	
	/* To Do :
	 * Create a class EquilateralTriangle that implements the interface, 
	 *     has getNumSides return 4 and getSideLength return an instance variable that is set by the constructor.
	 */
	private double length;
	@Override
	/**
	 * return int
	 */
	public int getNumSides(){ return 4;}
	@Override
	/**
	 * return double
	 * 
	 */
	public double getSideLength(){
		return this.length;
	}
	/**
	 * constructor for Square
	 * @param length
	 */
	Square(double length){
		this.length=length;
	}
}
