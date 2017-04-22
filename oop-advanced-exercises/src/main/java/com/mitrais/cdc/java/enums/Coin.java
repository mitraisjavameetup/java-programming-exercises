package com.mitrais.cdc.java.enums;

public enum Coin {
    HEADS, TAILS;
	
	public static Coin flip() {
int a = 0;
	  //TODO: Create calculation to return head or tail with equal probability
	  //TODO: later, create main class to call this method (e.g. looped 10 times) 
	  for (int i = 0; i < 10; i++) {
		a=a+3;
		if (a%2==1) {
			return Coin.HEADS;
		} else {
			return Coin.TAILS;
		}
	}
	   //replace this
	return null;
	  
  }
}
