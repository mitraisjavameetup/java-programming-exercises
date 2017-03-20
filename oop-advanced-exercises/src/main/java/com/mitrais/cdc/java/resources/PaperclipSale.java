package com.mitrais.cdc.java.resources;
/**
 * 
 * @author Agus Mistiawan
 * @version 1.0.0
 *
 */
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

  @Override
  /**
   * Will return cost of the price per box (times) number of boxes
   */
  public double getCost() {
	double finalCost = 0;
	finalCost = boxPrice * numBoxes;
	return(finalCost);  	  
  }
  /**
   *  will return type of color
   *  @return color
   */
  public String getColor() {
	return color;
  }
  
  /**
   * Will return Price per box
   * @return boxPrice
   */

  public double getBoxPrice() {
	return boxPrice;
  }	
  /**
   * Will return number of boxes
   * @return numBoxes
   */
  public int getNumBoxes() {
	return numBoxes;
}

  /**
   * Will return String of value the instance
   */
@Override
  public String toString() {
	String toString = new String();
	//TODO: modify this method to return sentence e.g. "This paperclip name is blablabla, its price is blabla, with number of box blabla"
	System.out.println("This paperclip name is "+color+", its price is "+boxPrice+", with number of box "+numBoxes);
	return toString;  
  }
}
