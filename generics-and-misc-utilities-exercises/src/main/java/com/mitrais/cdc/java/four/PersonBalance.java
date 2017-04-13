package com.mitrais.cdc.java.four;


public class PersonBalance {
	private String name;
	private double balance;
	
	/** Method to set the name and balance
	 * @param name, balance
	 */
	public PersonBalance(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}
	
	//todo:
	//- create constructor
	//- create setter/getter for the attributes/properties
	
	/** Method to get the name
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/** Method to set the name
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/** Method to get the balance
	 * @return balance
	 */
	public double getBalance() {
		return balance;
	}

	/** Method to set the balance
	 * @param balance
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	/** Method to print
	 */
	public void printThis() {
		System.out.printf("%7s"+ "'s bank account balance is " + "$%,12.2f.%n", getName(), getBalance());
		
		//Assume that the names are 7 characters or fewer
		//and the balances are less than $10M
		//TODO: create value that lined up like this
		//Juanita's bank account balance is $2,345,678.99.
		//   Juan's bank account balance is $   15,455.26.
		
	}
}
