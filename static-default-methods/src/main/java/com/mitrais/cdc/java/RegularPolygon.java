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
	/**
	 * method to calculate totalSides
	 * @param regularPolygon
	 * @return int
	 */
	public static int totalSides(RegularPolygon[] regularPolygon){
		int sum=0;
		for(RegularPolygon r:regularPolygon){
			sum=sum+r.getNumSides();
		}
		return sum;
	}
	default double getPerimeter(){
		return (getNumSides()*getSideLength());
	}
	default double getInteriorAngle(){
		return (getNumSides()-2)*Math.PI/getNumSides();
	}
	
}
