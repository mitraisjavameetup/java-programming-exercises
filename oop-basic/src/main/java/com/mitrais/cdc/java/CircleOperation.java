package com.mitrais.cdc.java;

/*
 * This is java doc for this class
 * test
 * test
 * test
 * test
 */

public class CircleOperation {
	public int intRandom = 100;
	public double smallest, largest, sum = 0;
	Circle[] circles;
	
	/*
	 * this is java doc for this function
	 */
	public void setRandomCircle(){
		circles = new Circle[intRandom];
	    /*TO DO
	     * create looping to stored random using Math.random
	     */
		for (int i = 0; i < intRandom; i++){
			circles[i] = new Circle(Math.random());
		}
	}
	
	public Circle[] getRandomCircle(){
		setRandomCircle();
		return circles;
	}
	
	public void setSmallest(Circle[] circles){
		/*TO DO
		 * Create codes to get the smallest area from circles array
		 */
		smallest = circles[0].getArea();
		
		for (Circle c: circles) {
			double currentArea = c.getArea();
			if (currentArea < smallest)
				smallest = currentArea;
		}
		
	}
	
	public double getSmallest(){
		setSmallest(circles);
		return smallest;
	}
	
	public void setLargest(Circle[] circles){
		/*TO DO
		 * Create codes to get the largest area from circles array
		 */
		largest = circles[0].getArea();
		
		for (Circle c: circles) {
			double currentArea = c.getArea();
			if (currentArea > largest)
				largest = currentArea;
		}
		
	}
	
	public double getLargest(){
		setLargest(circles);
		return largest;
	}
	
	public void setSum(Circle[] circles){
		/*TO DO
		 * Create codes to get the sum area from circles array
		 */
		for (Circle c: circles) {
			sum += c.getArea();
		}
			
	}
	
	public double getSum(){
		setSum(circles);
		return sum;
	}
}
