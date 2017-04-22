package com.mitrais.cdc.java.enums;

public enum Coin {
    HEADS, TAILS;
	
	public static Coin flip() {
		double random;
		random = Math.random();
		if(random < 0.5){
			return Coin.HEADS;
		}else{
			return Coin.TAILS;
		}
  }
	
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Coin.flip();
		}
	}
	
}
