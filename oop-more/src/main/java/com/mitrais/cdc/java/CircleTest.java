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
	  Circle c1 = new Circle(20.5);//Calling circle class with radius parameter
	  System.out.println(c1);
	  
	  Circle c2 = new Circle();//Calling circle class without radius parameter
	  c2.setRadius(20.5);//set radius variable
	  System.out.println(c2);
  }
}