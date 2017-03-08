package com.mitrais.cdc.java.resources;

public class PaperclipSale implements Sellable {
  private String color;
  private double boxPrice;
  private int numBoxes;

  public PaperclipSale(String color, double boxPrice, int numBoxes) {
    this.color = color;
    this.boxPrice = boxPrice;
    this.numBoxes = numBoxes;
  }

  public String getColor() {
    return(color);
  }

  public double getBoxPrice() {
    return(boxPrice);
  }


  public int getNumBoxes() {
    return(numBoxes);
  }


  @Override
  /**
   * Will return cost of the price per box (times) number of boxes
   */
  public double getCost() {
	double finalCost = 0;
		
	//create calculation to calculate finalCost based on price and number of boxes here
	//finalCost = boxPrice * numBoxes;
		
	return(finalCost);  	  
  }

  @Override
  public String toString() {
    return("PaperclipSale: " + numBoxes + " boxes of " + color + " clips at $" + boxPrice + "/box.");
  }
}
