package com.mitrais.cdc.java;

public class CircleOperation {
	public int intRandom = 100;
	public double smallest, largest, sum = 0;
	Circle[] circles;

	public void setRandomCircle() {
		circles = new Circle[intRandom];
		for (int i = 0; i < circles.length; i++) {
			circles[i] = new Circle(Math.random());
		}
		/*
		 * TO DO create looping to stored random using Math.random
		 */
	}

	public Circle[] getRandomCircle() {
		setRandomCircle();
		return circles;
	}

	public void setSmallest(Circle[] circles) {
		smallest = circles[0].getArea();
		for (int i = 0; i < circles.length; i++) {
			if (circles[i].getArea() < smallest) {
				smallest = circles[i].getArea();
			}

		}

		/*
		 * TO DO Create codes to get the smallest area from circles array
		 */
	}

	public double getSmallest() {
		setSmallest(circles);
		return smallest;
	}

	public void setLargest(Circle[] circles) {
		largest = circles[0].getArea();
		for (int i = 0; i < circles.length; i++) {
			if (circles[i].getArea() > largest) {
				largest = circles[i].getArea();
			}

		}
		/*
		 * TO DO Create codes to get the largest area from circles array
		 */
	}

	public double getLargest() {
		setLargest(circles);
		return largest;
	}

	public void setSum(Circle[] circles) {
		sum = circles[0].getArea();
		for (int i = 1; i < circles.length; i++) {
			sum = sum + circles[i].getArea();

		}
		/*
		 * TO DO Create codes to get the sum area from circles array
		 */
	}

	public double getSum() {
		setSum(circles);
		return sum;
	}
}
