package com.mitrais.cdc.java;

public class CircleOperation {
	public int intRandom = 100;
	public double smallest, largest, sum = 0;
	Circle[] circles;
	
	public void setRandomCircle(){
		circles = new Circle[intRandom];
	    /*TO DO
	     * create looping to stored random using Math.random
	     */
		for(int i=0;i<circles.length;i++){
			circles[i] = new Circle();
			circles[i].setRadius(Math.random());
		}
	}
	
	public Circle[] getRandomCircle(){
		setRandomCircle();
		return circles;
	}
	
	public void setSmallest(Circle[] circles){
		/*TO DO
		 * Create codes to get the smallest area from circles array
		 */
		this.smallest = Double.MAX_VALUE;
		for(Circle c: circles) {
	      double area = c.getArea();
	      if (area < this.smallest) {
	        this.smallest = area;
	      }
		}
	}
	
	public double getSmallest(){
		setSmallest(circles);
		return smallest;
	}
	
	public void setLargest(Circle[] circles){
		/*TO DO
		 * Create codes to get the largest area from circles array
		 */
		this.largest = 0;
		for(Circle c: circles) {
	      double area = c.getArea();
	      if (area > this.largest) {
	        this.largest = area;
	      }
		}
	}
	
	public double getLargest(){
		setLargest(circles);
		return largest;
	}
	
	public void setSum(Circle[] circles){
		/*TO DO
		 * Create codes to get the sum area from circles array
		 */
	    for(Circle c: circles) {
		      double area = c.getArea();
		      this.sum = this.sum + area;
		    }
	}
	
	public double getSum(){
		setSum(circles);
		return sum;
	}
}
