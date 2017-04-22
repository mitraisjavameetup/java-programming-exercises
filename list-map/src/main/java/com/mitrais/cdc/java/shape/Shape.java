package com.mitrais.cdc.java.shape;

public interface Shape {
	public double getArea();
	
	public static double sumAreas(Shape[] shapes) {
		double sum = 0;
	    for(Shape s: shapes) {
	      sum = sum + s.getArea();
	    }
	    return(sum);
	}
}
