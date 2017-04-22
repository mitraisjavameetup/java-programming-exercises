package com.mitrais.cdc.java.resources;

public class PaperclipSale implements Sellable {

    private String color;
    private double boxPrice;
    private int numBoxes;
	
    /** Set the properties when called*/
  public PaperclipSale(String color, double boxPrice, int numBoxes) {
	//TODO: complete this so it will set the properties when called   
	  this.color = color;
	  this.boxPrice = boxPrice; 
	  this.numBoxes = numBoxes;
  
  }
  
  /** Get the color*/
  //TODO: define getter each attributes/properties
  public String getColor() {
	return color;
  }
  
  /** Get the box Price*/
  public double getBoxPrice() {
	return boxPrice;
  }

  /** Get the Number of Boxes*/
  public int getNumBoxes() {
	return numBoxes;
  }  
  
  @Override
  /**
   * Will return cost of the price per box (times) number of boxes
   */
  public double getCost() {
	double finalCost = 0;
		
	//TODO: create calculation to calculate finalCost based on price and number of boxes here
	finalCost = getBoxPrice() * getNumBoxes();
	
	return(finalCost);  	  
  }

  
  /** Print all the variable*/
@Override
  public String toString() {
	String toString = new String();
	
	//TODO: modify this method to return sentence e.g. "This paperclip name is blablabla, its price is blabla, with number of box blabla"
	toString = "This Paperclip color is "+getColor() + ", its price is "+ getBoxPrice() + ", its number of box is "+getNumBoxes()+" and the final cost is "+getCost();
	  
	  
	return toString;  
  }
}
