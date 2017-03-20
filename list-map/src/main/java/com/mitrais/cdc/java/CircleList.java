package com.mitrais.cdc.java;
import java.util.LinkedList;
import java.util.List;
import com.mitrais.cdc.java.shape.Circle;

/**
 * 
 * @author Agus Mistiawan
 *
 */

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
		double r;
		List<Circle> circle = new LinkedList<Circle>();
		do{
			r = Math.random();
			Circle c = new Circle(r);
			circle.add(c);
		}while(r>0.01);
		
		for(Circle c : circle){
			System.out.println(c.getArea());
		}
	    return circle.size();
	}
	
	public static void main(String[] args) {
		CircleList list = new CircleList();
		list.runCircleList();
	}
	
}
