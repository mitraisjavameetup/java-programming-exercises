package com.mitrais.cdc.java;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class PolygonTest {
	public static void main(String[] args) {
		/*
		 * Create Polygon using EquilateralTriangle and Square then print out
		 * the totalsides
		 */
		RegularPolygon[] triangles = new RegularPolygon[10];
		for (int i = 0; i < 10; i++) {
			triangles[i] = new EquilateralTriangle(ThreadLocalRandom.current().nextDouble(1.0, 21.0));
		}
		
		RegularPolygon[] squares = new RegularPolygon[10];
		for (int i = 0; i < 10; i++) {
			squares[i] = new Square(ThreadLocalRandom.current().nextDouble(1.0, 21.0));
		}
		
		System.out.println(RegularPolygon.totalSides(triangles));
		System.out.println(RegularPolygon.totalSides(squares));
	}
}
