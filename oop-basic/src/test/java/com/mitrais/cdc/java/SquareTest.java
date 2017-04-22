package com.mitrais.cdc.java;

import static org.junit.Assert.*;

import org.junit.Test;

public class SquareTest {

	@Test
	public void test() {
		SquareOperation squareOp = new SquareOperation();
	    Square[] squares = squareOp.getRandomSquare();

	    double minArea = Double.MAX_VALUE;
	    double maxArea = 0;
	    double sum = 0;
	    for(Square s: squares) {
	      double area = s.getArea();
	      if (area < minArea) {
	        minArea = area;
	      }
	      if (area > maxArea) {
	        maxArea = area;
	      }
	      sum = sum + area;
	    }
		
	    assertEquals((Double) minArea, (Double)squareOp.getSmallest());
	    assertEquals((Double) maxArea, (Double)squareOp.getLargest());
	    assertEquals((Double) sum, (Double)squareOp.getSum());
	}

}
