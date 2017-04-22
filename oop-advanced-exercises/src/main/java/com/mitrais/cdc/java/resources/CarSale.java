package com.mitrais.cdc.java.resources;

public class CarSale implements Sellable {

    private String carName;
    private double listPrice;
    private double discount;

  public CarSale(String carName, double listPrice, double discount) {
	  this.carName = carName;
	  this.listPrice = listPrice;
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
	finalCost = (100-discount)*listPrice/100;
	
	
	return(finalCost);
  }

  /**
 * @return the carName
 */
public String getCarName() {
	return carName;
}

/**
 * @param carName the carName to set
 */
public void setCarName(String carName) {
	this.carName = carName;
}

/**
 * @return the listPrice
 */
public double getListPrice() {
	return listPrice;
}

/**
 * @param listPrice the listPrice to set
 */
public void setListPrice(double listPrice) {
	this.listPrice = listPrice;
}

/**
 * @return the discount
 */
public double getDiscount() {
	return discount;
}

/**
 * @param discount the discount to set
 */
public void setDiscount(double discount) {
	this.discount = discount;
}

/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "CarSale [carName=" + carName + ", listPrice=" + listPrice + ", discount=" + discount + ", getCost()="
			+ getCost() + ", getCarName()=" + getCarName() + ", getListPrice()=" + getListPrice() + ", getDiscount()="
			+ getDiscount() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
			+ super.toString() + "]";
}
}
