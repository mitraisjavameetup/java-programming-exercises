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
		for(int i=0;i<squares.length;i++){
			squares[i] = new Square();
			squares[i].setWidth(Math.random());
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
		this.smallest = Double.MAX_VALUE;
		for(Square s: squares) {
	      double area = s.getArea();
	      if (area < this.smallest) {
	        this.smallest = area;
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
		this.largest = 0;
		for(Square s: squares) {
	      double area = s.getArea();
	      if (area > this.largest) {
	        this.largest = area;
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
	    for(Square s: squares) {
		      double area = s.getArea();
		      this.sum = this.sum + area;
		    }
	}
	
	public double getSum(){
		setSum(squares);
		return sum;
	}
}
