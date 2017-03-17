package com.mitrais.cdc.java;

public class Square extends Rectangle{

	private double width;

	/** Get the width of the Square*/
	public double getWidth() {
		return width;
	}

	/** Set the width of the Square*/
	public void setWidth(double width) {
		this.width = width;
	}
	
	/** Calculate the Area of Square*/
	@Override
	public double getArea(){
		return this.width * this.width;
	}
	
	/** Return all variables from Square Class*/
	@Override
	public String toString(){
		return "width/height = " + this.width + ", area = " + getArea();
	}
	
	/** Constructor Square*/
	public Square(double width){
		this.width = width; 
	}
	
	/** Constructor Square*/
	public Square(){
		width = Math.random();
	}
}