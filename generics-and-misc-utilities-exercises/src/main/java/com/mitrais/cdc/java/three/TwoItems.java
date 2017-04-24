package com.mitrais.cdc.java.three;

public class TwoItems<T> {
	//TODO: define two generic type here
	T name;	
	T name2;
	
	//TODO: define parameterized constructor here
	public TwoItems(T name, T name2)
	{
		this.name=name;
		this.name2=name2;
	
	}
	
	//TODO: define getter for those two items defined above
	public T getItem1() {
		return name;
	}

	public T getItem2() {
		return name2;
	}
	
	//TODO: override toString method here
	@Override
	public String toString(){
		String returnString = new String();
		returnString = "First Item : "+name+" SecondItem :"+name2;
		return returnString;
	}
}
