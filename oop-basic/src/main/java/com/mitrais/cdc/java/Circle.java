package com.mitrais.cdc.java;

public class Circle  {

	//1
	public double radius;

	//2
	public double getArea(){
		return Math.PI*this.radius*this.radius;
	}
	
	//3
	public void setRadius(double r){
		this.radius = r;
	}
	
	//4
	public double getRadius(){
		return this.radius;
	}
	
	//5
	public String toString(){
		return "Radius = " + this.radius;
	}
	
	/*
	 * todo: make a Circle class with various capabilities below:
	 * 1. Give the Circle class a radius field of type double
	 * 2. Give Circle a method that computes the area ((Math.PI)*radius*radius) 
	 * 3. Give Circle a constructor to which you can pass the radius
	 * 4. Have the constructor use the “this” variable
	 * 5. Add a toString method
	 */
	
}