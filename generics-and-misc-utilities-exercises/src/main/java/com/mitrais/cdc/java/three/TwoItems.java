package com.mitrais.cdc.java.three;

public class TwoItems<T> {
	//TODO: define two generic type here
	private T item1;
	private T item2;
	//TODO: define parameterized constructor here
	/**
	 * constructor for Generik Paramter
	 * @param item1 T
	 * @param item2 T
	 */
	public TwoItems(T item1,T item2) {
		this.item1 = item1;
		this.item2 = item2;
	}

	//TODO: define getter for those two items defined above
	
	//TODO: override toString method here
	/**
	 * Override method using String Builder
	 */
	@Override
	public String toString(){
		String returnString = new String();
		StringBuilder string = new StringBuilder();
		string.append(item1);
		string.append(item2);
		returnString = string.toString();
		return returnString;
	}
	/**
	 * Will return item1 T
	 * @return item1
	 */
	public T getItem1() {
		return item1;
	}
	/**
	 * WIll set item1
	 * @param item1 T
	 */
	public void setItem1(T item1) {
		this.item1 = item1;
	}
	/**
	 * Will return item2 T
	 * @return item2
	 */
	public T getItem2() {
		return item2;
	}
	/**
	 * WIll set item2
	 * @param item2 T
	 */
	public void setItem2(T item2) {
		this.item2 = item2;
	}

	

}
