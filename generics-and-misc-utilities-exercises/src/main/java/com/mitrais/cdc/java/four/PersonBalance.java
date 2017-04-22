package com.mitrais.cdc.java.four;

public class PersonBalance {
	private String name;
	private double balance;
	
	public PersonBalance(String name, double balance){
		this.name = name;
		this.balance = balance;
	}
	
	
	//todo:
	//- create constructor
	//- create setter/getter for the attributes/properties

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}


	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	public void printThis() {
		//Assume that the names are 7 characters or fewer
		//and the balances are less than $10M
		//TODO: create value that lined up like this
		//Juanita's bank account balance is $2,345,678.99.
		//   Juan's bank account balance is $   15,455.26.
		String nama = getName();
		double saldo = getBalance();
		System.out.printf("%7s's bank account balance is $%,12.2f%n",nama,saldo);
		
	}
}
