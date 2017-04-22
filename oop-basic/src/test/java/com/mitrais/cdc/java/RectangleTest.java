package com.mitrais.cdc.java;

import static org.junit.Assert.*;

import org.junit.Test;

public class RectangleTest {

	@Test
	public void test() {
		RectangleOperation rectOp = new RectangleOperation();
	    Rectangle[] rectangles = rectOp.getRandomRectangle();

	    double minArea = Double.MAX_VALUE;
	    double maxArea = 0;
	    double sum = 0;
	    for(Rectangle r: rectangles) {
	      double area = r.getArea();
	      if (area < minArea) {
	        minArea = area;
	      }
	      if (area > maxArea) {
	        maxArea = area;
	      }
	      sum = sum + area;
	    }
		
	    assertEquals((Double) minArea, (Double)rectOp.getSmallest());
	    assertEquals((Double) maxArea, (Double)rectOp.getLargest());
	    assertEquals((Double) sum, (Double)rectOp.getSum());
	}

}
