package com.mitrais.cdc.java.four;

public class PersonBalance {
	private String name;
	private double balance;

	// todo:
	// - create constructor
	// - create setter/getter for the attributes/properties

	public PersonBalance(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}

	public void printThis() {
		// Assume that the names are 7 characters or fewer
		// and the balances are less than $10M
		// TODO: create value that lined up like this
		// Juanita's bank account balance is $2,345,678.99.
		// Juan's bank account balance is $ 15,455.26.
		System.out.println(String.format("%1$7s's bank account balance is $%2$,12.2f.", name, balance));
	}
}
