package com.mitrais.cdc.java;

public interface RegularPolygon {
	
  /* To Do :
   * 1. Create An interface called RegularPolygon with two abstract methods: getNumSides and getSideLength.
   * 2. Add a static totalSides method, that given a RegularPolygon[], returns the sum of the number of sides of all the elements.
   * 3. Add two default methods:
   *    • getPerimeter (n * length, where n is the number of sides)
   *    • getInteriorAngle ( (n-2)π/n in radians)
   */
	public abstract int getNumSides();
	public abstract double getSideLength();
	
	public static double totalSides(RegularPolygon[] poly) {
		double sum = 0;
		for(RegularPolygon p:poly) {
			sum += p.getNumSides();
		}
		return sum;
	}
	public default double getPerimeter() {
		return getNumSides() * getSideLength();
	}
	public default double getInteriorAngle() {
		return Math.toRadians((getNumSides()-2) * Math.toDegrees(Math.PI)/getNumSides());
	}
}
