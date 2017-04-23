package com.mitrais.cdc.java;

public class RectangleOperation {
	public int intRandom = 100;
	public double smallest, largest, sum = 0;
	Rectangle[] rectangles;
	
	public RectangleOperation() {
		// TODO Auto-generated constructor stub
		super();
		this.smallest = Integer.MAX_VALUE;
		this.largest = Integer.MIN_VALUE;
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
		for (int i = 0; i < rectangles.length; i++) {
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
		for (Rectangle e : rectangles) {
			if (e.getArea() < this.smallest) { this.smallest = e.getArea(); }
		}
	}
	
	public double getSmallest(){
		
		return smallest;
	}
	
	public void setLargest(Rectangle[] rectangles){
		/*TO DO
		 * Create codes to get the largest area from squares array
		 */
		for (Rectangle e : rectangles) {
			if (e.getArea() > this.largest) { this.largest = e.getArea(); }
		}
	}
	
	public double getLargest(){
		
		return largest;
	}
	
	public void setSum(Rectangle[] rectangles){
		/*TO DO
		 * Create codes to get the sum area from squares array
		 */
		for (Rectangle r : rectangles) {
			sum+=r.getArea();
		}
	}
	
	public double getSum(){
		
		return sum;
	}

}
