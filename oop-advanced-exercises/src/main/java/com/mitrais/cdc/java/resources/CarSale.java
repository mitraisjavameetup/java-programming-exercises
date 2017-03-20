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
  /** Function to return car name **/
  public String getCarName() {
	  return carName;
  }

  /** Function to return list price of the car **/
  public double getListPrice() {
	  return listPrice;
  }
  /** Function to return the discount of the car **/
  public double getDiscount() {
	  return discount;
  }
  
  
  
  @Override
  /** 
   * Will return finalCost based on price - discount percentage
   */
  public double getCost() {
	double finalCost = 0;
	finalCost = (1-(discount/100))*listPrice;
	//TODO: create calculation to calculate finalCost based on price and discount here
      /** The discount in percent. For example, if discount is 5, then the total cost is
       *  0.95 times the list price.
       */
	
	
	
	return(finalCost);
  }



  /** Function to print all information about car **/
@Override
  public String toString() {
	String toString = new String();
	
	//TODO: modify this method to return sentence e.g. "This car name is blablabla, its price is blabla, with discount blabla"
	toString = "This car name is "+ carName +", its price is "+ listPrice +", with discount " + discount +"% final cost is " + getCost();
	
	
	return toString;
  }
}
