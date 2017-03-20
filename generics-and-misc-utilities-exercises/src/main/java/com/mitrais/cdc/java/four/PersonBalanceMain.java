package com.mitrais.cdc.java.four;
/**
 * 
 * @author Agus Mistiawan
 *	Test case for Class Person Balance
 */

public class PersonBalanceMain {
	public static void main(String[] args) {
		
		PersonBalance[] personBalanceArray = {new PersonBalance("Juanita", 2_345_678.99),
											  new PersonBalance("Juano", 156_780.26),
											  new PersonBalance("Juan", 15_455.26)};
		
		for (PersonBalance personBalance : personBalanceArray){
			personBalance.printThis();
		}
		
		//TODO: Trainer should run this class and check the output against this:
		//Juanita's bank account balance is $2,345,678.99.
		//  Juano's bank account balance is $  156,780.26.
		//   Juan's bank account balance is $   15,455.26.
	}
}
