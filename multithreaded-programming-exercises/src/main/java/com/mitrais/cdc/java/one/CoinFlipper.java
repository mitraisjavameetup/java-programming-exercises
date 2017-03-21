package com.mitrais.cdc.java.one;

public class CoinFlipper implements Runnable {

	private int consecutive;

	@Override
	public void run() {
		// TODO: create 'for' loop 1000 times
		// and also place counter in it.
		// each time number in counter >= 3, print something like this:
		// "Pool-1-thread-1 got 3 heads in a row!!"
		// or like this"
		// "Pool-1-thread-2 got 5 heads in a row!!"
		int rand = 0;
		for (int i = 0; i < 1000; i++) {
			rand = ((int) (Math.random() * 10));
			if(rand % 2 == 0) {
				consecutive++;
			} else {
				if(consecutive >= 3) {
					System.out.println(Thread.currentThread().getName() + " has " + consecutive + " head in a row");
				}
				
				consecutive = 0;
			}
		}
	}
}