package com.mitrais.cdc.java.four;

public class PersonBalance {
	private String name;
	private double balance;
	
	//todo:
	//- create constructor
	//- create setter/getter for the attributes/properties

	public PersonBalance(String string, double d) {
		this.name=string;
		this.balance=d;
		// TODO Auto-generated constructor stub
	}

	public void printThis() {
		//Assume that the names are 7 characters or fewer
		//and the balances are less than $10M
		//TODO: create value that lined up like this
		//Juanita's bank account balance is $2,345,678.99.
		//   Juan's bank account balance is $   15,455.26.
	System.out.printf("%9s's bank account balance is $%,12.2f. %n",name,balance );	
	}
}
