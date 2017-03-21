package com.mitrais.cdc.java.one;

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
		for (int i = 0; i < 1000; i++) {
			double random = Math.random();
			if(random>0.5){
				counter++;
				if(counter>=3){
					System.out.printf("Pool-1-thread-%s got %s heads in a row!!%n",Thread.currentThread().getName(),counter);
				}
				System.out.printf("Pool-1-thread-%s got head%n",Thread.currentThread().getName());
			}else{
				counter=0;
				System.out.printf("Pool-1-thread-%s got tail%n",Thread.currentThread().getName());
			}
		}

	}
}