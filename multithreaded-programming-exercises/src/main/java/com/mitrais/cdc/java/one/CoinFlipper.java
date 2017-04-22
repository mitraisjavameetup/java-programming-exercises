package com.mitrais.cdc.java.one;

/**
 * CoinFlipper that implements Runnable class for FlipCoins1
 * @author Egi
 * @version 1.0
 */
public class CoinFlipper implements Runnable {
  /**
   * Will output thread name, coin flip result, and counter
   */
  @Override
  public void run() {
	//TODO: create 'for' loop 1000 times
	//and also place counter in it.
	//each time number in counter >= 3, print something like this:
	//"Pool-1-thread-1 got 3 heads in a row!!"
	//or like this"
	//"Pool-1-thread-2 got 5 heads in a row!!"
	int counter = 0;
	String result = "", lastResult = "";
	
	for (int i = 0; i < 1000; i++) {
		if (Math.random() < 0.5) {
			result = "heads";
		} else {
			result = "tails";
		}
		
		if (result == lastResult) {
			counter++;
			if (counter >= 3) {
				System.out.printf("%s got %s %s in a row!!%n", Thread.currentThread().getName(), counter, result);
			}
		} else {
			counter = 0;
		}
		
		lastResult = result;
	}
  }
}