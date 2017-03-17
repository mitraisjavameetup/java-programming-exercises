package com.mitrais.cdc.java;

public class RectangleOperation {
	public int intRandom = 100;
	public double smallest, largest, sum = 0;
	Rectangle[] rectangles;

	public void setRandomRectangle() {
		rectangles = new Rectangle[intRandom];
		for (int i = 0; i < rectangles.length; i++) {
			rectangles[i] = new Rectangle(Math.random(), Math.random());
		}
		/*
		 * TO DO create looping to stored random using Math.random
		 */
	}

	public Rectangle[] getRandomRectangle() {
		setRandomRectangle();
		return rectangles;
	}

	public void setSmallest(Rectangle[] rectangles) {
		smallest = rectangles[0].getArea();
		for (int i = 0; i < rectangles.length; i++) {
			if (rectangles[i].getArea() < smallest) {
				smallest = rectangles[i].getArea();
			}
		}
		/*
		 * TO DO Create codes to get the smallest area from squares array
		 */
	}

	public double getSmallest() {
		setSmallest(rectangles);

		return smallest;
	}

	public void setLargest(Rectangle[] rectangles) {
		largest = rectangles[0].getArea();
		for (int i = 0; i < rectangles.length; i++) {
			if (rectangles[i].getArea() > largest) {
				largest = rectangles[i].getArea();
			}
		}
		/*
		 * TO DO Create codes to get the largest area from squares array
		 */
	}

	public double getLargest() {
		setLargest(rectangles);
		return largest;
	}

	public void setSum(Rectangle[] rectangles) {
		sum = rectangles[0].getArea();
		for (int i = 0; i < rectangles.length; i++) {
			sum = sum + rectangles[i].getArea();
		}
		/*
		 * TO DO Create codes to get the sum area from squares array
		 */
	}

	public double getSum() {
		setSum(rectangles);
		return sum;
	}

}
