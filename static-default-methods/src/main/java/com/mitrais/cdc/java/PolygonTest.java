package com.mitrais.cdc.java;

public class PolygonTest {
  public static void main(String[] args) {
	/*
	 * Create Polygon using EquilateralTriangle and Square
	 * then print out the totalsides  
	 */
	  
	 RegularPolygon[] regularPolygons = {
			 new EquilateralTriangle(5),
			 new Square(4)
	 };
	 
	 System.out.println(RegularPolygon.totalSides(regularPolygons));
  }
}
