package com.mitrais.cdc.java;
import java.lang.Math;

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
		for (int i = 0; i < circles.length; i++) {
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
		smallest = circles[0].getArea();
		
		for(int i = 1; i < circles.length; i++) {
			if(circles[i].getArea() < smallest) {
				smallest = circles[i].getArea();
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
		largest = circles[0].getArea();
		
		for(int i = 1; i < circles.length; i++) {
			if(circles[i].getArea() > largest) {
				largest = circles[i].getArea();
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
		for(Circle c: circles) {
			sum = sum + c.getArea();
		}
	}
	
	public double getSum(){
		
		return sum;
	}
}
