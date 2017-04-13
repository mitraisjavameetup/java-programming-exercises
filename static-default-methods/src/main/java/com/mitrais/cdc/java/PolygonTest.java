package com.mitrais.cdc.java;

import java.util.*;

public class PolygonTest {
  public static void main(String[] args) {
	
	  RegularPolygon[] test = {new EquilateralTriangle(20), new Square(10)};
	  System.out.print("Total sides: ");
	  System.out.println(RegularPolygon.totalSides(test));
	  /*
	 * Create Polygon using EquilateralTriangle and Square
	 * then print out the totalsides  
	 */
  }
}
