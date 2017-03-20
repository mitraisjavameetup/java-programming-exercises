package com.mitrais.cdc.java.enums;

public class CoinTest {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Coin coin = Coin.flip();
			System.out.println(coin);
		}
	}

}
