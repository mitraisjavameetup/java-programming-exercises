package com.mitrais.cdc.java.three;

public class TwoItems<T> {

	//TODO: define parameterized constructor here
	private T t1,t2;

	//TODO: define getter for those two items defined above
	/** function to get value 1 **/
	public T getT1() {
		return t1;
	}
	/** function to set value 1 **/
	public void setT1(T t1) {
		this.t1 = t1;
	}
	/** function to get value 2 **/
	public T getT2() {
		return t2;
	}
	/** function to set value 2 **/
	public void setT2(T t2) {
		this.t2 = t2;
	}
	/** constructor with value 1 and value 2 parameters **/
	public TwoItems(T t1, T t2){
		this.t1 = t1;
		this.t2 = t2;
	}
	//TODO: define two generic type here
	/** function to get item 1 **/
	public <T> T getItem1(){
		return (T) getT1();
	}
	/** function to get item 2 **/
	public <T> T getItem2(){
		return (T) getT2();
	}
	
	//TODO: override toString method here
	@Override
	public String toString(){
		String returnString = new String();
		returnString = t1.toString() + ", " + t2.toString();
		
		return returnString;
	}
}
