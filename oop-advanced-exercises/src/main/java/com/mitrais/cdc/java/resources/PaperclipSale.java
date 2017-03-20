package com.mitrais.cdc.java.resources;

public class PaperclipSale implements Sellable {

	private String color;
	private double boxPrice;
	private int numBoxes;	

	/**
	 * @param color
	 * @param boxPrice
	 * @param numBoxes
	 */
	public PaperclipSale(String color, double boxPrice, int numBoxes) {
		super();
		this.color = color;
		this.boxPrice = boxPrice;
		this.numBoxes = numBoxes;
	}

	// TODO: define getter each attributes/properties
	

	@Override
	/**
	 * Will return cost of the price per box (times) number of boxes
	 */
	public double getCost() {
		double finalCost = 0;

		// TODO: create calculation to calculate finalCost based on price and
		// number of boxes here
		finalCost = this.boxPrice * this.numBoxes;

		return finalCost;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the boxPrice
	 */
	public double getBoxPrice() {
		return boxPrice;
	}

	/**
	 * @param boxPrice the boxPrice to set
	 */
	public void setBoxPrice(double boxPrice) {
		this.boxPrice = boxPrice;
	}

	/**
	 * @return the numBoxes
	 */
	public int getNumBoxes() {
		return numBoxes;
	}

	/**
	 * @param numBoxes the numBoxes to set
	 */
	public void setNumBoxes(int numBoxes) {
		this.numBoxes = numBoxes;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PaperclipSale [This color is " + color + ", Box Price is " + boxPrice + ", Number of Boxes is " + numBoxes + ", Cost is " + getCost() + "]";
	}

	
}
