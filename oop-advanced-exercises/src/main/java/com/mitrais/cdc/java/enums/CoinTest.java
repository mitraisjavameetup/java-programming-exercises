package com.mitrais.cdc.java.enums;

public class CoinTest {
	public static void main(String[] args) {
		Coin coin = Coin.HEADS;
		for (int i = 0; i < 10; i++) {
			System.out.println(coin.flip());
		}
	}
}
