package com.mitrais.cdc.java;

import java.util.ArrayList;
import java.util.List;

import com.mitrais.cdc.java.shape.Circle;

public class CircleList {

	/** funtion to run circle test **/
	public double runCircleList() {
		/*
		 * To-do
		 * Make a List of Circle objects. 
		 * Use a random radius. 
		 * Keep adding circles to the list until Math.random() returns less than 0.01. 
		 * Then, loop down the list and print out each area. 
		 * If you do not have a good Circle class to use, steal mine from the shapes package of the oop-advanced project.
		 */
		List<Circle> circles = new ArrayList<Circle>();
		double radius = Math.random();
		while(radius >= 0.1){
			Circle c = new Circle(radius);
			radius = Math.random();
			circles.add(c);
		}
		for(Circle c:circles){
			System.out.println(c);
		}
	    return circles.size();
	}
	
}
