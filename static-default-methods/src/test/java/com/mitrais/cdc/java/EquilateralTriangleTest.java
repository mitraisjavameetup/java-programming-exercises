package com.mitrais.cdc.java;

import static org.junit.Assert.*;


import org.junit.Test;

public class EquilateralTriangleTest {

	@Test
	public void testEquilateralTriangleAndGetSideLength() {
		double sideLength = 4; 
		EquilateralTriangle equilateralTriangle = new EquilateralTriangle(sideLength);
		double resultValue = equilateralTriangle.getSideLength();
		assertTrue(resultValue == sideLength);
	}

	@Test
	public void testGetNumSides() {
		double sideLength = 4; 
		EquilateralTriangle equilateralTriangle = new EquilateralTriangle(sideLength);
		int value = equilateralTriangle.getNumSides();
		assertTrue(value == 3);
	}
	
	@Test
	public void testGetInteriorAngle() {
		double sideLength = 10; 
		EquilateralTriangle equilateralTriangle = new EquilateralTriangle(sideLength);
		double value = equilateralTriangle.getInteriorAngle();
		assertTrue(value == 1.0471975511965976);
	}
	
	@Test
	public void testGetPerimeter() {
		double sideLength = 10; 
		EquilateralTriangle equilateralTriangle = new EquilateralTriangle(sideLength);
		double value = equilateralTriangle.getPerimeter();
		assertTrue(value == 30);
	}

}
