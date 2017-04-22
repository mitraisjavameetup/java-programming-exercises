package com.mitrais.cdc.java.enums;

import java.util.Random;

public enum Coin {
    HEADS, TAILS;
	
	public static Coin flip() {
		Random r = new Random();
	  //TODO: Create calculation to return head or tail with equal probability
	  //TODO: later, create main class to call this method (e.g. looped 10 times) 
		if(r.nextInt(2)<0.5){
			return Coin.HEADS;
		}
		else{
			return Coin.TAILS;
		}
	  
  }
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(flip());
		}
	}
}
