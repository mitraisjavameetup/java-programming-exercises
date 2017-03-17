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
		for (int i = 0; i < intRandom; i++){
			rectangles[i] = new Rectangle(Math.random(), Math.random());
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
		
		for (Rectangle r: rectangles) {
			double currentArea = r.getArea();
			if (currentArea < smallest)
				smallest = currentArea;
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
		
		for (Rectangle r: rectangles) {
			double currentArea = r.getArea();
			if (currentArea > largest)
				largest = currentArea;
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
		for (Rectangle r: rectangles) {
			sum += r.getArea();
		}
	}
	
	public double getSum(){
		setSum(rectangles);
		return sum;
	}

}
