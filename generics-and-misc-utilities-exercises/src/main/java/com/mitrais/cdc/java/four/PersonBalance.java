package com.mitrais.cdc.java.four;
/**
 * 
 * @author Agus Mistiawan
 *
 */

public class PersonBalance {
	private String name;
	private double balance;
	
	//todo:
	//- create constructor
	/**
	 * Will set name and balance
	 * @param name String
	 * @param balance double
	 */
	public PersonBalance(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}
	//- create setter/getter for the attributes/properties
	/**
	 * Will print name and acount balance align right
	 */
	public void printThis() {
		//Assume that the names are 7 characters or fewer
		//and the balances are less than $10M
		//TODO: create value that lined up like this
		//Juanita's bank account balance is $2,345,678.99.
		//   Juan's bank account balance is $   15,455.26.
		System.out.printf("%7s's bank account balance is $%,12.2f%n",name, balance);
		
	}
	/**
	 * will return name
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * will set name
	 * @param name String
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Will return balance
	 * @return balance
	 */
	public double getBalance() {
		return balance;
	}
	/**
	 * will set balance
	 * @param balance String
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
}
