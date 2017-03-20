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
		double rad = 0.0, tmp = 0.0;
		while(true){
			tmp = Math.random();
			if(tmp > 0.01){
				rad = tmp;
			}else{
				break;
			}
			list.add(new Circle(rad));
		}
		
		for (Circle circle : list) {
			System.out.println("Area = "+circle.getArea());
		}
	    return rad;
	}
	
}
