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
	
	public static int totalSides(RegularPolygon[] polygons){
		int totalSides = 0;
		for(RegularPolygon polygon : polygons){
			totalSides += polygon.getNumSides();
		}
		return totalSides;
	}
	
	default double getPerimeter(){
		int n = this.getNumSides();
		return (n*this.getSideLength());
	}
	
	default double getInteriorAngle(){
		int n = this.getNumSides();
		return ((n-2)*Math.PI/n);
	}
 
}
