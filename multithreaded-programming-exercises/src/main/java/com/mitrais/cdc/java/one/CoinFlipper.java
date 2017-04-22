package com.mitrais.cdc.java.one;

public class CoinFlipper implements Runnable {
  @Override
  public void run() {
	//TODO: create 'for' loop 1000 times
	//and also place counter in it.
	//each time number in counter >= 3, print something like this:
	//"Pool-1-thread-1 got 3 heads in a row!!"
	//or like this"
	//"Pool-1-thread-2 got 5 heads in a row!!"
	int count = 0;
	for (int i = 0; i < 1000; i++) {
		int r = (int) Math.round(Math.random());
		if(r == 0) count++; else count = 0;
		if(count >= 3) System.out.printf("%s got %s heads in a row!!\n", Thread.currentThread().getName(), count);
	} 
  }
}