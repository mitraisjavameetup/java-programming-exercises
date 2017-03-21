package com.mitrais.cdc.java;

public class Circle {
	private int radius;
	private int x,y;
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public Circle(int x,int y,int radius)
	{
		this.x=x;
		this.y=y;
		this.radius=radius;
	}
	
}
