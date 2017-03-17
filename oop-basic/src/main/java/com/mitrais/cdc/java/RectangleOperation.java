package com.mitrais.cdc.java;

public class RectangleOperation {
	public int intRandom = 100;
	public double smallest, largest, sum = 0;
	Rectangle[] rectangles;
	
	public RectangleOperation(){
		setRandomRectangle();
		setLargest(rectangles);
		setSmallest(rectangles);
		setSum(rectangles);
	}
	public void setRandomRectangle(){
		rectangles = new Rectangle[intRandom];
	    /*TO DO
	     * create looping to stored random using Math.random
	     */
		for(int i = 0; i<intRandom; i++){
			rectangles[i] = new Rectangle(Math.random(),Math.random());			
		}
	}
	
	public Rectangle[] getRandomRectangle(){
		return rectangles;
	}
	
	public void setSmallest(Rectangle[] rectangles){
		/*TO DO
		 * Create codes to get the smallest area from squares array
		 */
		smallest = Double.MAX_VALUE;
		for(Rectangle rectangle : rectangles){
			if(smallest > rectangle.getArea())
				smallest = rectangle.getArea();
		}
	}
	
	public double getSmallest(){
		
		return smallest;
	}
	
	public void setLargest(Rectangle[] rectangles){
		/*TO DO
		 * Create codes to get the largest area from squares array
		 */
		largest = Double.MIN_VALUE;
		for(Rectangle rectangle : rectangles){
			if(largest < rectangle.getArea())
				largest = rectangle.getArea();
		}
	}
	
	public double getLargest(){
		
		return largest;
	}
	
	public void setSum(Rectangle[] rectangles){
		/*TO DO
		 * Create codes to get the sum area from squares array
		 */
		
		for(Rectangle rectangle : rectangles){
			sum += rectangle.getArea();
		}
	}
	
	public double getSum(){
		
		return sum;
	}

}
