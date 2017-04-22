package com.mitrais.cdc.java;

import java.util.ArrayList;
import java.util.List;

import com.mitrais.cdc.java.shape.Circle;

public class CircleList {

	/**
   * Random until Math.random < 0.01 and print each circle area
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
		List<Circle> list = new ArrayList<Circle>();
		double randRadius = Math.random();
		while(randRadius >= 0.01)
		{
			Circle c1 = new Circle(randRadius);
			list.add(c1);
			randRadius  = Math.random();
		}
		int counter = 0;
		for(Circle entry:list)
		{
			System.out.println("Circle area no " + counter +  ": " + entry.getArea());
			counter +=1;
		}
	    return list.get(0).getArea();
	}
	
}
