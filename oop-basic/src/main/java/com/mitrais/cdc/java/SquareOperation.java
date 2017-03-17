package com.mitrais.cdc.java;

public class SquareOperation {
	public int intRandom = 100;
	public double smallest=Double.MAX_VALUE, largest=Double.MIN_VALUE, sum = 0;
	Square[] squares;
	
	public void setRandomSquare(){
		squares = new Square[intRandom];
	    /*TO DO
	     * create looping to stored random using Math.random
	     */
		for (int i = 0; i < squares.length; i++) {
			double width = Math.random();
			
			squares[i] = new Square(width);
			
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
		double tempSmall;
		
		for (int j = 0; j < squares.length; j++) {
			tempSmall = squares[j].getArea();
			if (tempSmall<this.smallest) {
				this.smallest=tempSmall;
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
		double tempLarge;
		for (int j = 0; j < squares.length; j++) {
			tempLarge = squares[j].getArea();
			if (tempLarge>this.largest) {
				this.largest=tempLarge;
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
		for (int i = 0; i < squares.length; i++) {
			this.sum +=squares[i].getArea();
		}
	}
	
	public double getSum(){
		setSum(squares);
		return sum;
	}
}
