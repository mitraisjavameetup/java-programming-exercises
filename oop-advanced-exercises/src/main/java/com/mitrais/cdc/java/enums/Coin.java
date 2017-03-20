package com.mitrais.cdc.java.enums;

public enum Coin {
    HEADS, TAILS;
	
	public static Coin flip() {
		Coin c;
		if (Math.random() < 0.5) {
			c = Coin.HEADS;
		}
		else 
			c = Coin.TAILS;
		
		return c;
	}
	  //TODO: Create calculation to return head or tail with equal probability
	 
	
	public static void main(String[] args) {
		for (int i= 0; i < 10; i++) {
			System.out.println(Coin.flip());
		}
	//TODO: later, create main class to call this method (e.g. looped 10 times) 
	  
  }
}
