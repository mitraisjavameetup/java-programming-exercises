package com.mitrais.cdc.java;

public class CircleOperation {
	public int intRandom = 100;
	public double largest, sum = 0;
	public double smallest = Double.MAX_VALUE;
	Circle[] circles;
	
	
	
	public CircleOperation() {
		super();
		setRandomCircle();
	}

	public void setRandomCircle(){
		circles = new Circle[intRandom];
			for ( int i=0; i<circles.length; i++) {
				circles[i] = new Circle(Math.random());
				
			}
	    /*TO DO
	     * create looping to stored random using Math.random
	     */
	}
	
	public Circle[] getRandomCircle(){
		
	
		return circles;
	}
	
	public void setSmallest(Circle[] circles){
		
		/*TO DO
		 * Create codes to get the smallest area from circles array
		 */
		for (Circle c : circles){
			 double area = c.getArea();
		      if (area < smallest) {
		        smallest = area;
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
		for (Circle c : circles){
			 double area = c.getArea();
		      if (area > largest) {
		        largest = area;
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
		for (Circle c : circles){
			 double area = c.getArea();
			 sum = sum + area;
	}
		}
	
	public double getSum(){
		setSum(circles);
		return sum;
	}
}
