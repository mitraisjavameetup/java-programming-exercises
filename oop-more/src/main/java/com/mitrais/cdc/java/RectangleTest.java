package com.mitrais.cdc.java;

/** 
 * TO DO:
 * run the Rectangle class
 * try to generate 1 Rectangle
 * and print out the return of toString method
 * but you don't explicitly call toString method in your code
 * HINT: use override when you declare toString method on Rectangle.java
 */

public class RectangleTest {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();//Calling Rectangle Constructor without parameter
		r1.setWidth(5);//set widht
		r1.setHeight(12);//set height
		System.out.println(r1);
		
		Rectangle r2 = new Rectangle(5, 12);//Calling rectangle constructor with parameter
		System.out.println(r2);
	}
}