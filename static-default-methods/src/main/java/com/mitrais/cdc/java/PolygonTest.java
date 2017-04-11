package com.mitrais.cdc.java;

import java.util.*;

public class PolygonTest {
	public static void main(String[] args) {
		/*
		 * Create Polygon using EquilateralTriangle and Square
		 * then print out the totalsides  
		 */
		RegularPolygon[] shapes = { new EquilateralTriangle(2), new EquilateralTriangle(5), new Square(15),
				new Square(22) };
		System.out.println(RegularPolygon.totalSides(shapes));

	}
}
