package com.mitrais.cdc.java;

public class EquilateralTriangle implements RegularPolygon {

    /* To Do :
	 * Create a class EquilateralTriangle that implements the interface,
	 *     has getNumSides return 3 and getSideLength return an instance variable that is set by the constructor.
	 */

    private double sideLength;

    public EquilateralTriangle(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public int getNumSides() {
        return 3;
    }

    @Override
    public double getSideLength() {
        return this.sideLength;
    }

	
}
