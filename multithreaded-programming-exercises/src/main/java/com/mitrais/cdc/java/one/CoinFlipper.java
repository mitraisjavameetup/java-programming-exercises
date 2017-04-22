package com.mitrais.cdc.java.one;

import java.util.concurrent.ThreadLocalRandom;

public class CoinFlipper implements Runnable {
	
	@Override
	public void run() {
		// TODO: create 'for' loop 1000 times
		// and also place counter in it.
		// each time number in counter >= 3, print something like this:
		// "Pool-1-thread-1 got 3 heads in a row!!"
		// or like this"
		// "Pool-1-thread-2 got 5 heads in a row!!"
		int counter = 0;
		for (int i = 1; i <= 100; i++) {
			if (ThreadLocalRandom.current().nextInt(2) == 0) {
				counter++;
			} else {
				counter = 0;
			}
			
			if (counter >= 3) {
				System.out.println(Thread.currentThread().getName()+" got "+counter+" heads in a row!!");
			}
		}
	}
}