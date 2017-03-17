package com.mitrais.cdc.java;
import java.lang.reflect.Array;

public class CircleOperation {
	public int intRandom = 100;
	public double smallest, largest, sum = 0;
	Circle[] circles;
	public int a=0,b=0;
	
	CircleOperation(){
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
		
		for(int i=0;i<circles.length;i++){
			double math=Math.random();
			circles[i]=new Circle(math);
			
		}
	}
	
	public Circle[] getRandomCircle(){
		return circles;
	}
	
	public void setSmallest(Circle[] circles){
		/*TO DO
		 * Create codes to get the smallest area from circles array
		 */
		double max=Integer.MAX_VALUE;
		for(int i=0;i<circles.length;i++){
			double area=circles[i].getArea();
			if(area<max)max=area;
		}
		smallest=max;
	}
	
	public double getSmallest(){
		
		return smallest;
	}
	
	public void setLargest(Circle[] circles){
		/*TO DO
		 * Create codes to get the largest area from circles array
		 */
		double min=Integer.MIN_VALUE;
		for(int i=0;i<circles.length;i++){
			double area=circles[i].getArea();
			if(area>min)min=area;
		}
		largest=min;
	}
	
	public double getLargest(){
		
		return largest;
	}
	
	public void setSum(Circle[] circles){
		/*TO DO
		 * Create codes to get the sum area from circles array
		 */
		for(int i=0;i<circles.length;i++){
			sum=sum+circles[i].getArea();
			
		}
	}
	
	public double getSum(){
		
		return sum;
	}
}
