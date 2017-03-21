package com.mitrais.cdc.java;

public class Circle {
	private int x,y,d,r;

	public Circle(int x, int y, int d) {
		super();
		this.x = x;
		this.y = y;
		this.d = d;
		this.r = this.d/2;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getD() {
		return d;
	}

	public int getR(){
		return r;
	}
	
	public boolean inCircle(int x1, int y1){
		double s = Math.sqrt(Math.pow((this.x-x1), 2) + Math.pow((this.y-y1), 2));
		if(s<this.getR()) return true;
		else return false;
	}
	
}
