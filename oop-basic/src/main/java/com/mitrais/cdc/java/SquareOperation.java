package com.mitrais.cdc.java;

public class SquareOperation {
	public int intRandom = 100;
	public double smallest, largest, sum = 0;
	Square[] squares;
	
	SquareOperation(){
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
		for(int i=0;i<squares.length;i++){
			squares[i]=new Square(Math.random());
		}
	}
	
	public Square[] getRandomSquare(){
		return squares;
	}
	
	public void setSmallest(Square[] squares){
		/*TO DO
		 * Create codes to get the smallest area from squares array
		 */
		double max=Integer.MAX_VALUE;
		for(int i=0;i<squares.length;i++){
			double area=squares[i].getArea();
			if(max>area)max=area;
		}
		smallest=max;
	}
	
	public double getSmallest(){
		
		return smallest;
	}
	
	public void setLargest(Square[] squares){
		/*TO DO
		 * Create codes to get the largest area from squares array
		 */
		double min=Integer.MIN_VALUE;
		for(int i=0;i<squares.length;i++){
			double area=squares[i].getArea();
			if(min<area)min=area;
		}
		largest=min;
	}
	
	public double getLargest(){
		
		return largest;
	}
	
	public void setSum(Square[] squares){
		/*TO DO
		 * Create codes to get the sum area from squares array
		 */
		for(int i=0;i<squares.length;i++){
			sum=sum+squares[i].getArea();
			
		}
	}
	
	public double getSum(){
		
		return sum;
	}
}
