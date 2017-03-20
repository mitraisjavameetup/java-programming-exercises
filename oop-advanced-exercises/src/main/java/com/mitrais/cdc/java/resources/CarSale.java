package com.mitrais.cdc.java.resources;

public class CarSale implements Sellable {

    private String carName;
    private double listPrice;
    private double discount;

  public CarSale(String carName, double listPrice, double discount) {
	//TODO: complete this so it will set the properties when called 
	  this.carName = carName;
	  this.listPrice = listPrice;
	  this.discount = discount;
  }

  //TODO: make sure each attributes/properties has getter/setter
  public String getCarName(){
	  return carName;
  }
  
  public void setCarName(String carName){
	  this.carName = carName;
  }
  
  public double getListPrice(){
	  return listPrice;
  }
  
  public void setListPrice(double listPrice){
	  this.listPrice = listPrice;
  }
  
  public double getDiscount(){
	  return discount;
  }
  
  public void setDiscount(double discount){
	  this.discount = discount;
  }
  
  @Override
  /** 
   * Will return finalCost based on price - discount percentage
   */
  public double getCost() {
	double finalCost = 0;
	
	//TODO: create calculation to calculate finalCost based on price and discount here
      /** The discount in percent. For example, if discount is 5, then the total cost is
       *  0.95 times the list price.
       */
	double pricePercentage = 1 - (discount/100);
	finalCost = listPrice * pricePercentage;

	return(finalCost);
  }

  @Override
  public String toString() {
	String toString = new String();
	
	//TODO: modify this method to return sentence e.g. "This car name is blablabla, its price is blabla, with discount blabla"
	toString = "This car name is " + carName + ", its price is " + listPrice + ", with discount " + discount;
	
	
	return toString;
  }
}
