package com.mitrais.cdc.java;

import static org.junit.Assert.*;

import org.junit.Test;

public class SquareTest {

	@Test
	public void testSquareAndGetSideLength() {
		double sideLength = 5;
		Square sqr = new Square(sideLength);
		double value = sqr.getSideLength();
		assertTrue(value == sideLength);
	}

	@Test
	public void testGetNumSides() {
		double sideLength = 5;
		Square sqr = new Square(sideLength);
		int numSide = sqr.getNumSides();
		assertTrue(numSide == 4);		
	}
	
	@Test
	public void testGetInteriorAngle() {
		double sideLength = 10; 
		Square sqr = new Square(sideLength);
		double value = sqr.getInteriorAngle();
		assertTrue(value == 1.5707963267948966);
	}
	
	@Test
	public void testGetPerimeter() {
		double sideLength = 10; 
		Square sqr = new Square(sideLength);
		double value = sqr.getPerimeter();
		assertTrue(value == 40);
	}

}
