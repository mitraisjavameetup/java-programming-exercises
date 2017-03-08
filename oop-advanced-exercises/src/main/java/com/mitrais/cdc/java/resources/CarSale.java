package com.mitrais.cdc.java.resources;

public class CarSale implements Sellable {
  private final String carName;
  private final double listPrice;
  private final double discount;

  public CarSale(String carName, double listPrice, double discount) {
    this.carName = carName;
    this.listPrice = listPrice;
    this.discount = discount;
  }

  public String getCarName() {
    return(carName);
  }

  public double getListPrice() {
    return(listPrice);
  }

  /** The discount in percent. For example, if discount is 5, then the total cost is
   *  0.95 times the list price.
   */
  public double getDiscount() {
    return(discount);
  }

  @Override
  /** 
   * Will return finalCost based on price - discount percentage
   */
  public double getCost() {
	double finalCost = 0;
	
	//create calculation to calculate finalCost based on price and discount here
	
	
	
	
	return(finalCost);
  }

  @Override
  public String toString() {
    return("CarSale: " + carName + " with list price of $" + listPrice 
           + " and discount of " + discount + "%.");
  }
}
