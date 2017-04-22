package com.mitrais.cdc.java.one;

public class CoinFlipper implements Runnable {
	/** Create loop 1000 times flip coins and print if counter more than 3*/
  @Override
  public void run() {
	//TODO: create 'for' loop 1000 times
	//and also place counter in it.
	//each time number in counter >= 3, print something like this:
	//"Pool-1-thread-1 got 3 heads in a row!!"
	//or like this"
	//"Pool-1-thread-2 got 5 heads in a row!!"
	int counterh = 0, countert = 0, counter = 1;
	for(int i=0; i<1000; i++){
		if(Math.random()<0.5){
			counterh++;
			countert = 0;
		}
		else{
			countert++;
			counterh = 0;
		}
		if(counterh >= 3){
			System.out.printf("%s got %s heads in a row!!%n",Thread.currentThread().getName(), counterh);
		}
		if(countert >= 3){
			System.out.printf("%s got %s tails in a row!!%n",Thread.currentThread().getName(), countert);

		}
	}

	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}