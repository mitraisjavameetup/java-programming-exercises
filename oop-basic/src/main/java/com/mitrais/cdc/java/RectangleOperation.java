package com.mitrais.cdc.java;

public class RectangleOperation {
	public int intRandom = 100;
	public double smallest, largest, sum = 0;
	Rectangle[] rectangles;
	
	
	
	public RectangleOperation() {
		super();
		setRandomRectangle();
		setSmallest(rectangles);
		setLargest(rectangles);
		setSum(rectangles);
	}

	public void setRandomRectangle(){
		rectangles = new Rectangle[intRandom];
	    /*TO DO
	     * create looping to stored random using Math.random
	     */
		for(int i=0;i<rectangles.length;i++){
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
		smallest = Double.MAX_VALUE;
		for(int i=0;i<rectangles.length;i++){
			if(rectangles[i].getArea() < smallest){
				smallest = rectangles[i].getArea();
			}
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
		for(int i=0;i<rectangles.length;i++){
			if(rectangles[i].getArea() > largest){
				largest = rectangles[i].getArea();
			}
		}
	}
	
	public double getLargest(){
		
		return largest;
	}
	
	public void setSum(Rectangle[] rectangles){
		/*TO DO
		 * Create codes to get the sum area from squares array
		 */
		for(int i=0;i<rectangles.length;i++){
			sum += rectangles[i].getArea();
		}
	}
	
	public double getSum(){
		
		return sum;
	}

}
