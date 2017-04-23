package com.mitrais.cdc.java;
/**
 * 
 * @author trainee
 * Class EquilateralTriangle
 */
public class EquilateralTriangle implements RegularPolygon {
	/* To Do :
	 * Create a class EquilateralTriangle that implements the interface, 
	 *     has getNumSides return 3 and getSideLength return an instance variable that is set by the constructor.
	 */
	private double length;
	@Override
	/**
	 * return int
	 */
	public int getNumSides(){return 3;}
	@Override
	/**
	 * return double
	 */
	public double getSideLength(){
	return this.length;}
	
	/**
	 * constructor EquilateralTriangle
	 * @param length
	 */
	EquilateralTriangle(double length){
		this.length=length;
	}
	}
	

