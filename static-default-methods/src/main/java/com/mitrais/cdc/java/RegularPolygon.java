package com.mitrais.cdc.java;

public interface RegularPolygon {
	
  /* To Do :
   * 1. Create An interface called RegularPolygon with two abstract methods: getNumSides and getSideLength.
   * 2. Add a static totalSides method, that given a RegularPolygon[], returns the sum of the number of sides of all the elements.
   * 3. Add two default methods:
   *    • getPerimeter (n * length, where n is the number of sides)
   *    • getInteriorAngle ( (n-2)π/n in radians)
   */
	int getNumSides();
	double getSideLength();
	
	public static int totalSide(RegularPolygon[] regularPolygons){
		int temp = 0;
		for (RegularPolygon regularPolygon : regularPolygons) {
			temp += regularPolygon.getNumSides();
		}
		return temp;
	}
	
	default double getPerimeter(){
		return (getNumSides() * getSideLength());
	}
	
	default double getInteriorAngle(){
		return ((getNumSides()-2) * Math.PI / getNumSides());
	}

}
