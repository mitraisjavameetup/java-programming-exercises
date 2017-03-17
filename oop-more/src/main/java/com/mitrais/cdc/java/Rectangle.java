package com.mitrais.cdc.java;

public class Rectangle {
	private double width, height;

	/** Calculate Area of Rectangle */
	public double getArea(){
		return this.width * this.height;
	}
	
	/** Get width of the Rectangle */
	public double getWidth() {
		return width;
	}
	
	/** Set width of the Rectangle */
	public void setWidth(double width) {
		this.width = width;
	}

	/** Get height of the Rectangle */
	public double getHeight() {
		return height;
	}

	/** Set width of the Rectangle */
	public void setHeight(double height) {
		this.height = height;
	}
		
	/** Return all variables of the Rectangle */
	@Override
	public String toString(){
		return "width = " + this.width + " and height = " + this.height + ", area = " + getArea();	
	}
	
	/** Constructor Rectangle*/
	public Rectangle(double width, double height){
		this.width = width;
		this.height = height;
	}
	
	/** Constructor Rectangle*/
	public Rectangle(){
		width = Math.random();
		height = Math.random();
	}
}