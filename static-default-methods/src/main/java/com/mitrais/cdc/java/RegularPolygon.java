package com.mitrais.cdc.java;

public interface RegularPolygon {
	
	abstract int getNumSides();
	abstract double getSideLength();
	
	public static int totalSides(RegularPolygon[] args) {
		int numberOfSides=0;
		for (int i = 0; i < args.length; i++) {
			numberOfSides+=args[i].getNumSides();
		}
		return numberOfSides;
	}
	
	public default double getPerimeter() {
		return (getNumSides() * getSideLength());
	}
	
	public default double getInteriorAngle() {
		return ((getNumSides()-2)*Math.PI/getNumSides());
	}
  /* To Do :
   * 1. Create An interface called RegularPolygon with two abstract methods: getNumSides and getSideLength.
   * 2. Add a static totalSides method, that given a RegularPolygon[], returns the sum of the number of sides of all the elements.
   * 3. Add two default methods:
   *    • getPerimeter (n * length, where n is the number of sides)
   *    • getInteriorAngle ( (n-2)π/n in radians)
   */
 
}
