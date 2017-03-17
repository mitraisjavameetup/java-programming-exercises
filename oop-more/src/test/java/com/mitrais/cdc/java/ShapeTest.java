package com.mitrais.cdc.java;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class ShapeTest{

	@Test
	public void CircleTest(){
		Circle circle = new Circle(Math.random());
		assertNotNull(circle.toString());
	}
	
	@Test
	public void SquareTest(){
		Square square = new Square(Math.random());
		assertNotNull(square.toString());
	}
	
	@Test
	public void RectangleTest(){
		Rectangle rectangle = new Rectangle(Math.random(),Math.random());
		assertNotNull(rectangle.toString());
	}
}
