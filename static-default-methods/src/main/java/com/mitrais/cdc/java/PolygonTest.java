package com.mitrais.cdc.java;

import java.util.*;

public class PolygonTest {
  public static void main(String[] args) {
	/*
	 * Create Polygon using EquilateralTriangle and Square
	 * then print out the totalsides  
	 */
	  double sideLength = 4; 
	  RegularPolygon triangle = new EquilateralTriangle(sideLength);
	  RegularPolygon square = new Square(sideLength);
	  
	  RegularPolygon[] arrayRegularPolygon = {triangle,square};
	  
	  System.out.println("Calculate totalSides: " + RegularPolygon.totalSides(arrayRegularPolygon));
	  
  }
}
