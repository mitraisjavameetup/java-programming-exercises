package com.mitrais.cdc.java;

public class SquareOperation {
	public int intRandom = 100;
	public double smallest, largest, sum = 0;
	Square[] squares;
	
	public SquareOperation(){
		super();
		setRandomSquare();
		setSmallest(squares);
		setLargest(squares);
		setSum(squares);
	}
	
	public void setRandomSquare(){
		squares = new Square[intRandom];
		for (int i = 0; i < squares.length; i++)
			squares[i] = new Square(Math.random());
	    /*TO DO
	     * create looping to stored random using Math.random
	     */
	}
	
	public Square[] getRandomSquare(){
		return squares;
	}
	
	public void setSmallest(Square[] squares){
		double smallest = Integer.MAX_VALUE;
		for (int i = 0; i < squares.length; i++) {
			if(squares[i].getArea() < smallest){
				this.smallest = smallest = squares[i].getArea();
			}
		}
		/*TO DO
		 * Create codes to get the smallest area from squares array
		 */
	}
	
	public double getSmallest(){
		
		return smallest;
	}
	
	public void setLargest(Square[] squares){
		double largest = Integer.MIN_VALUE;
		for (int i = 0; i < squares.length; i++) {
			if(squares[i].getArea() > largest){
				this.largest = largest = squares[i].getArea();
			}
		}
		/*TO DO
		 * Create codes to get the largest area from squares array
		 */
	}
	
	public double getLargest(){
		
		return largest;
	}
	
	public void setSum(Square[] squares){
		double sum = 0;
		for (int i = 0; i < squares.length; i++) {
			sum = sum + squares[i].getArea();
			this.sum = sum;
		}
	}
	
	public double getSum(){
		
		return sum;
	}
}
