package com.mitrais.cdc.java.resources;

public class CarSale implements Sellable {
  //TODO: define attributes/properties based on question

  public CarSale(String carName, double listPrice, double discount) {
	//TODO: complete this so it will set the properties when called 
	  
	  
	  
  }

  //TODO: define getter each attributes/properties 

  
  
  
  
  
  @Override
  /** 
   * Will return finalCost based on price - discount percentage
   */
  public double getCost() {
	double finalCost = 0;
	
	//TODO: create calculation to calculate finalCost based on price and discount here
	
	
	
	
	return(finalCost);
  }

  @Override
  public String toString() {
	String toString = new String();
	
	//TODO: modify this method to return sentence e.g. "This car name is blablabla, its price is blabla, with discount blabla"
	
	
	
	return toString;
  }
}
