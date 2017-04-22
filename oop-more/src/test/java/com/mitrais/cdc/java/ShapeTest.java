package com.mitrais.cdc.java;

import static org.junit.Assert.*;

import org.junit.Test;

/** ShapeTest Class */
public class ShapeTest{

	@Test
	public void CircleTest(){
		Circle circle = new Circle();
		assertNotNull(circle.toString());
	}
	
	@Test
	public void SquareTest(){
		Square square = new Square();
		assertNotNull(square.toString());
	}
	
	@Test
	public void RectangleTest(){
		Rectangle rectangle = new Rectangle();
		assertNotNull(rectangle.toString());
	}
}
