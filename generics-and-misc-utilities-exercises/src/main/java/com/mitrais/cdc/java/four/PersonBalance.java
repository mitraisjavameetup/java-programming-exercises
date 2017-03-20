package com.mitrais.cdc.java.four;

public class PersonBalance {
	private String name;
	private double balance;
	
	//todo:
	//- create constructor
	//- create setter/getter for the attributes/properties
	/**\
	 * 
	 * @param name
	 * @param balance
	 */
	public PersonBalance(String name,double balance) {
	this.name=name;
	this.balance=balance;
	}
	/**
	 * get name
	 * @return String
	 */
	public String getName() {
		return name;
	}
	/**
	 * set name
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * get balance
	 * @return double
	 */
	public double getBalance() {
		return balance;
	}
	/**
	 * set balance
	 * @param balance
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	/**
	 * print out person's bank account
	 */
	public void printThis() {
		System.out.printf("%7s's bank account balance is $%,12.2f.\n",name,balance );
		//Assume that the names are 7 characters or fewer
		//and the balances are less than $10M
		//TODO: create value that lined up like this
		//Juanita's bank account balance is $2,345,678.99.
		//   Juan's bank account balance is $   15,455.26.
		
	}
}
