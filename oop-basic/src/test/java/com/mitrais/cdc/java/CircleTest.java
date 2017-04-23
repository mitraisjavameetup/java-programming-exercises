package com.mitrais.cdc.java;

import static org.junit.Assert.*;

import org.junit.Test;

public class CircleTest {

	@Test
	public void test() {
	//public static void main(String[] args) {
		CircleOperation circleOp = new CircleOperation();
	    Circle[] circles = circleOp.getRandomCircle();

	    double minArea = Double.MAX_VALUE;
	    double maxArea = 0;
	    double sum = 0;
	    for(Circle c: circles) {
	      double area = c.getArea();
	      if (area < minArea) {
	        minArea = area;
	      }
	      if (area > maxArea) {
	        maxArea = area;
	      }
	      sum = sum + area;
	    }
		
	    assertEquals((Double) minArea, (Double)circleOp.getSmallest());
	    assertEquals((Double) maxArea, (Double)circleOp.getLargest());
	    assertEquals((Double) sum, (Double)circleOp.getSum());
	    //assertEquals((Double) 1.0, (Double)circleOp.getSum());
	}

}
