package com.mitrais.cdc.java.resources;

/**
 * Sellable interface for CarSale and PaperclipSale class
 * @author Egi
 * @version 1.0
 **/
public interface Sellable {
  double getCost();
  
  /**
   * Define which item is the cheapest from the items array
   * @param items
   * @return cheapestItem
   */
  public static Sellable cheapest(Sellable[] items) {
    Sellable cheapestItem = null;
    
    //TODO: Create calculation to define which item is the cheapest based on item cost
    cheapestItem = items[0];
    for (Sellable item: items) {
		if (item.getCost() < cheapestItem.getCost()) {
			cheapestItem = item;
		}
	}
    
    return(cheapestItem);
  }
  
  
  /**
   * Calculate total cost of all items in array
   * @param items
   * @return totalCost
   */
  public static double totalCost(Sellable[] items) {
    double total = 0;
    
    //TODO: Create calculation to count the total price here
    for (Sellable item: items) {
    	total = total + item.getCost();
    }
    
    return(total);
  }
}
