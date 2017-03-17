package com.mitrais.cdc.java;

public class CircleOperation {
	public int intRandom = 100;
	public double smallest, largest, sum = 0;
	Circle[] circles;
	
	public CircleOperation() {
		super();
		setRandomCircle();
		setSmallest(circles);
		setLargest(circles);
		setSum(circles);
	}

	public void setRandomCircle(){
		circles = new Circle[intRandom];
		for (int i=0;i<circles.length;i++){
			circles[i] = new Circle(Math.random());
		}
	    /*TO DO
	     * create looping to stored random using Math.random
	     */
	}
	
	public Circle[] getRandomCircle(){
		return circles;
	}
	
	public void setSmallest(Circle[] circles){
		
		double smallest = Integer.MAX_VALUE;
		
		for (int i = 0; i < circles.length; i++) {
			if(circles[i].getArea() < smallest){
				this.smallest = smallest = circles[i].getArea();
			}
		}
		/*TO DO
		 * Create codes to get the smallest area from circles array
		 */
	}
	
	public double getSmallest(){
		
		return smallest;
	}
	
	public void setLargest(Circle[] circles){
		double largest = Integer.MIN_VALUE;
		
		for (int i = 0; i < circles.length; i++) {
			if(circles[i].getArea() > largest){
				this.largest = largest = circles[i].getArea();
			}
		}
	}
	
	public double getLargest(){
		
		return largest;
	}
	
	public void setSum(Circle[] circles){
		double sum = 0;
		for (int i = 0; i < circles.length; i++) {
			sum = sum + circles[i].getArea();
			this.sum = sum;
		}
		
		/*TO DO
		 * Create codes to get the sum area from circles array
		 */
	}
	
	public double getSum(){
		
		return sum;
	}
}
