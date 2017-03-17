package com.mitrais.cdc.java;

public class RectangleOperation {
	public int intRandom = 100;
	public double sum = 0;
	public double largest = Double.MIN_VALUE;
	public double smallest = Double.MAX_VALUE;
	Rectangle[] rectangles;
	
	public RectangleOperation(){
		setRandomRectangle();
	}
	public void setRandomRectangle(){
		rectangles = new Rectangle[intRandom];
	    /*TO DO
	     * create looping to stored random using Math.random
	     */
		for(int i=0; i<intRandom; i++){
			rectangles[i] = new Rectangle(Math.random(), Math.random());
		}
		
		
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
