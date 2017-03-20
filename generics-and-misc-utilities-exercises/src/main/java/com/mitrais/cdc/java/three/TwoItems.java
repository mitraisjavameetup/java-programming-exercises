package com.mitrais.cdc.java.three;
/**
 * 
 * @author mitrais
 * @version 1.0
 * TwoItems class
 */
public class TwoItems<T> {
	//TODO: define two generic type here
	T item1, item2;

	//TODO: define parameterized constructor here
	
	public TwoItems(T item1, T item2){
		this.item1 = item1;
		this.item2 = item2;
	}

	//TODO: define getter for those two items defined above
	
	public T getItem1(){
		return item1;
	}
	
	public T getItem2(){
		return item2;
	}
	//TODO: override toString method here	
	
	@Override
	public String toString(){
		String returnString = new String();
		
		returnString = String.format("item1 is %s and item2 is %s", item1, item2);
		
		return returnString;
	}
}
