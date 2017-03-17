package com.mitrais.cdc.java;

public class SquareOperation {
	public int intRandom = 100;
	public double smallest, largest, sum = 0;
	Square[] squares;
	
	public SquareOperation() {
		super();
		setRandomSquare();
		setSmallest(squares);
		setSmallest(squares);
		setLargest(squares);
		setSum(squares);
	}
	public void setRandomSquare(){
		squares = new Square[intRandom];
	    /*TO DO
	     * create looping to stored random using Math.random
	     */
		for(int i = 0 ;i<squares.length ; i++){
			squares[i] = new Square(Math.random());
		}
	}
	
	public Square[] getRandomSquare(){
		return squares;
	}
	
	public void setSmallest(Square[] squares){
		/*TO DO
		 * Create codes to get the smallest area from squares array
		 */
		smallest = Double.MAX_VALUE;
		 for(Square c: squares) {
		      double area = c.getArea();
		      if (area < smallest) {
		        smallest = area;
		      }
		 }
	}
	
	public double getSmallest(){
		
		return smallest;
	}
	
	public void setLargest(Square[] squares){
		/*TO DO
		 * Create codes to get the largest area from squares array
		 */
		largest = 0;
		 for(Square c: squares) {
		      double area = c.getArea();
		      if (area > largest) {
		        largest = area;
		      }
		 }
	}
	
	public double getLargest(){
		
		return largest;
	}
	
	public void setSum(Square[] squares){
		/*TO DO
		 * Create codes to get the sum area from squares array
		 */
		for(int i = 0;i<squares.length;i++){
			this.sum+=squares[i].area;
		}
	}
	
	public double getSum(){
		
		return sum;
	}
}
