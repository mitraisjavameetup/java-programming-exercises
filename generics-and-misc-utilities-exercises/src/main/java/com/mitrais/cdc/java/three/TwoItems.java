package com.mitrais.cdc.java.three;

public class TwoItems<T> {
	//TODO: define two generic type here

	//TODO: define parameterized constructor here

	//TODO: define getter for those two items defined above
	
	//TODO: override toString method here
	
	private T item2;
	private T item1;
	
	public TwoItems(T item1, T item2){
		this.item1=item1;
		this.item2=item2;
		
	}
	
	public T getItem2() {
		return item2;
	}

	public T getItem1() {
		return item1;
	}

	@Override
	public String toString(){
		String returnString = new String();
		
		
		
		return returnString;
	}
}
