package com.mitrais.cdc.java.four;
/**
 * 
 * @author trainee
 *
 */
public class PersonBalance {
	
	private String name;
	private double balance;
	
	//todo:
	//- create constructor
	//- create setter/getter for the attributes/properties
	

	public void printThis() {
		//Assume that the names are 7 characters or fewer
		//and the balances are less than $10M
		//TODO: create value that lined up like this
		//Juanita's bank account balance is $2,345,678.99.
		//   Juan's bank account balance is $   15,455.26.
		System.out.printf("%7s's Bank account Balance is $%,12.2f.%n",getName(), getBalance());
	}

	/**
	 * return to name on person balance
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * set a name as a string
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * return to balance on personBalance
	 * @return balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * set Balance as Void
	 * @param balance
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}

	/**
	 * cunstructor of Personbalance
	 * @param name
	 * @param balance
	 */
	public PersonBalance(String name, double balance) {
		super();
		this.name = name;
		this.balance = balance;
	}
}
