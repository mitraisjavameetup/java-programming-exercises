package com.mitrais.cdc.java;

import java.util.*;

public class PolygonTest {
  public static void main(String[] args) {
	/*
	 * Create Polygon using EquilateralTriangle and Square
	 * then print out the totalsides  
	 */
	  Random rand = new Random();

	  RegularPolygon[] regularPolygons = new RegularPolygon[5];
	  for (int i = 0; i < regularPolygons.length; i++) {
		regularPolygons[i] = new Square();
	  }
	  
	  RegularPolygon[] regularPolygons2 = new RegularPolygon[5];
	  for (int i = 0; i < regularPolygons.length; i++) {
		regularPolygons2[i] = new EquilateralTriangle();
	  }
	  
	  System.out.println("Square total slides : " + RegularPolygon.totalSide(regularPolygons));
	  System.out.println("Equilateral Triangle total slides : " + RegularPolygon.totalSide(regularPolygons2));
  }
}
