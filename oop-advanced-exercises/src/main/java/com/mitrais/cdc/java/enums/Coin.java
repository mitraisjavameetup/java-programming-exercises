package com.mitrais.cdc.java.enums;


/**
 * Coin enum with instances named HEADS and TAILS
 **/
public enum Coin {
    HEADS, TAILS;
	
	/**
	 * Static method that will return coin flip result
	 **/
	public static Coin flip() {
	  //TODO: Create calculation to return head or tail with equal probability
	  //TODO: later, create main class to call this method (e.g. looped 10 times)
	  double flip = Math.random();
	  
	  if (flip <= 0.5) {
		  return Coin.HEADS;
	  } else {
		  return Coin.TAILS;
	  }
  }
}
