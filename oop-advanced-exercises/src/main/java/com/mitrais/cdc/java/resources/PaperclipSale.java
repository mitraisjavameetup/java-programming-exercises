package com.mitrais.cdc.java.resources;

/**
 * PaperclipSale class to represent the sale of a set of boxes of certain types of paper clips
 * @author Egi
 * @version 1.0
 **/
public class PaperclipSale implements Sellable {

    private String color;
    private double boxPrice;
    private int numBoxes;
  
  /**
   * PaperclipSale class constructor
   **/
  public PaperclipSale(String color, double boxPrice, int numBoxes) {
	//TODO: complete this so it will set the properties when called   
	this.color = color;
	this.boxPrice = boxPrice;
	this.numBoxes = numBoxes;
  }

  //TODO: define getter each attributes/properties
  /**
   * Will return the color of the clips
   **/
  public String getColor() {
	return color;
  }

  /**
   * Will set the color of the clips
   **/
  public void setColor(String color) {
	this.color = color;
  }

  /**
   * Will return the price of the clips per box
   **/
  public double getBoxPrice() {
	return boxPrice;
  }

  /**
   * Will set the price of the clips per box
   **/
  public void setBoxPrice(double boxPrice) {
	this.boxPrice = boxPrice;
  }

  /**
   * Will return the boxes of the clips being sold
   **/
  public int getNumBoxes() {
	return numBoxes;
  }

  /**
   * Will set the boxes of the clips being sold
   **/
  public void setNumBoxes(int numBoxes) {
	this.numBoxes = numBoxes;
  }

@Override
  /**
   * Will return cost of the price per box (times) number of boxes
   **/
  public double getCost() {
	double finalCost = 0;
		
	//TODO: create calculation to calculate finalCost based on price and number of boxes here
	finalCost = this.numBoxes * this.boxPrice;
	
	return(finalCost);  	  
  }

  @Override
  /**
   * Will return information of the clips
   **/
  public String toString() {
	String toString = new String();
	
	//TODO: modify this method to return sentence e.g. "This paperclip name is blablabla, its price is blabla, with number of box blabla"
	toString = "This paper clip color is " + this.color + ", it's price is " + this.boxPrice + ", with number of box being sold is " + this.numBoxes + ".";
	  
	return toString;  
  }
}
