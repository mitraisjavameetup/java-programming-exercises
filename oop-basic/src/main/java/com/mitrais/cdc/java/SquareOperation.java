package com.mitrais.cdc.java;

public class SquareOperation {
	public int intRandom = 100;
	public double sum = 0;
	public double largest = Double.MIN_VALUE;
	public double smallest = Double.MAX_VALUE;
	Square[] squares;
	
	public SquareOperation() {
		setRandomSquare();
		setSmallest(squares);
		setLargest(squares);
		setSum(squares);
	}
	
	public void setRandomSquare(){
		squares = new Square[intRandom];
	    /*TO DO
	     * create looping to stored random using Math.random
	     */
		for(int i=0; i<intRandom; i++){
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
		for(int i=0; i<intRandom; i++){
			double tempArea = squares[i].getArea(); 
			if(tempArea<this.smallest){
				this.smallest = tempArea;
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
		for(int i=0; i<intRandom; i++){
			double tempArea = squares[i].getArea(); 
			if(tempArea>this.largest){
				this.largest = tempArea;
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
		for(int i=0; i<intRandom; i++){
			double tempArea = squares[i].getArea(); 
			this.sum= this.sum+tempArea;
		}
	}
	
	public double getSum(){
		
		return sum;
	}
}
