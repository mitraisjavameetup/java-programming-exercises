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

  /** Function to get color of the paper clip **/
  //TODO: define getter each attributes/properties
  public String getColor() {
	  return color;
  }

  /** Function to set color of paper clip **/
  public void setColor(String color) {
	  this.color = color;
  }

  /** Function to return the price of each box paper clip **/
  public double getBoxPrice() {
	  return boxPrice;
  }

  /** Function to set the price of each box paper clip **/
  public void setBoxPrice(double boxPrice) {
	  this.boxPrice = boxPrice;
  }

  /** Function to return the number of boxes **/
  public int getNumBoxes() {
	  return numBoxes;
  }

  /** Function to set number of boxes **/
  public void setNumBoxes(int numBoxes) {
	  this.numBoxes = numBoxes;
  }

  @Override
  /**
   * Will return cost of the price per box (times) number of boxes
   */
  public double getCost() {
	double finalCost = 0;
		
	//TODO: create calculation to calculate finalCost based on price and number of boxes here
	finalCost = boxPrice * numBoxes;
	return(finalCost);  	  
  }

  /** Function to print all information of the paper clip **/
@Override
  public String toString() {
	String toString = new String();
	
	//TODO: modify this method to return sentence e.g. "This paperclip name is blablabla, its price is blabla, with number of box blabla"
	toString = "This paperclip name is "+ color +", its price is "+ boxPrice +", with number of box " + numBoxes +" the final cost is " + getCost();
	  
	  
	return toString;  
  }
}
