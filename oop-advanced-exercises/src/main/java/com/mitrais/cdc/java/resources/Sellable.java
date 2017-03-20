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
    double cheapestPrice = Double.MAX_VALUE;
    for(int i=0;i<items.length;i++){
    	double cost = items[i].getCost();
    	if(cost<cheapestPrice){
    		cheapestPrice = cost;
    		cheapestItem = items[i];
    	}
    }
    //TODO: Create calculation to define which item is the cheapest based on item cost
    return(cheapestItem);
  }
  
  
  /**
   * Calculate total cost of all items in array
   * @param items
   * @return totalCost
   */
  public static double totalCost(Sellable[] items) {
    double total = 0;
    for(int i=0;i<items.length;i++){
    	total += items[i].getCost();
    }
    //TODO: Create calculation to count the total price here
    return(total);
  }
}
