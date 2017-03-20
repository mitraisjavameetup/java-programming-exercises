package com.mitrais.cdc.java.resources;

/**
 * Sellable class for Mitrais Java Training
 * @author Relung Satria
 * @version 1.0
 */

public interface Sellable {
  double getCost();
  
  /**
   * Define which item is the cheapest from the items array
   * @param items
   * @return cheapestItem
   */
  public static Sellable cheapest(Sellable[] items) {
    Sellable cheapestItem = items[0];
    
    //TODO: Create calculation to define which item is the cheapest based on item cost
    for(Sellable i: items){
    	if(i.getCost() < cheapestItem.getCost())
    		cheapestItem = i;
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
    for(Sellable i: items){
    	total += i.getCost();
    }
    return(total);
  }
}
