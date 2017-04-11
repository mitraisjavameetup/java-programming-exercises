package com.mitrais.cdc.java;

public class Square implements RegularPolygon {

	/*
	 * To Do : Create a class EquilateralTriangle that implements the interface,
	 * has getNumSides return 4 and getSideLength return an instance variable
	 * that is set by the constructor.
	 */
	private double length;

	public Square(double n) {
		this.length = n;
	}

	@Override
	public int getNumSides() {
		return 4;
	}

	@Override
	public double getSideLength() {
		return this.length;
	}
}
