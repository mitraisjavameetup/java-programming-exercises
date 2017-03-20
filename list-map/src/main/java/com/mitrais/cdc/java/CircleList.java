package com.mitrais.cdc.java;
import java.util.LinkedList;

import com.mitrais.cdc.java.shape.Circle;




public class CircleList {

	public double runCircleList() {

		LinkedList<Circle> cl = new LinkedList<Circle>();
	
		while(Math.random() > 0.01){
			
			
			double x = Math.random();
			cl.add(new Circle(x));
			System.out.println(x);
			
		}
	
		return cl.size();
	}
	}

	
	
	
		
		/*
		 * To-do
		 * Make a List of Circle objects. 
		 * Use a random radius. 
		 * Keep adding circles to the list until Math.random() returns less than 0.01. 
		 * Then, loop down the list and print out each area. 
		 * If you do not have a good Circle class to use, steal mine from the shapes package of the oop-advanced project.
		 */
	    //return 0;
	

