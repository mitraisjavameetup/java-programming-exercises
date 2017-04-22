package com.mitrais.cdc.java.three;

/**
 * 
 * @author trainee
 *TwoItems that stores two entries of a given type and has getter methods to retrieve them
 * @param <T>
 */
public class TwoItems<T> {
	//TODO: define two generic type here
	private T item1;
	private T item2;

	/**
	 * TwoItems class constructor
	 * @param item1
	 * @param item2
	 */
	//TODO: define parameterized constructor here
	public TwoItems(T item1, T item2) {
		this.item1 = item1;
		this.item2 = item2;
	}
	
	/**
	 * Will return item1
	 * @return item1
	 */
	//TODO: define getter for those two items defined above
	public T getItem1() {
		return item1;
	}

	/**
	 * Will return item2
	 * @return item2
	 */
	public T getItem2() {
		return item2;
	}
	
	/**
	 * Will return information of the elements
	 * @return returnString
	 */
	//TODO: override toString method here
	@Override
	public String toString(){
		String returnString = new String();
		
		returnString = String.format("The items are %s and %s", this.item1, this.item2);
				
		return returnString;
	}
}
