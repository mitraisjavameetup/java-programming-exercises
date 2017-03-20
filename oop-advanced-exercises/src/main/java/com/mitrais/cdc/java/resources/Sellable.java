package com.mitrais.cdc.java.resources;

public interface Sellable {
  double getCost();
  
  /**
   * Define which item is the cheapest from the items array
   * @param items
   * @return cheapestItem
   */
  public static Sellable cheapest(Sellable[] items) {
    double harga = Double.MAX_VALUE;
	  Sellable cheapestItem = null;
  for (int i = 0; i < items.length; i++) {
if (harga>items[i].getCost()) {
	harga=items[i].getCost();
	cheapestItem=items[i];
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
   
    for (int i = 0; i < items.length; i++) {
		total=total+items[i].getCost();
	}
    //TODO: Create calculation to count the total price here
        
    
    return(total);
  }
}
