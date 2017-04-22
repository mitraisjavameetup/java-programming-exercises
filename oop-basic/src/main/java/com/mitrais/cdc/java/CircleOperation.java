package com.mitrais.cdc.java;


public class CircleOperation {
	public int intRandom = 100;
	public double smallest, largest, sum = 0;
	Circle[] circles;
	
	public CircleOperation() {
		setRandomCircle();
		setSmallest(circles);
		setLargest(circles);
		setSum(circles);
	}
	public void setRandomCircle(){
		circles = new Circle[intRandom];
	    /*TO DO
	     * create looping to stored random using Math.random
	     */
		for(int i = 0; i<intRandom; i++){
			circles[i] = new Circle(Math.random());			
		}
	}
	
	public Circle[] getRandomCircle(){
		return circles;
	}
	
	public void setSmallest(Circle[] circles){
		/*TO DO
		 * Create codes to get the smallest area from circles array
		 */
		smallest = Double.MAX_VALUE;
		for(Circle circle : circles){
			if(smallest > circle.getArea())
				smallest = circle.getArea();
		}
	}
	
	public double getSmallest(){
		
		return smallest;
	}
	
	public void setLargest(Circle[] circles){
		/*TO DO
		 * Create codes to get the largest area from circles array
		 */
		largest = Double.MIN_VALUE;
		for(Circle circle : circles){
			if(largest < circle.getArea())
				largest = circle.getArea();
		}
	}
	
	public double getLargest(){
		
		return largest;
	}
	
	public void setSum(Circle[] circles){
		/*TO DO
		 * Create codes to get the sum area from circles array
		 */
		for(Circle circle : circles){
			sum +=circle.getArea();
		}
	}
	
	public double getSum(){
		
		return sum;
	}
}
