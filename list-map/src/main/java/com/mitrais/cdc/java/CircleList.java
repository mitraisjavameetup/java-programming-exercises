package com.mitrais.cdc.java;

import java.util.ArrayList;

public class CircleList {
	class Circle{
		private double radius;
		private double area;

		public double getArea() {
			area = Math.PI*this.radius*this.radius;
			return area; 	
		}

		public Circle(double r) {
			this.radius = r;
		}
		
		public Circle(){
			
		}

		public String toString() {
			return "Circle (Radius = " + radius +", area=" + area+")";
		}
	}

	public double runCircleList() {
		/*
		 * To-do
		 * Make a List of Circle objects. 
		 * Use a random radius. 
		 * Keep adding circles to the list until Math.random() returns less than 0.01. 
		 * Then, loop down the list and print out each area. 
		 * If you do not have a good Circle class to use, steal mine from the shapes package of the oop-advanced project.
		 */
		ArrayList<Circle> list = new ArrayList<Circle>();
		double i=0;
		double r;
		do {
			r=Math.random();
			list.add(new Circle(r));
			System.out.println(r);
			i=Math.random();
		} while (i>0.01);
		
		
		
	    return list.size();
	}
	
}
