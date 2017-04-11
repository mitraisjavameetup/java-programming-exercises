package com.mitrais.cdc.java;

import java.util.*;

public class PolygonTest {
  public static void main(String[] args) {
	/*
	 * Create Polygon using EquilateralTriangle and Square
	 * then print out the totalsides  
	 */
	  RegularPolygon[] polygon={
			  new EquilateralTriangle(10),
			  new Square(10)
	  };
	  System.out.println("Sum :"+RegularPolygon.totalSides(polygon));
  }
}
