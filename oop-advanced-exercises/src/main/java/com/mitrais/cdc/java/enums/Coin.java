package com.mitrais.cdc.java.enums;
/**
 * 
 * @author Agus Mistiawan
 * @version 1.0.0
 *
 */
import java.util.Random;

public enum Coin {
    HEADS, TAILS;
	/**
	 * Random value, 0 is HEADS and 1 is TAILS
	 * @return enum(HEADS,TAILS)
	 */
	public static Coin flip() {
	  //TODO: Create calculation to return head or tail with equal probability
	  //TODO: later, create main class to call this method (e.g. looped 10 times)
		Random r = new Random();
		int random = r.nextInt((1-0)+1)+0;
		if(random<0.5)
			return Coin.HEADS; //replace this
		else
			return Coin.TAILS;
  }
	
	public static void main(String[] args) {
		for(int i=0; i<10; i++)
			System.out.println(Coin.flip());
	}
}
