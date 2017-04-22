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
  public String getColor(){
	  return color;
  }
  
  public double getBoxPrice(){
	  return boxPrice;
  }
  
  public int getNumBoxes(){
	  return numBoxes;
  }
  
  @Override
  /**
   * Will return cost of the price per box (times) number of boxes
   */
  public double getCost() {
	double finalCost = 0;
	finalCost = numBoxes * boxPrice;
	//TODO: create calculation to calculate finalCost based on price and number of boxes here

	
	
	
	
	return(finalCost);  	  
  }

  @Override
  public String toString() {
	String toString = new String();
	toString = "This paperclip color is " + getColor() + ", its price is " + getBoxPrice() + ", with number of box " + getNumBoxes();
	//TODO: modify this method to return sentence e.g. "This paperclip name is blablabla, its price is blabla, with number of box blabla"
	
	  
	  
	return toString;  
  }
}
