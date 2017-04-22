package com.mitrais.cdc.java;

import java.util.*;

public class PolygonTest {
  public static void main(String[] args) {
	/*
	 * Create Polygon using EquilateralTriangle and Square
	 * then print out the totalsides  
	 */
	  RegularPolygon[] test = new RegularPolygon[5];
	  test[0] = new Square(5);
	  test[1] = new EquilateralTriangle(10);
	  test[2] = new EquilateralTriangle(8);
	  test[3] = new EquilateralTriangle(3);
	  test[4] = new Square(3);
	
	  System.out.println(RegularPolygon.totalSides(test));
  }
}
