package com.mitrais.cdc.java;

public class SquareOperation {
	public int intRandom = 100;
	public double largest, sum = 0;
	public double smallest = Double.MAX_VALUE;
	Square[] squares;
	
	public void setRandomSquare(){
		squares = new Square[intRandom];
	    /*TO DO
	     * create looping to stored random using Math.random
	     */
		squares = new Square[intRandom];
		for ( int i=0; i<squares.length; i++) {
			squares[i] = new Square(Math.random());
		}
	}
	
	public Square[] getRandomSquare(){
		setRandomSquare();
		return squares;
	}
	
	public void setSmallest(Square[] squares){
		/*TO DO
		 * Create codes to get the smallest area from squares array
		 */
		for(Square s: squares) {
		      double area = s.getArea();
		      if (area < smallest) {
		        smallest = area;
		      }
		}
	}
	
	public double getSmallest(){
		setSmallest(squares);
		return smallest;
	}
	
	public void setLargest(Square[] squares){
		/*TO DO
		 * Create codes to get the largest area from squares array
		 */
		for(Square s: squares) {
		      double area = s.getArea();
		      if (area > largest) {
		        largest = area;
		      }
		}
	}
	
	public double getLargest(){
		setLargest(squares);
		return largest;
	}
	
	public void setSum(Square[] squares){
		/*TO DO
		 * Create codes to get the sum area from squares array
		 */
	}
	
	public double getSum(){
		for(Square s: squares){
			double area = s.getArea();
			sum = sum + area;
		}
		
		return sum;
	}
}
