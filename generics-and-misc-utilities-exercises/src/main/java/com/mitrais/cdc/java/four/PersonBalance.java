package com.mitrais.cdc.java.four;

/**\
 * PersonBalance class
 * @author Egi
 *@version 1.0
 */
public class PersonBalance {
	private String name;
	private double balance;
	
	//todo:
	//- create constructor
	//- create setter/getter for the attributes/properties
	
	/**
	 * PersonBalance constructor
	 * @param name, balance
	 */
	public PersonBalance(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}
	
	/**
	 * Will return balance information of a person
	 */
	public void printThis() {
		//Assume that the names are 7 characters or fewer
		//and the balances are less than $10M
		//TODO: create value that lined up like this
		//Juanita's bank account balance is $2,345,678.99.
		//   Juan's bank account balance is $   15,455.26.
		System.out.printf("%7s's bank account balance is $%,12.2f%n", this.name, this.balance);
		
	}
}
