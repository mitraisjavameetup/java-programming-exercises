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
		double temp=0;
		List<Circle> listCircle= new ArrayList<>();
		Circle circles;
		do
		{
		temp=Math.random();
		//circles=new Circle(temp);
		listCircle.add(new Circle(temp));
		}
		while (temp>0.01);
		
		for (int i=0;i<listCircle.size();i++)
		{
		System.out.println("Area : "+ listCircle.get(i).getArea());
		}
		
		
	    return listCircle.size();
	}
	
}
