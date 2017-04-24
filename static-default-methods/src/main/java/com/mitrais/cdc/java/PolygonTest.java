package com.mitrais.cdc.java;

import java.util.*;

public class PolygonTest {
  public static void main(String[] args) {
	/*
	 * Create Polygon using EquilateralTriangle and Square
	 * then print out the totalsides  
	 */
	  RegularPolygon[] regularPolygon={new Square(5),
			  						   new EquilateralTriangle(10)};
	  
	  System.out.println("Sum of sides : "+RegularPolygon.totalSides(regularPolygon));
  }
}
