package com.mitrais.cdc.java;

public class CircleOperation {
	public int intRandom = 100;
	public double sum = 0;
	public double largest = Double.MIN_VALUE;
	public double smallest = Double.MAX_VALUE;
	Circle[] circles;
	
	public CircleOperation(){
		setRandomCircle();
	}
	
	public void setRandomCircle(){
		circles = new Circle[intRandom];
	    /*TO DO
	     * create looping to stored random using Math.random
	     */
		for(int i=0; i<intRandom; i++){
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
		for(int i=0; i<intRandom; i++){
			double tempArea = circles[i].getArea(); 
			if(tempArea<this.smallest){
				this.smallest = tempArea;
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
		for(int i=0; i<intRandom; i++){
			double tempArea = circles[i].getArea(); 
			if(tempArea>this.largest){
				this.largest = tempArea;
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
		for(int i=0; i<intRandom; i++){
			double tempArea = circles[i].getArea(); 
			this.sum= this.sum+tempArea;
		}
	}
	
	public double getSum(){
		setSum(circles);
		return sum;
	}
}
