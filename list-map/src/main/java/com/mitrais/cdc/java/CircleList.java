package com.mitrais.cdc.java;

import java.util.List;
import java.util.ArrayList;
import com.mitrais.cdc.java.shape.Circle;

public class CircleList {

	public double runCircleList() {
		/*
		 * To-do Make a List of Circle objects. Use a random radius. Keep adding
		 * circles to the list until Math.random() returns less than 0.01. Then,
		 * loop down the list and print out each area. If you do not have a good
		 * Circle class to use, steal mine from the shapes package of the
		 * oop-advanced project.
		 */
		List<Circle> circleList = new ArrayList<>();
		double randomRadius = Math.random();

		while (randomRadius > 0.01) {
			circleList.add(new Circle(randomRadius));
			randomRadius = Math.random();
		}
		
		for (Circle circle : circleList) {
			System.out.println(circle);
		}
		
		if (circleList.size() == 0) {
			return 0;
		} else {
			return circleList.get(circleList.size() - 1).getRadius();
		}
	}
}
