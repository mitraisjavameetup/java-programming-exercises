package com.mitrais.cdc.java;

public class CircleOperation {
	public int intRandom = 100;
	public double smallest, largest, sum = 0;
	Circle[] circles;
	
	CircleOperation()
	{
		
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
		for (int i=0;i<intRandom;i++)
		{
			double temp=Math.random();
			circles[i]=new Circle(temp);
		}
	}
	
	public Circle[] getRandomCircle(){
		return circles;
	}
	
	public void setSmallest(Circle[] circles){
		/*TO DO
		 * Create codes to get the smallest area from circles array
		 */
		smallest=Double.MAX_VALUE;
		
		for (int i=0;i<intRandom;i++)
		{
			if (circles[i].getArea()<smallest)
			{
				smallest=circles[i].getArea();
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
		
		
		for (int i=0;i<intRandom;i++)
		{
			if (circles[i].getArea()>largest)
			{
				largest=circles[i].getArea();
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
		
		for (int i=0;i<intRandom;i++)
		{
			sum=sum+circles[i].getArea();
		}
	}
	
	public double getSum(){
		
		return sum;
	}
}
