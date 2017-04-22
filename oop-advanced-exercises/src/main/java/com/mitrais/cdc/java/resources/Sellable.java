package com.mitrais.cdc.java.resources;

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
    double min = items[0].getCost();
    for (Sellable sellable : items) {
		if(min > sellable.getCost()){
			min = sellable.getCost();
			cheapestItem = sellable;
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
    for (int i = 0; i < items.length; i++) {
		total += items[i].getCost();
	}
    
    
    return(total);
  }
}
