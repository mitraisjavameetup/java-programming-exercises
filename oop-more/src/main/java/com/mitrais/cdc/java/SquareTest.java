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
	public static void main(String[] args) {
		Square s1 = new Square(10);
		System.out.println(s1);
		Square s2 = new Square();
		s2.setWidth(5);
		System.out.println(s2);
	}
}