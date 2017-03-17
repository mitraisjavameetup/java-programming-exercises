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
		Square s1 = new Square();//Calling square constructor without parameter
		s1.setWidth(5);//set width
		System.out.println(s1);
		
		Square s2 = new Square(5);//Calling square constructor with parameter
		System.out.println(s2);
	}
}