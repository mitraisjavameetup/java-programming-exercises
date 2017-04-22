package com.mitrais.cdc.java.enums;

public enum Coin {
    HEADS, TAILS;
	
	public static Coin flip() {
		int r = (int) Math.round(Math.random());
		
	  //TODO: Create calculation to return head or tail with equal probability
	  //TODO: later, create main class to call this method (e.g. looped 10 times) 
	  return (r == 0) ? Coin.HEADS : Coin.TAILS; //replace this
  }
}
