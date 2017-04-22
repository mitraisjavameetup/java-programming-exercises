package com.mitrais.cdc.java;

public class SquareOperation {
	public int intRandom = 100;
	public double smallest, largest, sum = 0;
	Square[] squares;
	
	public void setRandomSquare() {
		squares = new Square[intRandom];
		for (int i = 0; i < squares.length; i++) {
			squares[i] = new Square(Math.random());
		}
		/*
		 * TO DO create looping to stored random using Math.random
		 */
	}

	public Square[] getRandomSquare() {
		setRandomSquare();
		return squares;
	}

	public void setSmallest(Square[] squares) {
		smallest = squares[0].getArea();
		for (int i = 0; i < squares.length; i++) {
			if (squares[i].getArea() < smallest) {
				smallest = squares[i].getArea();
			}

		}

		/*
		 * TO DO Create codes to get the smallest area from squares array
		 */
	}

	public double getSmallest() {
		setSmallest(squares);
		return smallest;
	}

	public void setLargest(Square[] squares) {
		largest = squares[0].getArea();
		for (int i = 0; i < squares.length; i++) {
			if (squares[i].getArea() > largest) {
				largest = squares[i].getArea();
			}

		}
		/*
		 * TO DO Create codes to get the largest area from squares array
		 */
	}

	public double getLargest() {
		setLargest(squares);
		return largest;
	}

	public void setSum(Square[] squares) {
		sum = squares[0].getArea();
		for (int i = 1; i < squares.length; i++) {
			sum = sum + squares[i].getArea();

		}
		/*
		 * TO DO Create codes to get the sum area from squares array
		 */
	}

	public double getSum() {
		setSum(squares);
		return sum;
	}
}
