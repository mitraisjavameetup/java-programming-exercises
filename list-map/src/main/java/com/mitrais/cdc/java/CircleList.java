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
		double val = 0;
		double temp = 0;
		List<Circle> listCircle = new ArrayList<>();
		while (true) {
			temp = Math.random();
			if(temp > 0.01) { val = temp; } else { break; }
			listCircle.add(new Circle(val));
		} 
		
		for (Circle c : listCircle) {
			System.out.println(c.getArea());
		}
		
	    return val;
	}
	
	public static void main(String[] args) {
		new CircleList().runCircleList();
	}
	
}
