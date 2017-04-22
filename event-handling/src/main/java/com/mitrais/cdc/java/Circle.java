package com.mitrais.cdc.java;
/**
 *
 * @author Agus Mistiawan
 * Circle class
 *
 */

public class Circle  {

	private int radius;
	private int X;
	private int Y;
	public double getArea(){
		return Math.PI*radius*radius;
	}
	public Circle(int radius){
		this.radius = radius;
	}

	@Override
	public String toString(){
		return "radius=" + radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public int getX() {
		return X;
	}
	public void setX(int x) {
		X = x;
	}
	public int getY() {
		return Y;
	}
	public void setY(int y) {
		Y = y;
	}
	public boolean getDistance(int x2, int y2) {
		int distance;
		distance = (int) Math.sqrt(Math.pow((x2-X), 2) + Math.pow((y2-Y), 2));
		if(distance<=radius && x2>=X && y2>=Y)
			return true;
		else
			return false;
	}
	
}