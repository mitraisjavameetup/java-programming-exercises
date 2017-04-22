package com.mitrais.cdc.java;

import java.util.*;

public class PolygonTest {
  public static void main(String[] args) {
	/*
	 * Create Polygon using EquilateralTriangle and Square
	 * then print out the totalsides  
	 */
	RegularPolygon[] reg = {new EquilateralTriangle(12), new Square(11)};
	System.out.println(RegularPolygon.totalSides(reg));
  }
}
