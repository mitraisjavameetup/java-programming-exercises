package com.mitrais.cdc.java.three;

public class TwoItems<T>{
	//TODO: define two generic type here
	private T t;
	private T t2;
	
	//TODO: define parameterized constructor here
	public TwoItems(T t, T t2) {
		// TODO Auto-generated constructor stub
		this.t = t;
		this.t2 = t2;
	}
	
	//TODO: define getter for those two items defined above
	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	public T getT2() {
		return t2;
	}

	public void setT2(T t2) {
		this.t2 = t2;
	}
	
	public T getItem1(){
		return t;
	}
	
	public T getItem2(){
		return t2;
	}

	//TODO: override toString method here
	@Override
	public String toString(){
		String returnString = new String();
		returnString = getItem1() + ", " + getItem2();		
		return returnString;
	}
}
