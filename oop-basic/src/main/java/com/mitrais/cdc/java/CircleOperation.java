package com.mitrais.cdc.java;

public class CircleOperation {
	public int intRandom = 100;
	public double smallest = Double.MAX_VALUE, largest=Double.MIN_VALUE, sum = 0;
	Circle[] circles;
	
	public void setRandomCircle(){
		circles = new Circle[intRandom];
	    /*TO DO
	     * create looping to stored random using Math.random
	     */
		for (int i = 0; i < circles.length; i++) {
			double rad=Math.random();
			circles[i] = new Circle(rad);
//			circles[i].setRadius(Math.random());
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
		double tempSmall;
		
		for (int j = 0; j < circles.length; j++) {
			tempSmall = circles[j].getArea();
			if (tempSmall<this.smallest) {
				this.smallest=tempSmall;
				
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
		double tempLarge;
		
		for (int j = 0; j < circles.length; j++) {
			tempLarge = circles[j].getArea();
			if (tempLarge>this.largest) {
				this.largest=tempLarge;
				
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
		for (int i = 0; i < circles.length; i++) {
			this.sum +=circles[i].getArea();
		}
	}
	
	public double getSum(){
		setSum(circles);
		return sum;
	}
}
