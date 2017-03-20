package com.mitrais.cdc.java.three;

import java.util.List;

public class TwoItems<T> {
	//TODO: define two generic type here 
	private T item1, item2;
	
	//TODO: define parameterized constructor here
	 /** Constructor*/
	public TwoItems(T item1, T item2){
		this.item1 = item1;
		this.item2 = item2;
	}
	
	 /** Get item1*/
	//TODO: define getter for those two items defined above
	public T getItem1() {
		return item1;
	}
	/** Set item1*/
	public void setItem1(T item1) {
		this.item1 = item1;
	}
	
	/** Get item2*/
	public T getItem2() {
		return item2;
	}

	/** Set item2*/
	public void setItem2(T item2) {
		this.item2 = item2;
	}
	
	//TODO: override toString method here
	/** Return to String item1 and item2*/
	@Override
	public String toString(){
		String returnString = new String();		
		returnString = String.format(" %s and %s", getItem1(), getItem2());
		return returnString;
	}

	
}
