package com.mitrais.cdc.java.three;

public class TwoItems<T> {
	//TODO: define two generic type here
	private T Item1, Item2;
	//TODO: define parameterized constructor here
	public TwoItems(T a, T b) {
		this.Item1 = a;
		this.Item2 = b;
	}
	//TODO: define getter for those two items defined above
	public T getItem1() {
		return Item1;
	}

	public T getItem2() {
		return Item2;
	}
	//TODO: override toString method here
	@Override
	public String toString() {
		return Item1 + ", " + Item2;
	}


}
