package com.mitrais.cdc.java.four;

public class PersonBalance {
	private String name;
	private double balance;
	
	//to do:
	//- create constructor
	/** Constructor with parameter*/
	public PersonBalance(String name, double balance) {
		super();
		this.name = name;
		this.balance = balance;
	}
	
	//- create setter/getter for the attributes/properties
	/** Get the name*/
	public String getName() {
		return name;
	}

	/** Set the name*/
	public void setName(String name) {
		this.name = name;
	}

	/** Get the balance*/
	public double getBalance() {
		return balance;
	}

	/** Set the balance*/
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	/** Print out with printf */
	public void printThis() {
		//Assume that the names are 7 characters or fewer
		//and the balances are less than $10M
		//TODO: create value that lined up like this
		//Juanita's bank account balance is $2,345,678.99.
		//   Juan's bank account balance is $   15,455.26.
		System.out.printf("%7s's bank account balance is %,12.2f%n", name, balance);
		
	}


	
}
