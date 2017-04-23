package com.mitrais.cdc.java.resources;

public class CarSale implements Sellable {

	private final String carName;
	private final double listPrice;
	private final double discount;
	
	/**
	 * @param carName
	 * @param listPrice
	 * @param discount
	 */
	public CarSale(String carName, double listPrice, double discount) {
		super();
		this.carName = carName;
		this.listPrice = listPrice;
		this.discount = discount;
	}

	// TODO: make sure each attributes/properties has getter/setter

	@Override
	/**
	 * Will return finalCost based on price - discount percentage
	 */
	public double getCost() {
		double finalCost = 0;

		// TODO: create calculation to calculate finalCost based on price and
		// discount here
		/**
		 * The discount in percent. For example, if discount is 5, then the
		 * total cost is 0.95 times the list price.
		 */
		
		finalCost = this.listPrice * (100.0 - this.discount) / 100;

		return finalCost;
	}

	/**
	 * @return the carName
	 */
	public String getCarName() {
		return carName;
	}

	/**
	 * @return the listPrice
	 */
	public double getListPrice() {
		return listPrice;
	}

	/**
	 * @return the discount
	 */
	public double getDiscount() {
		return discount;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CarSale [This car name is " + carName + ", Initial Price is " + listPrice + ", Discount is " + discount + ", Paid Price is " + getCost() + "]";
	}
	
}
