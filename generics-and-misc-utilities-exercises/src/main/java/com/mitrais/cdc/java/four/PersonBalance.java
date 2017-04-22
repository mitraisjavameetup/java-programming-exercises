package com.mitrais.cdc.java.four;

public class PersonBalance {
	private String name;
	private double balance;
	
	//todo:
	//- create constructor
	//- create setter/getter for the attributes/properties
	
	/**
	 * Constructor of person balance class
	 * @param name
	 * @param balance
	 */
	public PersonBalance(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}
	
	/**
	 * Getter for name
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter for name
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Getter for balance
	 * @return balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * Setter of balance
	 * @param balance
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}

	/**
	 * Method for format printing name and balance
	 */
	public void printThis() {
		//Assume that the names are 7 characters or fewer
		//and the balances are less than $10M
		//TODO: create value that lined up like this
		//Juanita's bank account balance is $2,345,678.99.
		//   Juan's bank account balance is $   15,455.26.
		System.out.printf("%7s's bank account balance is $%,12.2f.%n",getName(),getBalance());
		
	}
}
