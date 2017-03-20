package com.mitrais.cdc.java;

import java.util.LinkedList;
import java.util.Random;

import com.mitrais.cdc.java.shape.Circle;

public class CircleList {

	public double runCircleList() {
		/*
		 * To-do
		 * Make a List of Circle objects. 
		 * Use a random radius. 
		 * Keep adding circles to the list until Math.random() returns less than 0.01. 
		 * Then, loop down the list and print out each area. 
		 * If you do not have a good Circle class to use, steal mine from the shapes package of the oop-advanced project.
		 */
		Random r = new Random();
		double res = 0;
		LinkedList<Circle> c = new LinkedList<Circle>();
		int index = 0;
	    while (Math.random()>0.01) {
			c.add(index,new Circle(r.nextDouble()));
			index++;
		}
			res = c.pop().getArea();
	    return res;
	}
	
}
