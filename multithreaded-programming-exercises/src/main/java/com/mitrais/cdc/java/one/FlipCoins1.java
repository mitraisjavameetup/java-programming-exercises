package com.mitrais.cdc.java.one;

import java.util.concurrent.*;

public class FlipCoins1 {
	public static void main(String[] args) {
		int poolSize = 10;
		ExecutorService tasks = Executors.newFixedThreadPool(poolSize);

		// TODO: Instantiate ExcecutorService class with poolsize as stated
		// above
		for (int i = 0; i < 5; i++) {
			tasks.execute(new CoinFlipper());
		}
		tasks.shutdown();

		// TODO execute the CoinFlipper 5 times (or several times) concurrently

		// TODO: do not forget to shutdown the executor

	}
}