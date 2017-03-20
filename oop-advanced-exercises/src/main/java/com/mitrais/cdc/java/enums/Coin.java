package com.mitrais.cdc.java.enums;

public enum Coin {
    HEADS, TAILS;

	public static Coin flip() {
		double hasil = Math.round(Math.random());
		if(hasil==1)
			return Coin.HEADS;
		else
			return Coin.TAILS;
	  //TODO: Create calculation to return head or tail with equal probability
	  //TODO: later, create main class to call this method (e.g. looped 10 times) 
	   //replace this
	}
	
	public static void main(String[] args){
		for(int i=0;i<10;i++){
			System.out.println(Coin.flip());
		}
	}
}
