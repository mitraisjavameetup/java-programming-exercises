package com.mitrais.cdc.java;

import java.util.*;

public class PolygonTest {
  public static void main(String[] args) {
	/*
	 * Create Polygon using EquilateralTriangle and Square
	 * then print out the totalsides  
	 */
	Square square = new Square(20);
	EquilateralTriangle triangle = new EquilateralTriangle(20);
	
	RegularPolygon[] elements = {square, triangle};
	
	System.out.print(RegularPolygon.totalSides(elements));
  }
}
