package com.mitrais.cdc.java;

public class SquareOperation {
	public int intRandom = 100;
	public double smallest = Double.MAX_VALUE, largest = Double.MIN_VALUE, sum = 0;
	Square[] squares;
	
	public SquareOperation() {
		setRandomSquare();
		
	}
	
	public void setRandomSquare(){
		squares = new Square[intRandom];
		for (int i = 0; i < squares.length; i++) {
			squares[i] = new Square();
			squares[i].setWidth(Math.random());
	    }
		
		/*TO DO
	     * create looping to stored random using Math.random
	     */
	}
	
	public Square[] getRandomSquare(){
		setRandomSquare();
		return squares;
	}
	
	public void setSmallest(Square[] squares){
		double tempAreaSmall = 0;
		for (int i = 0; i < squares.length; i++) {
		tempAreaSmall = squares[i].getArea();
		if (tempAreaSmall < this.smallest) {
			this.smallest= tempAreaSmall;
			}
	
		}
		/*TO DO
		 * Create codes to get the smallest area from squares array
		 */
	}
	
	public double getSmallest(){
		setSmallest(squares);
		return smallest;
	}
	
	public void setLargest(Square[] squares){
		double tempAreaLarge = 0;
		for (int i = 0; i < squares.length; i++) {
		tempAreaLarge = squares[i].getArea();
		if (tempAreaLarge > this.largest) {
			this.largest= tempAreaLarge;
			}
		}
		
		/*TO DO
		 * Create codes to get the largest area from squares array
		 */
	}
	
	public double getLargest(){
		setLargest(squares);
		return largest;
	}
	
	public void setSum(Square[] squares){
		for (int i = 0; i < squares.length; i++) {
			this.sum += squares[i].getArea();
		}
		
		/*TO DO
		 * Create codes to get the sum area from squares array
		 */
	}
	
	public double getSum(){
		setSum(squares);
		return sum;
	}
}
