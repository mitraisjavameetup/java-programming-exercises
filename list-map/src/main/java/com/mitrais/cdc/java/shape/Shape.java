package com.mitrais.cdc.java.shape;

/**
 * Mitrais Java Training List
 * Shape class
 * @author mitrais
 * @version 1.1
 *
 */

public abstract class Shape {
	abstract double getArea();
	
	public static double sumAreas(Shape[] shapes) {
		double sum = 0;
	    for(Shape s: shapes) {
	      sum = sum + s.getArea();
	    }
	    return(sum);
	}
}
