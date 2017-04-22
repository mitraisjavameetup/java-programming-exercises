package com.mitrais.cdc.java;

import java.util.Iterator;

public class RectangleOperation {
	public int intRandom = 100;
	public double smallest, largest, sum = 0;
	Rectangle[] rectangles;
	
	public RectangleOperation(){
		super();
		setRandomRectangle();
		setSmallest(rectangles);
		setLargest(rectangles);
		setSum(rectangles);
	}
	
	public void setRandomRectangle(){
		rectangles = new Rectangle[intRandom];
		for (int i = 0; i < rectangles.length; i++)
			rectangles[i] = new Rectangle(Math.random(), Math.random());
		
	    /*TO DO
	     * create looping to stored random using Math.random
	     */
	}
	
	public Rectangle[] getRandomRectangle(){
		return rectangles;
	}
	
	public void setSmallest(Rectangle[] rectangles){
		double smallest = Integer.MAX_VALUE;
		for (int i = 0; i < rectangles.length; i++) {
			if(rectangles[i].getArea() < smallest){
				this.smallest = smallest = rectangles[i].getArea();
			}
		}
		/*TO DO
		 * Create codes to get the smallest area from squares array
		 */
	}
	
	public double getSmallest(){
		
		return smallest;
	}
	
	public void setLargest(Rectangle[] rectangles){
		double largest = Integer.MIN_VALUE;
		for (int i = 0; i < rectangles.length; i++) {
			if(rectangles[i].getArea() > largest){
				this.largest = largest = rectangles[i].getArea();
			}
		}
		/*TO DO
		 * Create codes to get the largest area from squares array
		 */
	}
	
	public double getLargest(){
		
		return largest;
	}
	
	public void setSum(Rectangle[] rectangles){
		double sum = 0;
		for (int i = 0; i < rectangles.length; i++) {
			sum = sum + rectangles[i].getArea();
			this.sum = sum;
		}
		/*TO DO
		 * Create codes to get the sum area from squares array
		 */
	}
	
	public double getSum(){
		
		return sum;
	}

}
