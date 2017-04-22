package com.mitrais.cdc.java.resources;

public interface Sellable {
	double getCost();

	/**
	 * Define which item is the cheapest from the items array
	 * 
	 * @param items
	 * @return cheapestItem
	 */
	public static Sellable cheapest(Sellable[] items) {
		Sellable cheapestItem = null;
		// TODO: Create calculation to define which item is the cheapest based
		// on item cost
		double cheap = Double.MAX_VALUE;
		for (int j = 0; j < items.length; j++) {
			double temp = items[j].getCost();
			if (temp < cheap) {
				cheapestItem = items[j];
				cheap = temp;
			}
		}
		return (cheapestItem);
	}

	/**
	 * Calculate total cost of all items in array
	 * 
	 * @param items
	 * @return totalCost
	 */
	public static double totalCost(Sellable[] items) {
		double total = 0;
		for (int j = 0; j < items.length; j++) {
			total+=items[j].getCost();
		}

		return (total);
	}
}
