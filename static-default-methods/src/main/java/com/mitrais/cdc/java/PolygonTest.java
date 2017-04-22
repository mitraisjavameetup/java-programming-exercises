package com.mitrais.cdc.java;

import java.util.*;

public class PolygonTest {
  public static void main(String[] args) {
	/*
	 * Create Polygon using EquilateralTriangle and Square
	 * then print out the totalsides  
	 */
	  RegularPolygon polygons[] = { 
		  new EquilateralTriangle(4), 
		  new Square(5)
	  };
	  
	  System.out.printf("total sides = %d", RegularPolygon.totalSides(polygons));
  }
}
