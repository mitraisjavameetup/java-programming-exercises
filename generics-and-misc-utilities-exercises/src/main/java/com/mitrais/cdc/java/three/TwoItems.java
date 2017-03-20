package com.mitrais.cdc.java.three;

public class TwoItems<T> {
	
	private T item1;
	private T item2;

	public TwoItems(T item1,T item2) {
		this.item1 = item1;
		this.item2 = item2;
	}
	
	
	
	//TODO: define two generic type here

	//TODO: define parameterized constructor here

	//TODO: define getter for those two items defined above
	

	public T getItem1() {
		return item1;
	}


	public T getItem2() {
		return item2;
	}



	//TODO: override toString method here
	@Override
	public String toString(){
		String returnString = new String();
		
		StringBuilder result = new StringBuilder();
		result.append(getItem1()).append(" and ").append(getItem2());
		returnString = result.toString();
		return returnString;
	}

}
