package com.mitrais.cdc.java;


public class CircleOperation {
	public int intRandom = 100;
	public double smallest, largest, sum = 0;
	Circle[] circles;
	
	public CircleOperation() {
		super();
		setRandomCircle();
		setSmallest(circles);
		setLargest(circles);
		setSum(circles);
	}

	public void setRandomCircle(){
		circles = new Circle[intRandom];
	    /*TO DO
	     * create looping to stored random using Math.random
	     */
		for(int i = 0 ;i<circles.length ; i++){
			circles[i] = new Circle(Math.random());
		}
	}
	
	public Circle[] getRandomCircle(){
		return circles;
	}
	
	public void setSmallest(Circle[] circles){
		/*TO DO
		 * Create codes to get the smallest area from circles array
		 */
		 smallest = Double.MAX_VALUE;
		 for(Circle c: circles) {
		      double area = c.getArea();
		      if (area < smallest) {
		        smallest = area;
		      }
		 }
		
	}
	
	public double getSmallest(){
		
		return smallest;
	}
	
	public void setLargest(Circle[] circles){
		/*TO DO
		 * Create codes to get the largest area from circles array
		 */
		largest = 0;
		 for(Circle c: circles) {
		      double area = c.getArea();
		      if (area > largest) {
		        largest = area;
		      }
		 }
		
		
	}
	
	public double getLargest(){
		
		return largest;
	}
	
	public void setSum(Circle[] circles){
		/*TO DO
		 * Create codes to get the sum area from circles array
		 */
		for(int i = 0;i<circles.length;i++){
			this.sum+=circles[i].area;
		}
	}
	
	public double getSum(){
		
		return sum;
	}
}
