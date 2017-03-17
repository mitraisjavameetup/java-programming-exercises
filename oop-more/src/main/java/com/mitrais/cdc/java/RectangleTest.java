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
	    /*TO DO
	     * create looping to stored random using Math.random
	     */
		Rectangle r = new Rectangle();
		r.setHeight(0.5);
		r.setWidth(0.8);
		r.toString();
	}
}