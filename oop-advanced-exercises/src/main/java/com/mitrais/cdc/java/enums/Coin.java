package com.mitrais.cdc.java.enums;

import java.util.Random;

public enum Coin {
    HEADS, TAILS;
	
	public static Coin flip(){
	Random randomNum = new Random();
		int result;
		
		
		result = randomNum.nextInt(2);
		
		if (result == 0 ){
			return Coin.HEADS;
		}
		
	else {
		return Coin.TAILS; 
		
	}
		
			
		
	  //TODO: Create calculation to return head or tail with equal probability
	  //TODO: later, create main class to call this method (e.g. looped 10 times) 
  }
	public static void main(String[]Args){
		for (int i = 0; i < 10; i++) {
			System.out.println(flip());
		}
		
		
	}
}
