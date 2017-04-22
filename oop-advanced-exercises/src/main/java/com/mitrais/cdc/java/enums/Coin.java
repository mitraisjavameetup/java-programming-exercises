package com.mitrais.cdc.java.enums;

public enum Coin {
    HEADS, TAILS;
	
	public static Coin flip() {

	  //TODO: Create calculation to return head or tail with equal probability
	  //TODO: later, create main class to call this method (e.g. looped 10 times) 
	  return values()[(int) (Math.random() * values().length)]; //replace this
  }
	
	/**
	 * main class to flip the coin 10 times
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(flip());
		}
	}
}
