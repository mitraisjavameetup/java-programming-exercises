package com.mitrais.cdc.java;

public class SquareOperation {
	public int intRandom = 100;
	public double smallest, largest, sum = 0;
	Square[] squares;
	
	public void setRandomSquare(){
		squares = new Square[intRandom];
	    /*TO DO
	     * create looping to stored random using Math.random
	     */
		for (int i = 0; i < intRandom; i++){
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
		smallest = squares[0].getArea();
		
		for (Square s: squares) {
			double currentArea = s.getArea();
			if (currentArea < smallest)
				smallest = currentArea;
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
		largest = squares[0].getArea();
		
		for (Square s: squares) {
			double currentArea = s.getArea();
			if (currentArea > largest)
				largest = currentArea;
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
		for (Square s: squares) {
			sum += s.getArea();
		}
	}
	
	public double getSum(){
		setSum(squares);
		return sum;
	}
}
