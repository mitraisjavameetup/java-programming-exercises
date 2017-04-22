package com.mitrais.cdc.java.resources;
/**
 * 
 * @author Agus Mistiawan
 * @version 1.0.0
 *
 */

public interface Sellable {
  double getCost();
  
  /**
   * Define which item is the cheapest from the items array
   * @param items Object Sellable
   * @return cheapestItem
   */
  public static Sellable cheapest(Sellable[] items) {
    Sellable cheapestItem = null;
    
    //TODO: Create calculation to define which item is the cheapest based on item cost
    double value = Double.MAX_VALUE;
    for(Sellable item : items){
    	if(value > item.getCost())
    		cheapestItem = item;
    }
    return(cheapestItem);
  }
  
  
  /**
   * Calculate total cost of all items in array
   * @param items Object Sellable
   * @return totalCost
   */
  public static double totalCost(Sellable[] items) {
    double total = 0;
    
    //TODO: Create calculation to count the total price here
    for(Sellable item : items){
    	total += item.getCost();
    }
    
    
    return(total);
  }
}
