package com.mitrais.cdc.java.resources;

public class CarSale implements Sellable {

    private final String carName;
    private final double listPrice;
    private final double discount;

  public CarSale(String carName, double listPrice, double discount) {
	//TODO: complete this so it will set the properties when called 
	  this.carName = carName;
	  this.listPrice = listPrice;
	  this.discount = discount;
	 
	  
	  
  }

  //TODO: make sure each attributes/properties has getter/setter

  public String getName() {
	  return carName;
  }
  
  public double getPrice() {
	  return listPrice;
  }
  
  public double getDisc() {
	  return discount;
  }
  
  
  
  
  
  
  @Override
  /** 
   * Will return finalCost based on price - discount percentage
   */
  public double getCost() {
	double finalCost = 0;
	finalCost = this.listPrice - this.listPrice * (this.discount/100);
		
	//TODO: create calculation to calculate finalCost based on price and discount here
      /** The discount in percent. For example, if discount is 5, then the total cost is
       *  0.95 times the list price.
       */
	
	return(finalCost);
  }

  @Override
  public String toString() {
	String toString = new String();
	toString = "This car name is " + this.carName + ", its price is " + this.getCost() + ", with discount " + this.discount;
	
	//TODO: modify this method to return sentence e.g. "This car name is blablabla, its price is blabla, with discount blabla"
	return toString;
  }
}
