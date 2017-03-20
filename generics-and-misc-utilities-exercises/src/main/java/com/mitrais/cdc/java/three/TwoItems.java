package com.mitrais.cdc.java.three;

public class TwoItems<T> {
	
	T item1;
	T item2;
	//TODO: define two generic type here
	/** Constructor of TwoItems
	 * @param item1, item2
	 */
	public TwoItems(T item1, T item2) {
		this.item1 = item1;
		this.item2 = item2;
	}
	//TODO: define parameterized constructor here
	/** Method to get item1
	 * @return item1
	 */
	public T getItem1() {
		return item1;
	}

	/** Method to set item1
	 * @param item1
	 */
	public void setItem1(T item1) {
		this.item1 = item1;
	}

	/** Method to get item2
	 * @return item2
	 */
	public T getItem2() {
		return item2;
	}

	/** Method to set item2
	 * @param item2
	 */
	public void setItem2(T item2) {
		this.item2 = item2;
	}
	//TODO: define getter for those two items defined above
	
	/** Method to get overall value of item1 and item2
	 * @return String of TwoItems
	 */
	@Override
	public String toString() {
		return "TwoItems [item1=" + item1 + ", item2=" + item2 + "]";
	}


	
}
