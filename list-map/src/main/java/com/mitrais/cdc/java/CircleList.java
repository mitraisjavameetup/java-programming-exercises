package com.mitrais.cdc.java;

import java.util.ArrayList;
import java.util.List;

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
		
		double radius = 0.5;
		List<Circle> myList = new ArrayList<>();
		
		while(radius > 0.01){
			myList.add(new Circle(radius));
			radius = Math.random();
		}
		
		for(Circle c : myList)
			System.out.println("The Radius Of Cirlce is "+c.getRadius()+", And its Area is "+c.getArea());
		return radius;
	}
	
}
