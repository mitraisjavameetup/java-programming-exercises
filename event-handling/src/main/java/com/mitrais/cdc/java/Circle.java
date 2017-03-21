package com.mitrais.cdc.java;

public class Circle {
	private int x, y, d;

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getD() {
		return d;
	}

	public Circle(int x, int y, int d) {
		this.x = x;
		this.y = y;
		this.d = d;
	}

	public boolean isCollide(int corX, int corY){
		double distance = Math.sqrt(Math.pow((x-corX), 2)+Math.pow((y-corY), 2));
		if(distance<=d/2)
			return true;
		else
			return false;
	}
	
	@Override
	public String toString() {
		return "Circle [x=" + x + ", y=" + y + ", d=" + d + "]";
	}
	
}
