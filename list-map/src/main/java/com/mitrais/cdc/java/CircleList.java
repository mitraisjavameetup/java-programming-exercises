package com.mitrais.cdc.java;

import java.util.ArrayList;
import java.util.List;

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
		List<Circle> list = new ArrayList<>();
		double rr = Math.random();
		while (rr > 0.01) {
			Circle circle = new Circle(rr);
			circle.setRadius(rr);
			list.add(circle);
			rr = Math.random();
		}

		if(list.size() == 0) return 0; else return list.get(list.size()-1).getRadius();
	}
	
}
