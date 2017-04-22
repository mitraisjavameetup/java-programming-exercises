package com.mitrais.cdc.java.three;

public class TwoItems<T> {
	//TODO: define two generic type here
	/**First Item**/
	private T item1;
	
	/**Second Item**/
	private T item2;

	//TODO: define parameterized constructor here
	/**Default Constructor**/
	public TwoItems(T item1, T item2)
	{
		this.item1 = item1;
		this.item2 = item2;
	}

	//TODO: define getter for those two items defined above
	/**Returns the first item.**/
	public T getItem1() {
		return item1;
	}

	/**Returns the second item.**/
	public T getItem2() {
		return item2;
	}
	
	//TODO: override toString method here
	@Override
	public String toString(){
		String returnString = "Item 1: " + item1 + ". Item 2: " + item2;
		return returnString;
	}
}
