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
	int counter = 0;
	for (int x = 0; x < 1000; x++)
	{
		if (Math.random() >= 0.5)
			counter++;
		else
			counter = 0;
		
		if (counter >= 3)
			System.out.println(Thread.currentThread().getName() + " has got " + counter + " consecutive heads!");
	}
  }
}