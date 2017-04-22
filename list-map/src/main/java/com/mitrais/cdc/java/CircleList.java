package com.mitrais.cdc.java;

import java.util.ArrayList;
import java.util.List;
import com.mitrais.cdc.java.shape.Circle;

/**
 * Mitrais Java Training List
 * CircleList class
 * @author Relung Satria
 * @version 1.0
 *
 */

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
		List<Circle> circleList = new ArrayList<Circle>();
		
		double rand = Math.random();
		
		while (rand > 0.01){
			circleList.add(new Circle(rand));
			rand = Math.random();
		}
		for(Circle c: circleList){
			System.out.println(c);
		}
		
		Circle lastCircle = circleList.get(circleList.size() - 1);
		
	    return lastCircle.getArea();
	}
	
}
