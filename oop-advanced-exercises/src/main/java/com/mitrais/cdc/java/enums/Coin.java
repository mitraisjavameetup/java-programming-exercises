package com.mitrais.cdc.java.enums;

public enum Coin {
    HEADS, TAILS;
	
	public static Coin flip() {
	
		//TODO: Create calculation to return head or tail with equal probability
		//TODO: later, create main class to call this method (e.g. looped 10 times) 
		double flipChance = Math.random();
		
		if (flipChance <= 0.5) return Coin.HEADS;
		else return Coin.TAILS;
	}
}
