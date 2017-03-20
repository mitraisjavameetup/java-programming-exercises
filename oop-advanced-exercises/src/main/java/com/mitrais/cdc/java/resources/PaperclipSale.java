package com.mitrais.cdc.java.resources;

public class PaperclipSale implements Sellable {

    private final String color;
    private final double boxPrice;
    private final int numBoxes;
	
  public PaperclipSale(String color, double boxPrice, int numBoxes) {
	  this.color = color;
	  this.boxPrice = boxPrice;
	  this.numBoxes = numBoxes;
  }

  //TODO: define getter each attributes/properties

	  /**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @return the boxPrice
	 */
	public double getBoxPrice() {
		return boxPrice;
	}
	/**
	 * @return the numBoxes
	 */
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
	finalCost = getBoxPrice()*getNumBoxes();
	return(finalCost);  	  
  }

  @Override
  public String toString() {
	String toString = "This paperclip  name is "+getColor()+", its price is "+getBoxPrice()+", with number of box "+getCost();
	
	//TODO: modify this method to return sentence e.g. "This paperclip name is blablabla, its price is blabla, with number of box blabla"
	return toString;  
  }
}
