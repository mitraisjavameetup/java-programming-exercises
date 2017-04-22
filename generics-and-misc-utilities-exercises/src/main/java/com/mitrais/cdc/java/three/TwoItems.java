package com.mitrais.cdc.java.three;

public class TwoItems<T> {
	//TODO: define two generic type here
	private T t1;
	private T t2;

	//TODO: define parameterized constructor here
	/**
	 * Constructor with t1 and t2 parameter
	 * @param t1
	 * @param t2
	 */
	public TwoItems(T t1, T t2) {
		super();
		this.t1 = t1;
		this.t2 = t2;
	}
	//TODO: define getter for those two items defined above
	/**
	 * getter for t1
	 * @return
	 */
	public T getItem1() {
		return t1;
	}
	/**
	 * getter for t2
	 * @return
	 */
	public T getItem2() {
		return t2;
	}

	//TODO: override toString method here
	@Override
	public String toString(){
		return " "+getItem1()+" & "+getItem2();
	}

}
