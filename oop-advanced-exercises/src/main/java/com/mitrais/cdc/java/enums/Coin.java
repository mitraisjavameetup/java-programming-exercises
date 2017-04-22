package com.mitrais.cdc.java.enums;

public enum Coin {
    HEADS, TAILS;
	
	/** Calculation to return head or tail*/
	 //TODO: Create calculation to return head or tail with equal probability
	public static Coin flip() {
		if(Math.random()<0.5){
			return Coin.TAILS;
		}
		else{
			return Coin.HEADS;
		}
	 
	
  }
	/**Main function */
	//TODO: later, create main class to call this method (e.g. looped 10 times)
	public static void main(String[] args) {
		for(int i=0; i<10; i++){
			System.out.println("This coin is "+ flip());
		}
	}
}
