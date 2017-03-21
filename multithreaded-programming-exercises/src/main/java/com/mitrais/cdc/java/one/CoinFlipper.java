package com.mitrais.cdc.java.one;

import java.util.concurrent.ExecutorService;

public class CoinFlipper implements Runnable {
  @Override
  public void run() {
	//TODO: create 'for' loop 1000 times
	//and also place counter in it.
	//each time number in counter >= 3, print something like this:
	//"Pool-1-thread-1 got 3 heads in a row!!"
	//or like this"
	//"Pool-1-thread-2 got 5 heads in a row!!"
	int counter = 0;
	
	for (int i = 0; i < 1000; i++) {
		double random;
		random = Math.random();
		if(random < 0.5){
			counter ++;
		}else{
			if(counter >= 3){
				System.out.println(Thread.currentThread().getName() + " got " + counter+" in a row");
				counter = 0;
			}
		}
	}  
  }
}
