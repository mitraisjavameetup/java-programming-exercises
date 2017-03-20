package com.mitrais.cdc.java.three;

public class TwoItems<T> {
	//TODO: define two generic type here
	private T item1;
	private T item2;

	//TODO: define parameterized constructor here
	/**
	 * @param item1
	 * @param item2
	 */
	public TwoItems(T item1, T item2) {
		super();
		this.item1 = item1;
		this.item2 = item2;
	}

	//TODO: define getter for those two items defined above	
	/**
	 * @return the item1
	 */
	public T getItem1() {
		return item1;
	}

	/**
	 * @param item1 the item1 to set
	 */
	public void setItem1(T item1) {
		this.item1 = item1;
	}

	/**
	 * @return the item2
	 */
	public T getItem2() {
		return item2;
	}

	/**
	 * @param item2 the item2 to set
	 */
	public void setItem2(T item2) {
		this.item2 = item2;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TwoItems [item1=" + item1 + ", item2=" + item2 + "]";
	}

//	
//	//TODO: override toString method here
//	@Override
//	public String toString(){
//		String returnString = new String();
//		
//		
//		
//		return returnString;
//	}

	
}
