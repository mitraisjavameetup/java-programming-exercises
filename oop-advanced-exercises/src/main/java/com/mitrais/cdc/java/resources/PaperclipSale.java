package com.mitrais.cdc.java.resources;

public class PaperclipSale implements Sellable {

    private String color;
    private double boxPrice;
    private int numBoxes;
	
  public PaperclipSale(String color, double boxPrice, int numBoxes) {
	this.color = color;
	this.boxPrice = boxPrice;
	this.numBoxes = numBoxes;
	
	  
	  //TODO: complete this so it will set the properties when called   

 
  
  }

  //TODO: define getter each attributes/properties

  
  public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public double getBoxPrice() {
	return boxPrice;
}

public void setBoxPrice(double boxPrice) {
	this.boxPrice = boxPrice;
}

public int getNumBoxes() {
	return numBoxes;
}

public void setNumBoxes(int numBoxes) {
	this.numBoxes = numBoxes;
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
	return "PaperclipSale [color=" + color + ", boxPrice=" + boxPrice + ", numBoxes=" + numBoxes + ", getColor()="
			+ getColor() + ", getBoxPrice()=" + getBoxPrice() + ", getNumBoxes()=" + getNumBoxes() + ", getCost()="
			+ getCost() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
			+ super.toString() + "]";
}
}
