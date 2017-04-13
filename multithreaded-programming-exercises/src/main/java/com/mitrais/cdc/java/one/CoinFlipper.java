package com.mitrais.cdc.java.one;

import java.util.Iterator;

public class CoinFlipper implements Runnable {
  @Override
  public void run() {
	//TODO: create 'for' loop 1000 times
	//and also place counter in it.
	//each time number in counter >= 3, print something like this:
	//"Pool-1-thread-1 got 3 heads in a row!!"
	//or like this"
	//"Pool-1-thread-2 got 5 heads in a row!!"  
	  boolean coin;
	  int heads = 0;
	  int tails = 0;
	  for (int i = 0; i < 1000; i++) {
		if(Math.random() > 0.5){
			coin = true;
			heads++;
			tails = 0;
		}
		else {
			coin = false;
			heads = 0;
			tails++;
		}
		if (heads >= 3) {
			System.out.println(Thread.currentThread().getName() + " got " + heads + "heads in a row!!");
		}else if (tails >= 3) {
			System.out.println(Thread.currentThread().getName() + " got " + tails + "heads in a row!!");
		}
		
		


	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
	  }
  }
