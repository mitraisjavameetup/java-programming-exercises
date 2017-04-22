package com.mitrais.cdc.java.one;

import java.util.concurrent.*;

public class FlipCoins1 {
	public static void main(String[] args) {
		int poolSize = 10;
		// TODO: Instantiate ExcecutorService class with poolsize as stated
		// above
		ExecutorService exeserv = Executors.newFixedThreadPool(poolSize);

		// TODO execute the CoinFlipper 5 times (or several times) concurrently
		exeserv.execute(new CoinFlipper());
		exeserv.execute(new CoinFlipper());
		exeserv.execute(new CoinFlipper());
		exeserv.execute(new CoinFlipper());
		exeserv.execute(new CoinFlipper());
		
		// TODO: do not forget to shutdown the executor
		exeserv.shutdown();
		if (!exeserv.isTerminated()) {
			exeserv.shutdownNow();
		}
	}
}