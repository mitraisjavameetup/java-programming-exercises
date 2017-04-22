package com.mitrais.cdc.java;

/** 
 * TO DO:
 * run the Square class
 * try to generate 1 Square
 * and print out the return of toString method
 * but you don't explicitly call toString method in your code
 * HINT: use override when you declare toString method on Square.java
 */

public class SquareTest {
	/**
	 * Simple test for checking Square running well
	 * Using Constructor with value
	 * @param args
	 */
	public static void main(String[] args) {
		Square square = new Square(10);
		System.out.println(square);
	}
}