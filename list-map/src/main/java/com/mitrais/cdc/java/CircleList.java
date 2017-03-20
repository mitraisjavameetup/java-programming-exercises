package com.mitrais.cdc.java;

import java.util.ArrayList;
import java.util.List;

import com.mitrais.cdc.java.shape.Circle;

public class CircleList {
public static void main(String[] args) {
	new CircleList().runCircleList();
}
	public double runCircleList() {
		/*
		 * To-do Make a List of Circle objects. Use a random radius. Keep adding
		 * circles to the list until Math.random() returns less than 0.01. Then,
		 * loop down the list and print out each area. If you do not have a good
		 * Circle class to use, steal mine from the shapes package of the
		 * oop-advanced project.
		 */
		List<Circle> listcircle = new ArrayList<>();
		double x = Math.random();
		while (x > 0.01) {
			listcircle.add(new Circle(x));
			x = Math.random();
			
		}
		for (Circle circle : listcircle) {
			System.out.println("Area of the Circle is:"+circle.getArea());
		}
		return listcircle.size();
	}

}
