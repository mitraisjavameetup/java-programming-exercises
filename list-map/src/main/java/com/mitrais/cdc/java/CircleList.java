package com.mitrais.cdc.java;

import java.util.*;

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
		List<Circle> cr = new ArrayList<>();
		double temp = 0;
		do{
			temp = Math.random();
			cr.add(new Circle(temp));
		}while(temp>=0.01);
		
		
		for(int i=0; i<cr.size(); i++){
			System.out.println(cr.get(i).getArea());
		}
	    return cr.size();
	}
	
}
