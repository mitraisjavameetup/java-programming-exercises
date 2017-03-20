package com.mitrais.cdc.java.three;

public class TwoItems<T> {
	//TODO: define two generic type here
	private T item1,item2;
	
	/**
	 * 
	 * @param item1
	 * @param item2
	 */
	//TODO: define parameterized constructor here
	public TwoItems(T item1,T item2){
		this.item1=item1;
		this.item2=item2;
	}
	//TODO: define getter for those two items defined above
	/**
	 * get item1
	 * @return item1
	 */
	public T getItem1() {
		return item1;
	}
	/**
	 * set item1
	 * @param item1
	 */
	public void setItem1(T item1) {
		this.item1 = item1;
	}
	/**
	 * get item2
	 * @return item2
	 */
	public T getItem2() {
		return item2;
	}
	/**
	 * set item2
	 * @param item2
	 */
	public void setItem2(T item2) {
		this.item2 = item2;
	}
	//TODO: override toString method here
	/**
	 * overrided toString() method
	 */
	@Override
	public String toString(){
		String returnString = new String();
		returnString=new StringBuilder().append("item1=").append(item1).append(" item2=").append(item2).toString();
		return returnString;
	}
}
