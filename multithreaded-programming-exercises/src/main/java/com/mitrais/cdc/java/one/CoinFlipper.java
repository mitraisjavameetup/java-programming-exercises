package com.mitrais.cdc.java.one;

import java.util.Random;

public class CoinFlipper implements Runnable {
	@Override
	public void run() {
		//TODO: create 'for' loop 1000 times
		//and also place counter in it.
		//each time number in counter >= 3, print something like this:
		//"Pool-1-thread-1 got 3 heads in a row!!"
		//or like this"
		//"Pool-1-thread-2 got 5 heads in a row!!"\
		int counter = 0;
		for (int i = 0; i < 1000; i++) {
			String threadName = Thread.currentThread().getName();
			String [] coin = {"HEADS", "TAILS"};
			Random random = new Random();
			int select = random.nextInt(coin.length);
			switch (select) {
			case 0:
				counter++;
				if(counter >=3 ){
					System.out.printf("%s got %s %s in a row%n", threadName, counter, coin[select]);
				}
				
				break;
			default:
				counter = 0;
				break;
			}
		}
	}
}