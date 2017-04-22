package com.mitrais.cdc.java;

public class RectangleOperation {
	public int intRandom = 100;
	public double smallest=Double.MAX_VALUE, largest=Double.MIN_VALUE, sum = 0;
	Rectangle[] rectangles;
	
	public void setRandomRectangle(){
		rectangles = new Rectangle[intRandom];
	    /*TO DO
	     * create looping to stored random using Math.random
	     */
		for (int i = 0; i < rectangles.length; i++) {
			double width = Math.random();
			double height=Math.random();
			rectangles[i] = new Rectangle(width,height);
			
		}
	}
	
	public Rectangle[] getRandomRectangle(){
		setRandomRectangle();
		return rectangles;
	}
	
	public void setSmallest(Rectangle[] rectangles){
		/*TO DO
		 * Create codes to get the smallest area from squares array
		 */
		double tempSmall;
		
		for (int j = 0; j < rectangles.length; j++) {
			tempSmall = rectangles[j].getArea();
			if (tempSmall<this.smallest) {
				this.smallest=tempSmall;
			}
		}
		
	}
	
	public double getSmallest(){
		setSmallest(rectangles);
		return smallest;
	}
	
	public void setLargest(Rectangle[] rectangles){
		/*TO DO
		 * Create codes to get the largest area from squares array
		 */
		double tempLarge;
		
		for (int j = 0; j < rectangles.length; j++) {
			tempLarge = rectangles[j].getArea();
			if (tempLarge>this.largest) {
				this.largest=tempLarge;
			}
		}
	}
	
	public double getLargest(){
		setLargest(rectangles);
		return largest;
	}
	
	public void setSum(Rectangle[] rectangles){
		/*TO DO
		 * Create codes to get the sum area from squares array
		 */
		for (int i = 0; i < rectangles.length; i++) {
			this.sum +=rectangles[i].getArea();
		}
	}
	
	public double getSum(){
		setSum(rectangles);
		return sum;
	}

}
