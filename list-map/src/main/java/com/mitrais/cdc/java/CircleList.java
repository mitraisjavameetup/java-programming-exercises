package com.mitrais.cdc.java;

import java.util.ArrayList;
import java.util.List;

import com.mitrais.cdc.java.shape.Circle;

public class CircleList {

	/** Assign circle to circle list with radius = Math.random that more than 0.01*/
	public double runCircleList() {
		/*
		 * To-do
		 * Make a List of Circle objects. 
		 * Use a random radius. 
		 * Keep adding circles to the list until Math.random() returns less than 0.01. 
		 * Then, loop down the list and print out each area. 
		 * If you do not have a good Circle class to use, steal mine from the shapes package of the oop-advanced project.
		 */
		List<Circle> circles = new ArrayList<>();
		double radius = Math.random() ;
		while(radius>=0.01){
			Circle c = new Circle(radius);
			circles.add(c);
			radius = Math.random();
		}
		
		for(Circle c : circles){
			System.out.println(c);
		}
		
	    return circles.size();
	}
	
}
