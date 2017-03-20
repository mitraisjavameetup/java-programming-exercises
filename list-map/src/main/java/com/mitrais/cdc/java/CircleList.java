package com.mitrais.cdc.java;

import java.util.ArrayList;

import com.mitrais.cdc.java.shape.Circle;

public class CircleList {
	/**
	 * 
	 * set list of circle with random radius then print each of area of circle
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
		ArrayList<Circle> circles=new ArrayList<Circle>();
		double rnd;
		do{
			rnd=Math.random();
			Circle circle=new Circle(rnd);
			circles.add(circle);
		}while(rnd>=0.01);
		
		circles.forEach(System.out::println);
	    return 0;
	}
	
}
