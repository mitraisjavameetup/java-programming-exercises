package com.mitrais.cdc.java.three;

public class TwoItems<T> {
	// TODO: define two generic type here
	T item1;
	T item2;

	/**
	 * Constructor fo TwoItems Class
	 * @param item1
	 * @param item2
	 */
	// TODO: define parameterized constructor here
	public TwoItems(T item1, T item2) {
		this.item1 = item1;
		this.item2 = item2;
	}
	// TODO: define getter for those two items defined above
	/**
	 * Getter of item 1
	 * @return item1
	 */
	public T getItem1() {
		return item1;
	}

	/**
	 * Setter of item 1
	 * @param item1
	 */
	public void setItem1(T item1) {
		this.item1 = item1;
	}
	/**
	 * Getter of item2
	 * @return item2
	 */
	public T getItem2() {
		return item2;
	}

	/**
	 * Setter of item2
	 * @param item2
	 */
	public void setItem2(T item2) {
		this.item2 = item2;
	}

	// TODO: override toString method here
	/**
	 * Method toString for variable item1 and item2
	 * @return string of item 1 and item 2
	 */
	@Override
	public String toString() {
		String returnString = new String();
		returnString = "TwoItems (item1=" + item1 + ", item2=" + item2 + ")";
		return returnString;
	}
}
