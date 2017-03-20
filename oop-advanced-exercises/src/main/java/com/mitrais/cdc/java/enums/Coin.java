package com.mitrais.cdc.java.enums;

import java.util.concurrent.ThreadLocalRandom;

public enum Coin {
	HEADS, TAILS;

	public static Coin flip() {
		int flipper = ThreadLocalRandom.current().nextInt(2);
		// TODO: Create calculation to return head or tail with equal
		// probability
		// TODO: later, create main class to call this method (e.g. looped 10
		// times)
		if (flipper == 0) {
			return Coin.HEADS;
		} else {
			return Coin.TAILS;
		}
	}
}
