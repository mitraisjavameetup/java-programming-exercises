package com.mitrais.cdc.java;

public class Circle {
	
	private double radius;

	/**Get radius of the Circle*/
	public double getRadius() {
		return radius;
	}

	/**Set radius of the Circle*/
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	/**print the instance on the Circle Class*/
	@Override
	public String toString(){
		return "radius = " + this.radius + ", area = "+ this.getArea();
	}

	/**Constructor Circle*/
	public Circle(double radius){
		this.radius = radius; 
	}
	
	/**Constructor Circle*/
	public Circle(){
		radius = Math.random();
	}
	
	/**Calculate Area */
	public double getArea(){
		return Math.PI * this.radius * this.radius;
	}
}