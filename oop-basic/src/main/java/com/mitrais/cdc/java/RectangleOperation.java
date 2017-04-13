package com.mitrais.cdc.java;

public class RectangleOperation {
	public int intRandom = 100;
	public double smallest = Double.MAX_VALUE, largest = Double.MIN_VALUE, sum = 0;
	Rectangle[] rectangles;
	
	public RectangleOperation() {
		setRandomRectangle();
	}
	
	public void setRandomRectangle(){
		rectangles = new Rectangle[intRandom];
		for (int i = 0; i < rectangles.length; i++) {
			rectangles[i] =  new Rectangle();
			rectangles[i].setHeight(Math.random());
			rectangles[i].setWidth(Math.random());
			
		}
	
		
		/*TO DO
	     * create looping to stored random using Math.random
	     */
	}
	
	public Rectangle[] getRandomRectangle(){
		setRandomRectangle();
		return rectangles;
	}
	
	public void setSmallest(Rectangle[] rectangles){
		double tempAreaSmall = 0;
		for (int i = 0; i < rectangles.length; i++) {
		tempAreaSmall = rectangles[i].getArea();
		if (tempAreaSmall < this.smallest) {
			this.smallest= tempAreaSmall;
			}
		}
		/*TO DO
		 * Create codes to get the smallest area from squares array
		 */
	}
	
	public double getSmallest(){
		setSmallest(rectangles);
		return smallest;
	}
	
	public void setLargest(Rectangle[] rectangles){
		double tempAreaLarge = 0;
		for (int i = 0; i < rectangles.length; i++) {
		tempAreaLarge = rectangles[i].getArea();
		if (tempAreaLarge > this.largest) {
			this.largest= tempAreaLarge;
			}
		}
		
		/*TO DO
		 * Create codes to get the largest area from squares array
		 */
	}
	
	public double getLargest(){
		setLargest(rectangles);
		return largest;
	}
	
	public void setSum(Rectangle[] rectangles){
		for (int i = 0; i < rectangles.length; i++) {
			this.sum += rectangles[i].getArea();
		}
		
		/*TO DO
		 * Create codes to get the sum area from squares array
		 */
	}
	
	public double getSum(){
		setSum(rectangles);
		return sum;
	}

}
