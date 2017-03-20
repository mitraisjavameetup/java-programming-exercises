package com.mitrais.cdc.java.enums;

public enum Coin {
	HEADS, TAILS;

	public static Coin flip() {
		if(Math.random()>0.5){
			//TODO: Create calculation to return head or tail with equal probability
			//TODO: later, create main class to call this method (e.g. looped 10 times) 
			return Coin.HEADS; //replace this
		}
		else{
			return Coin.TAILS;
		}
	}
	public static void main(String[] args) {
		for(int i =0; i<10; i++){
			System.out.println("what is coin surface ? " + flip());
		}
	}
}
