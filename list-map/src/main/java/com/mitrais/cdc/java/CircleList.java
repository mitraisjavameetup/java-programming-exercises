package com.mitrais.cdc.java;

import java.util.ArrayList;
import java.util.List;

import com.mitrais.cdc.java.shape.Circle;

/**
 * List of Circle objects
 * @author Egi
 * @version 1.0
 */
public class CircleList {

	private double radius = 0;
	
	/**
	 * CircleList class constructor
	 */
	public CircleList() {
		this.radius = Math.random();
	}
	
	/**
	 * Method for make list of circle object with random radius
	 * @return this.radius
	 */
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
		
		do {
			Circle c = new Circle(this.radius);
			
			circles.add(c);
			
			return this.radius;
			
		} while (this.radius > 0.01);
	}
	
}
