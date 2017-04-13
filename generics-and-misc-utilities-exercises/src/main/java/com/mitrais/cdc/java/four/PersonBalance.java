package com.mitrais.cdc.java.four;

public class PersonBalance {
	private String name;
	private double balance;
	
	//todo:
	//- create constructor
	//- create setter/getter for the attributes/properties

	/** function to print bank acount balance **/
	public void printThis() {
		//Assume that the names are 7 characters or fewer
		//and the balances are less than $10M
		//TODO: create value that lined up like this
		//Juanita's bank account balance is $2,345,678.99.
		//   Juan's bank account balance is $   15,455.26.
		System.out.printf("%7s's bank acccount ballance is $%,12.2f.%n", name, balance);
	}

	

	/** constructor with name and balance argument  **/
	public PersonBalance(String name, double balance) {
		super();
		this.name = name;
		this.balance = balance;
	}


	/** function to get name **/
	public String getName() {
		return name;
	}

	/** function to set name **/
	public void setName(String name) {
		this.name = name;
	}

	/** function to get balance **/
	public double getBalance() {
		return balance;
	}

	/** function to set balance **/
	public void setBalance(double balance) {
		this.balance = balance;
	}
}
