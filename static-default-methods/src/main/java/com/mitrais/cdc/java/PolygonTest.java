package com.mitrais.cdc.java;

public class PolygonTest {
  public static void main(String[] args) {
	/*
	 * Create Polygon using EquilateralTriangle and Square
	 * then print out the totalsides  
	 */
	  
	  RegularPolygon[] regularpolygons = { new EquilateralTriangle(5),
              							new Square(10)};
	  			System.out.println("Sum of areas: " + RegularPolygon.totalSides(regularpolygons));
	  
  }
}
