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
    
    //Create calculation to define which item is the cheapest based on item cost
    
    
    
    return(cheapestItem);
  }
  
  
  /**
   * Calculate total cost of all items in array
   * @param items
   * @return totalCost
   */
  public static double totalCost(Sellable[] items) {
    double total = 0;
    
    //Create calculation to count the total price here
    
    
    
    return(total);
  }
}
