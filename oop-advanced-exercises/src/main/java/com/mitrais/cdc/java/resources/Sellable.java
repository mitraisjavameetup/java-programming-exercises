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
    double price = Double.MAX_VALUE;
    //TODO: Create calculation to define which item is the cheapest based on item cost
    for (Sellable entry:items)
    {
    	if (entry.getCost() < price)
    	{
    		price = entry.getCost();
    		cheapestItem = entry;
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
    for (Sellable entry:items)
    {
    	total += entry.getCost();
    }
    
    
    return(total);
  }
}
