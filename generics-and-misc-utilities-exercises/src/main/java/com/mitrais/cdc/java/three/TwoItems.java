package com.mitrais.cdc.java.three;

public class TwoItems<T> {
	// TODO: define two generic type here
	T item1;
	T item2;

	// TODO: define parameterized constructor here

	// TODO: define getter for those two items defined above

	// TODO: override toString method here
	
	@Override
	public String toString() {
		String returnString = new String();
		returnString = "TwoItems (item1=" + item1 + ", item2=" + item2 + ")";
		return returnString;
	}
/**
 * 
 * @return item 1
 */
	public T getItem1() {
		return item1;
	}
/**
 * make item1 as a generic type
 * @param item1
 */
	public void setItem1(T item1) {
		this.item1 = item1;
	}
/**
 * 
 * @return item2
 */
	public T getItem2() {
		return item2;
	}
/**
 * 
 * @param item2
 */
	public void setItem2(T item2) {
		this.item2 = item2;
	}
/**
 * generic type
 * @param item1
 * @param item2
 */
	public TwoItems(T item1, T item2) {
		super();
		this.item1 = item1;
		this.item2 = item2;
	}
}
