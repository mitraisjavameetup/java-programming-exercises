package com.mitrais.cdc.java;

public class Circle {
	private int x,y,r=40;
	public Circle(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getR() {
		return r;
	}
	public boolean insideCircle(int x2, int y2){
		if(Math.sqrt(Math.pow((x2-x),2)+ Math.pow((y2-y),2)) <= r){
			return true;
		}
		else{
			return false;
		}
	}
}
