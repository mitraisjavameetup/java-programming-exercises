package com.mitrais.cdc.java;

public class RectangleOperation {
	public int intRandom = 100;
	public double smallest, largest, sum = 0;
	Rectangle[] rectangles;
	
	public void setRandomRectangle(){
	    /*TO DO
	     * create looping to stored random using Math.random
	     */
		rectangles = new Rectangle[intRandom];
		for (int i = 0; i < intRandom; i++) {
			rectangles[i] = new Rectangle(Math.random() * 10, Math.random() * 10);
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
		smallest = rectangles[0].getArea();
		for (int i = 1; i < intRandom; i++) {
			if (rectangles[i].getArea() < smallest) {
				smallest = rectangles[i].getArea();
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
		largest = rectangles[0].getArea();
		for (int i = 1; i < intRandom; i++) {
			if (rectangles[i].getArea() > largest) {
				largest = rectangles[i].getArea();
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
		for (int i = 0; i < intRandom; i++) {
			sum += rectangles[i].getArea();
		}
	}
	
	public double getSum(){
		setSum(rectangles);
		return sum;
	}

}
