package com.mitrais.cdc.java.three;

import java.util.List;

public class TwoItems<T> {
	//TODO: define two generic type here

	//TODO: define parameterized constructor here

	//TODO: define getter for those two items defined above
	
	//TODO: override toString method here
	private T item1;
	private T item2;
	
	public TwoItems(T item1, T item2){
		this.item1 = item1;
		this.item2 = item2;
	}
	
	
	/**
	 * @return the item1
	 */
	public T getItem1() {
		return item1;
	}


	/**
	 * @return the item2
	 */
	public T getItem2() {
		return item2;
	}


	@Override
	public String toString(){
		String returnString = new String();
		return returnString;
	}
}
