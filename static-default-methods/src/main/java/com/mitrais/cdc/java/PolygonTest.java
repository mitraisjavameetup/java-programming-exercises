package com.mitrais.cdc.java;

import java.util.*;

public class PolygonTest {
  public static void main(String[] args) {
	/*
	 * Create Polygon using EquilateralTriangle and Square
	 * then print out the totalsides  
	 */
	  RegularPolygon[] rp = {new Square(10), new EquilateralTriangle(8)};
	  System.out.println("Sum of area: " + RegularPolygon.totalSides(rp));
  }
}
