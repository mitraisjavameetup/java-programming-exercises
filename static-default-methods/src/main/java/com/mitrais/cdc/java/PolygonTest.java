package com.mitrais.cdc.java;

import java.util.*;

public class PolygonTest {
  public static void main(String[] args) {
	/*
	 * Create Polygon using EquilateralTriangle and Square
	 * then print out the totalsides  
	 */
	  RegularPolygon[] regularPolygons = {new EquilateralTriangle(3), new Square(3)};
	  
	  System.out.printf("%s", RegularPolygon.totalSides(regularPolygons));
  }
}
