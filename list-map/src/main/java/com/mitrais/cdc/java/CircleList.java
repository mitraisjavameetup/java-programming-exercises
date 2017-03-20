package com.mitrais.cdc.java;
import java.util.*;
import com.mitrais.cdc.java.shape.*;


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
		boolean stop = false;
		List<Circle> circleList = new ArrayList<Circle>();
		while (!stop)
		{
			double radius = Math.random();
			
			if (Math.random() >= 0.01)
			{
				Circle circle = new Circle(radius);
				circleList.add(circle);
			}
			else
				stop = true;
		}
		
		for (Circle circle:circleList)
			System.out.println(circle.getArea());
		
		return circleList.get(0).getArea();
	}
	
}
