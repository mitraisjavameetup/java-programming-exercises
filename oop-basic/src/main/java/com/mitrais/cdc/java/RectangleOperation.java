package com.mitrais.cdc.java;

public class RectangleOperation {
	public int intRandom = 100;
	public double smallest, largest, sum = 0;
	Rectangle[] rectangles;
	
	public void setRandomRectangle(){
		rectangles = new Rectangle[intRandom];
	    /*TO DO
	     * create looping to stored random using Math.random
	     */
	}
	
	public Rectangle[] getRandomRectangle(){
		return rectangles;
	}
	
	public void setSmallest(Rectangle[] rectangles){
		/*TO DO
		 * Create codes to get the smallest area from squares array
		 */
	}
	
	public double getSmallest(){
		
		return smallest;
	}
	
	public void setLargest(Rectangle[] rectangles){
		/*TO DO
		 * Create codes to get the largest area from squares array
		 */
	}
	
	public double getLargest(){
		
		return largest;
	}
	
	public void setSum(Rectangle[] rectangles){
		/*TO DO
		 * Create codes to get the sum area from squares array
		 */
	}
	
	public double getSum(){
		
		return sum;
	}

}
