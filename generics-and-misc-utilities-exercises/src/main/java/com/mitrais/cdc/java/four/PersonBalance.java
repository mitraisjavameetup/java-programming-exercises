package com.mitrais.cdc.java.four;

public class PersonBalance {
	private String name;
	private double balance;
	
	//todo:
	//- create constructor
	//- create setter/getter for the attributes/properties
	/**
	 * print bank account balance with requested format
	 */
	public void printThis() {
		//Assume that the names are 7 characters or fewer
		//and the balances are less than $10M
		//TODO: create value that lined up like this
		//Juanita's bank account balance is $2,345,678.99.
		//   Juan's bank account balance is $   15,455.26.
		System.out.printf("%7s's bank account balance is $%,12.2f%n", this.name, this.balance);
		
	}
	/**
	 * getter for name
	 * @return
	 */
	public String getName() {
		return name;
	}
	/**
	 * setter for name
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * getter for balance
	 * @return
	 */
	public double getBalance() {
		return balance;
	}
	/**
	 * setter for balance
	 * @param balance
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	/**
	 * parameterized constructor
	 * @param name
	 * @param balance
	 */
	public PersonBalance(String name, double balance) {
		super();
		this.name = name;
		this.balance = balance;
	}
	
}
