package com.mitrais.cdc.java;

import java.util.Iterator;

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
		this.circles = new Circle[intRandom];
	    /*TO DO
	     * create looping to stored random using Math.random
	     */
		for (int i = 0; i < circles.length; i++) {
			this.circles[i] = new Circle(Math.random());
		}
	}
	
	public Circle[] getRandomCircle(){
		return circles;
	}
	
	public void setSmallest(Circle[] circles){
		/*TO DO
		 * Create codes to get the smallest area from circles array
		 */
		double smallest = Integer.MAX_VALUE;
		for (Circle c : circles) {
			if (c.getArea() < smallest) {
				this.smallest = smallest = c.getArea();
			}
		} 
	}
	
	public double getSmallest(){
		
		return smallest;
	}
	
	public void setLargest(Circle[] circles){
		/*TO DO
		 * Create codes to get the largest area from circles array
		 */
		double largest = Integer.MIN_VALUE;
		for (Circle c : circles) {
			if (c.getArea() > largest) {
				this.largest = largest = c.getArea();
			}
		} 
	}
	
	public double getLargest(){
		
		return largest;
	}
	
	public void setSum(Circle[] circles){
		/*TO DO
		 * Create codes to get the sum area from circles array
		 */
		for (Circle c : circles) {
			this.sum += c.getArea();
		}
	}
	
	public double getSum(){
		return sum;
	}
}
