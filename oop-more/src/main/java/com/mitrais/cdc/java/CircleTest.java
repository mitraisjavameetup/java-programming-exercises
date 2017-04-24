package com.mitrais.cdc.java;

/** 
 * TO DO:
 * run the Circle class
 * try to generate 1 Circle
 * and print out the return of toString method
 * but you don't explicitly call toString method in your code
 * HINT: use override when you declare toString method on Circle.java
 */

public class CircleTest {
  public static void main(String[] args) {
	  double area=0;
	  Circle circles= new Circle();
	  circles.setRadius(3);
	  System.out.println(circles);
  }
}