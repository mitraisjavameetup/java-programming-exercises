package com.mitrais.cdc.java;

public class CircleOperation {
	
	public int intRandom = 100; 
	public double smallest = Double.MAX_VALUE, largest = Double.MIN_VALUE, sum = 0;
	Circle[] circles;
	
	public CircleOperation() {
		setRandomCircle();
	}
	
	public void setRandomCircle(){
		circles = new Circle[intRandom];
		for (int i = 0; i < circles.length; i++) {
			circles[i] = new Circle();
			circles[i].setRadius(Math.random());
	    }
		
		/*TO DO
	     * create looping to stored random using Math.random
	     */
	}
	
	public Circle[] getRandomCircle(){
		setRandomCircle();
		return circles;
	}
	
	public void setSmallest(Circle[] circles){
		double tempAreaSmall = 0;
		for (int i = 0; i < circles.length; i++) {
		tempAreaSmall = circles[i].getArea();
		if (tempAreaSmall < this.smallest) {
			this.smallest= tempAreaSmall;
			}
	
		}
		
		
		/*TO DO
		 * Create codes to get the smallest area from circles array
		 */
	    	
	}

		
	public double getSmallest(){
		setSmallest(circles);
		return smallest;
	}
	
	public void setLargest(Circle[] circles){
		double tempAreaLarge = 0;
		for (int i = 0; i < circles.length; i++) {
		tempAreaLarge = circles[i].getArea();
		if (tempAreaLarge > this.largest) {
			this.largest= tempAreaLarge;
			}
		}
		/*TO DO
		 * Create codes to get the largest area from circles array
		 */
	}
	
	public double getLargest(){
		setLargest(circles);
		return largest;
	}
	
	public void setSum(Circle[] circles){
		for (int i = 0; i < circles.length; i++) {
			this.sum += circles[i].getArea();
		}
		/*TO DO
		 * Create codes to get the sum area from circles array
		 */
	}
	
	public double getSum(){
		setSum(circles);
		return sum;
	}
}
