package com.mitrais.cdc.java.four;

public class PersonBalance {
	/**Defines the name of the person.**/
	private String name;
	
	/**Defines the balance owned by the person.**/
	private double balance;
	
	//todo:
	//- create constructor
	//- create setter/getter for the attributes/properties
	/**Primary Constructor. Sets the name and the balance.**/
	public PersonBalance(String name, double balance)
	{
		this.name = name;
		this.balance = balance;
	}

	/**Returns the name of the person.**/
	public String getName() {
		return name;
	}

	/**Sets the name of the person.**/
	public void setName(String name) {
		this.name = name;
	}

	/**Returns the balance.**/
	public double getBalance() {
		return balance;
	}

	/**Sets the name of the balance.**/
	public void setBalance(double balance) {
		this.balance = balance;
	}

	/**Prints the name and the balance of the person.**/
	public void printThis() {
		//Assume that the names are 7 characters or fewer
		//and the balances are less than $10M
		//TODO: create value that lined up like this
		//Juanita's bank account balance is $2,345,678.99.
		//   Juan's bank account balance is $   15,455.26.
		System.out.printf("%7s's bank account balance is $%,12.2f.%n", name, balance);
	}
}
