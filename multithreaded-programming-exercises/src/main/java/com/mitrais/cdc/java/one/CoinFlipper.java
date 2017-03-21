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
	  boolean coin; //True = Head, false = Tail
	  int countHead=0;
	  int countTail=0;
	  String threadName = Thread.currentThread().getName();
	  for (int i = 1; i <= 1000; i++) {
		System.out.println(threadName+" Counter="+i);
		if (Math.random()<0.5) {
			coin = true;
			countHead++;
			countTail=0;
		}
		else {
			coin = false;
			countTail++;
			countHead=0;
		}
		if (countHead>=3) {
			System.out.println(threadName+" got "+countHead+" in a row");
		}else if (countTail>=3) {
			System.out.println(threadName+" got "+countTail+" in a row");
		}
		
	  }	  
  }
}