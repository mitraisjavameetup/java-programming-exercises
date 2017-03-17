package com.mitrais.cdc.java;

import static org.junit.Assert.*;

import org.junit.Test;

/**class to test all shape class */
public class ShapeTest{

	/**test circle class */
	@Test
	public void CircleTest(){
		Circle circle = new Circle();
		assertNotNull(circle.toString());
	}
	/**test square class */
	@Test
	public void SquareTest(){
		Square square = new Square();
		assertNotNull(square.toString());
	}
	/**test rectangle class */
	@Test
	public void RectangleTest(){
		Rectangle rectangle = new Rectangle();
		assertNotNull(rectangle.toString());
	}
}
