package com.mitrais.cdc.java.enums;

import java.util.Random;

public enum Coin {
    HEADS, TAILS;
	/**
	 * method to random coin
	 * @return Coin
	 * 
	 */
	public static Coin flip() {
		double flip=Math.random();
	  //TODO: Create calculation to return head or tail with equal probability
		if(flip<=0.5)return Coin.HEADS;
		else return Coin.TAILS;
	  //TODO: later, create main class to call this method (e.g. looped 10 times)  
  }
}
