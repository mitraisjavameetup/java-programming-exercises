package com.mitrais.cdc.java.resources;

public class PaperclipSale implements Sellable {

    private String color;
    private double boxPrice;
    private int numBoxes;
	
  public PaperclipSale(String color, double boxPrice, int numBoxes) {
	//TODO: complete this so it will set the properties when called   
	  this.color = color;
	  this.boxPrice = boxPrice;
	  this.numBoxes = numBoxes;
  }

  //TODO: define getter each attributes/properties
 

  @Override
  /**
   * Will return cost of the price per box (times) number of boxes
   */
  public double getCost() {
	double finalCost = 0;
		
	//TODO: create calculation to calculate finalCost based on price and number of boxes here
	finalCost = this.numBoxes * this.boxPrice;
	
	return(finalCost);  	  
  }

  public String getColor() {
	return color;
}

public double getBoxPrice() {
	return boxPrice;
}


public int getNumBoxes() {
	return numBoxes;
}


@Override
  public String toString() {
	String toString = new String();
	
	//TODO: modify this method to return sentence e.g. "This paperclip name is blablabla, its price is blabla, with number of box blabla"
	toString = "This paperclip Color is "+getColor()+", its price is "+getBoxPrice()+", with number of box "+getNumBoxes();
	  
	  
	return toString;  
  }
}
