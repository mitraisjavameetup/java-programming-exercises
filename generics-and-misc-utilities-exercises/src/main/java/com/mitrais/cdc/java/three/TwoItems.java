package com.mitrais.cdc.java.three;

public class TwoItems<T> {
	//TODO: define two generic type here

	//TODO: define parameterized constructor here

	//TODO: define getter for those two items defined above
	
	//TODO: override toString method here
	
	private T Item1;
	private T Item2;
	
	public TwoItems(T item1, T item2) {
		Item1 = item1;
		Item2 = item2;
	}
	
	public T getItem1() {
		return Item1;
	}

	public T getItem2() {
		return Item2;
	}

	@Override
	public String toString() {
		return getItem1() + ", " + getItem2() ;
	}

	
}
