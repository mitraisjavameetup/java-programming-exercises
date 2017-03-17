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
		for(int i=0;i<rectangles.length;i++){
			rectangles[i] = new Rectangle();
			rectangles[i].setRect(Math.random(), Math.random());
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
		this.smallest = Double.MAX_VALUE;
		for(Rectangle r: rectangles) {
	      double area = r.getArea();
	      if (area < this.smallest) {
	        this.smallest = area;
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
		this.largest = 0;
		for(Rectangle r: rectangles) {
	      double area = r.getArea();
	      if (area > this.largest) {
	        this.largest = area;
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
	    for(Rectangle r: rectangles) {
		      double area = r.getArea();
		      this.sum = this.sum + area;
		    }
	}
	
	public double getSum(){
		setSum(rectangles);
		return sum;
	}

}
