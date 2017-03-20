package com.mitrais.cdc.java.resources;

/**
 * CarSale class to represent the sale of a car
 **/
public class CarSale implements Sellable {

    private final String carName;
    private final double listPrice;
    private final double discount;
  
  /**
   * CarSale class constructor
   **/
  public CarSale(String carName, double listPrice, double discount) {
	this.carName = carName;
	this.listPrice = listPrice;
	this.discount = discount;
  }

  //TODO: make sure each attributes/properties has getter/setter
  /**
   * Will return the name of the car
   **/
  public String getCarName() {
	return carName;
  }
  
  /**
   * Will return the price of the car
   **/
  public double getListPrice() {
	return listPrice;
  }
  
  /**
   * Will return the discount of the car
   **/
  public double getDiscount() {
	return discount;
  }

@Override
  /** 
   * Will return finalCost based on price - discount percentage
   */
  public double getCost() {
	double finalCost = 0;
	
	//TODO: create calculation to calculate finalCost based on price and discount here
    finalCost = this.listPrice - ((this.discount / 100) * this.listPrice);
    
	return(finalCost);
  }

  @Override
  /** 
   * Will return the information of the car.
   */
  public String toString() {
	String toString = new String();
	
	//TODO: modify this method to return sentence e.g. "This car name is blablabla, its price is blabla, with discount blabla"
	toString = "This car name is " + this.carName + ", it's price is " + this.listPrice + ", with discount of " + this.discount + "%.";
	
	return toString;
  }
}
